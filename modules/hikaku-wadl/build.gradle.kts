plugins {
  buildsrc.convention.`kotlin-jvm`
  buildsrc.convention.`maven-publish`
}

description =
  "A library that tests if the implementation of a REST-API meets its specification. This module contains a converter for WADL files."

dependencies {
  implementation(projects.modules.hikakuCore)
}

base {
  archivesName.set("hikaku-wadl")
}
