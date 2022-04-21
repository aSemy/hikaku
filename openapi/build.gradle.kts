plugins {
  buildsrc.convention.`kotlin-jvm`
  buildsrc.convention.`publish-jvm`
}

description =
  "A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for OpenAPI specifications."

dependencies {
  implementation(projects.core)
  implementation("io.swagger.parser.v3:swagger-parser-v3:2.0.27")
}

base {
  archivesName.set("hikaku-openapi")
}
