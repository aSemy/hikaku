plugins {
  buildsrc.convention.`kotlin-jvm`
  buildsrc.convention.`publish-jvm`
}

description =
  "A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for micronaut implementations."

dependencies {
  implementation(projects.core)
  implementation("io.micronaut:micronaut-http:3.0.0")
}

base {
  archivesName.set("hikaku-micronaut")
}
