plugins {
  buildsrc.convention.`kotlin-jvm`
  buildsrc.convention.`publish-jvm`
}

description =
  "A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for jax-rs implementations."

dependencies {
  implementation(projects.core)
  implementation("jakarta.ws.rs:jakarta.ws.rs-api:3.0.0")
}

base {
  archivesName.set("hikaku-jax-rs")
}
