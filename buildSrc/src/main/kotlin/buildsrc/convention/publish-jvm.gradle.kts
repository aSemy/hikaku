package buildsrc.convention

import org.gradle.kotlin.dsl.invoke

plugins {
  id("buildsrc.convention.subproject")
  `java-library`
  `maven-publish`
  signing
}

java {
  withSourcesJar()
  withJavadocJar()
}

publishing {
  publications {
    create<MavenPublication>("mavenJava") {
//      artifactId = projectArtifactId

      from(components["java"])
      versionMapping {
        usage("java-api") {
          fromResolutionOf("runtimeClasspath")
        }
        usage("java-runtime") {
          fromResolutionResult()
        }
      }

      pom {
//        name.set(projectArtifactId)
        url.set("https://github.com/codecentric/hikaku")
        packaging = "jar"
        licenses {
          license {
            name.set("Apache License, Version 2.0")
            url.set("http://www.apache.org/licenses/LICENSE-2.0")
          }
        }
        developers {
          developer {
            id.set("cc-jhr")
            name.set("Jannes Heinrich")
            email.set("34243889+cc-jhr@users.noreply.github.com")
          }
          developer {
            id.set("lmller")
            name.set("Lovis Möller")
            email.set("lovis.moeller@codecentric.de")
          }
        }
        scm {
          connection.set("scm:git:git://github.com/codecentric/hikaku.git")
          developerConnection.set("scm:git:ssh://git@github.com:codecentric/hikaku.git")
          url.set("https://github.com/codecentric/hikaku")
        }
      }
    }
  }
  repositories {
    maven {
      name = "ossrh"
      val releasesRepoUrl = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
      val snapshotsRepoUrl = uri("https://oss.sonatype.org/content/repositories/snapshots/")
      url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
    }
  }
}

signing {
  sign(publishing.publications["mavenJava"])
}

tasks.javadoc {
  if (JavaVersion.current().isJava9Compatible) {
    (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
  }
}
