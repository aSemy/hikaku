rootProject.name = "hikaku"

apply(from = "./buildSrc/repositories.settings.gradle.kts")

include(
  ":modules:hikaku-core",
  ":modules:hikaku-openapi",
  ":modules:hikaku-spring",
  ":modules:hikaku-wadl",
  ":modules:hikaku-raml",
  ":modules:hikaku-jax-rs",
  ":modules:hikaku-micronaut",
)

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

@Suppress("UnstableApiUsage") // Central declaration of repositories is an incubating feature
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
}
