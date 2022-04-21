plugins {
  buildsrc.convention.`kotlin-jvm`
  buildsrc.convention.`publish-jvm`
}

description =
  "A library that tests if the implementation of a REST-API meets its specification. This module contains the core elements which can be used to create additional converters and reporters."

base {
  archivesName.set("hikaku-core")
}
