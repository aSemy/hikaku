package buildsrc.convention

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("buildsrc.convention.subproject")
  kotlin("jvm")
  `java-library`
}


tasks.withType<KotlinCompile>().configureEach {

  kotlinOptions {
    jvmTarget = "1.8"
    apiVersion = "1.6"
    languageVersion = "1.6"

    freeCompilerArgs += listOf(
      "-Xjsr305=strict",
      "-opt-in=kotlin.RequiresOptIn",
      "-opt-in=kotlin.ExperimentalStdlibApi",
      "-opt-in=kotlin.time.ExperimentalTime",
    )
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}
