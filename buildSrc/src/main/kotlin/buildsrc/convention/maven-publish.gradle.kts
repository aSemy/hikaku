package buildsrc.convention

import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.invoke

plugins {
  id("buildsrc.convention.subproject")
  `maven-publish`
  signing
}

publishing {
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
  val signingKeyId: String? by project
  val signingKey: String? by project
  val signingPassword: String? by project
  useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
  setRequired(false) // TODO re-enable maven publish signing
}

// if this convention is applied to a Java project, publish the Java component
plugins.withType<JavaPlugin> {
  val publication = publishing.publications.create<MavenPublication>("mavenJava") {
    from(components["java"])
    hikakuPom()
    versionMapping {
      usage("java-api") {
        fromResolutionOf("runtimeClasspath")
      }
      usage("java-runtime") {
        fromResolutionResult()
      }
    }
  }
  signing { sign(publication) }
}

fun MavenPublication.hikakuPom() = pom {
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
