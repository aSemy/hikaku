plugins {
  buildsrc.convention.`kotlin-jvm`
  buildsrc.convention.`publish-jvm`
}

description =
  "A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for Spring MVC implementations."

val springBootVersion = "2.5.4"

dependencies {
  implementation(projects.core)
  implementation("org.springframework:spring-webmvc:5.3.9")

  testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
  testImplementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
}

base {
  archivesName.set("hikaku-spring")
}
