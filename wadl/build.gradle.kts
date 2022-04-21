plugins {
  buildsrc.convention.`kotlin-jvm`
  buildsrc.convention.`publish-jvm`
}

description =
  "A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for WADL files."

dependencies {
  implementation(projects.core)
}

base {
  archivesName.set("hikaku-wadl")
}
