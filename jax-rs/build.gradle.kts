//archivesBaseName = 'hikaku-jax-rs'

plugins {
  id("buildsrc.convention.kotlin-jvm")
}

dependencies {
  api project(':core')
  api 'jakarta.ws.rs:jakarta.ws.rs-api:3.0.0'
}
//
//uploadArchives {
//  repositories {
//    mavenDeployer {
//      pom.project {
//        name = 'hikaku-jax-rs'
//        description = 'A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for jax-rs implementations.'
//      }
//    }
//  }
//}
