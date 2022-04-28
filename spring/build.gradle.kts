plugins {
  buildsrc.convention.`kotlin-jvm`
  buildsrc.convention.`maven-publish`
}

description =
  "A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for Spring MVC implementations."

val springFrameworkVersion = "5.3.19"
val springBootVersion = "2.6.7"

dependencies {
  implementation(projects.core)
  implementation(platform("org.springframework:spring-framework-bom:$springFrameworkVersion"))
  implementation(platform("org.springframework.boot:spring-boot-dependencies:$springBootVersion"))

  implementation("org.springframework:spring-webmvc")

  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.springframework.boot:spring-boot-starter-web")
}

base {
  archivesName.set("hikaku-spring")
}
