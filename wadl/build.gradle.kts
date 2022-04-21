//archivesBaseName = 'hikaku-wadl'

plugins {
  buildsrc.convention.`kotlin-jvm`
}

description =
  "A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for WADL files."

dependencies {
  implementation(projects.core)
}

//uploadArchives {
//  repositories {
//    mavenDeployer {
//      pom.project {
//        name = 'hikaku-wadl'
//        description =
//      }
//    }
//  }
//}
