//archivesBaseName = 'hikaku-micronaut'

plugins {
  buildsrc.convention.`kotlin-jvm`
}

description =
  "A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for micronaut implementations."

dependencies {
  implementation(projects.core)
  implementation("io.micronaut:micronaut-http:3.0.0")
}

//uploadArchives {
//  repositories {
//    mavenDeployer {
//      pom.project {
//        name = 'hikaku-micronaut'
//      }
//    }
//  }
//}
