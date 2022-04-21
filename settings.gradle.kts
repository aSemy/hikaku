rootProject.name = "hikaku"

apply(from = "./buildSrc/repositories.settings.gradle.kts")

include(
  ":core",
  ":openapi",
  ":spring",
  ":wadl",
  ":raml",
  ":jax-rs",
  ":micronaut",
)

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

@Suppress("UnstableApiUsage") // Central declaration of repositories is an incubating feature
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
}
