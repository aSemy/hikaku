//archivesBaseName = 'hikaku-wadl'

plugins {
  id("buildsrc.convention.kotlin-jvm")
}
dependencies {
  api project(':core')
}

//uploadArchives {
//  repositories {
//    mavenDeployer {
//      pom.project {
//        name = 'hikaku-wadl'
//        description = 'A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for WADL files.'
//      }
//    }
//  }
//}
