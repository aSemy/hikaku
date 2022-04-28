import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  idea
  `kotlin-dsl`
  kotlin("jvm") version "1.6.21"
  `project-report`
}


object Versions {
  const val jvmTarget = "11"
  const val kotlinTarget = "1.6"

  const val kotlin = "1.6.21"
}


dependencies {
  implementation(enforcedPlatform("org.jetbrains.kotlin:kotlin-bom:${Versions.kotlin}"))
  implementation("org.jetbrains.kotlin:kotlin-serialization")
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
}


val gradleJvmTarget = "1.8"
val gradleJvmVersion = "8"
val gradleKotlinTarget = "1.6"

tasks.withType<KotlinCompile>().configureEach {

  kotlinOptions {
    jvmTarget = gradleJvmTarget
    apiVersion = gradleKotlinTarget
    languageVersion = gradleKotlinTarget
  }

  kotlinOptions.freeCompilerArgs += listOf(
    "-opt-in=kotlin.RequiresOptIn",
    "-opt-in=kotlin.ExperimentalStdlibApi",
    "-opt-in=kotlin.time.ExperimentalTime",
  )
}

kotlin {
  jvmToolchain {
    (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(gradleJvmVersion))
  }

  kotlinDslPluginOptions {
    jvmTarget.set(gradleJvmTarget)
  }
}

idea {
  module {
    isDownloadSources = true
    isDownloadJavadoc = true
  }
}
