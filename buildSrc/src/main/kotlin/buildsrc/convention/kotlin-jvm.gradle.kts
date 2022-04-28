package buildsrc.convention

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("buildsrc.convention.subproject")
  kotlin("jvm")
  `java-library`
}

val projectKotlinVersion = "1.6.21"

dependencies {
  implementation(platform(kotlin("bom")))
  implementation(kotlin("stdlib-jdk8"))
  implementation(kotlin("reflect"))

  testImplementation(platform("org.junit:junit-bom:5.8.2"))
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

  testImplementation("org.assertj:assertj-core:3.20.2")
  testImplementation(kotlin("test"))
  testImplementation(kotlin("test-junit5"))
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

tasks.withType<Test>().configureEach {
  useJUnitPlatform()
}

tasks.javadoc {
  if (JavaVersion.current().isJava9Compatible) {
    (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
  }
}
