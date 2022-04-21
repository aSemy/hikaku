//archivesBaseName = 'hikaku-openapi'

plugins {
  id("buildsrc.convention.kotlin-jvm")
}

dependencies {
  api project(':core')
  api 'io.swagger.parser.v3:swagger-parser-v3:2.0.27'
}

//uploadArchives {
//  repositories {
//    mavenDeployer {
//      pom.project {
//        name = 'hikaku-openapi'
//        description = 'A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for OpenAPI specifications.'
//      }
//    }
//  }
//}
