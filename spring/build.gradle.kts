buildscript {
  ext {
    springBootVersion = '2.5.4'
  }
}

plugins {
  id("buildsrc.convention.kotlin-jvm")
}

//archivesBaseName = 'hikaku-spring'

dependencies {
  api 'org.springframework:spring-webmvc:5.3.9'
  api project(':core')

  testImplementation "org.springframework.boot:spring-boot-starter-test:$springBootVersion"
  testImplementation "org.springframework.boot:spring-boot-starter-web:$springBootVersion"
}

//uploadArchives {
//  repositories {
//    mavenDeployer {
//      pom.project {
//        name = 'hikaku-spring'
//        description = 'A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for spring-mvc implementations.'
//      }
//    }
//  }
//}
