//archivesBaseName = 'hikaku-raml'

plugins {
  buildsrc.convention.`kotlin-jvm`
}

description =
  "A library to test if the implementation of a REST-API meets its specification. This module contains a converter for raml specifications."

dependencies {
  implementation(projects.core)
  implementation("org.raml:raml-parser-2:1.0.51")

  testImplementation("io.mockk:mockk:1.12.0")
}

//uploadArchives {
//  repositories {
//    mavenDeployer {
//      pom.project {
//        name = 'hikaku-raml'
//        description =
//      }
//    }
//  }
//}
