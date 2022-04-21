//archivesBaseName = 'hikaku-raml'

plugins {
  id("buildsrc.convention.kotlin-jvm")
}

dependencies {
  api project(':core')
  api 'org.raml:raml-parser-2:1.0.51'


  testImplementation "io.mockk:mockk:1.12.0"
}

//uploadArchives {
//  repositories {
//    mavenDeployer {
//      pom.project {
//        name = 'hikaku-raml'
//        description = 'A library to test if the implementation of a REST-API meets its specification. This module contains a converter for raml specifications.'
//      }
//    }
//  }
//}
