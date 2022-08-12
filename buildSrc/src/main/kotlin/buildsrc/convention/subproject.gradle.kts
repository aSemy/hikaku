package buildsrc.convention

plugins {
  base
  idea
}

if (project != rootProject) {
  project.group = rootProject.group
  project.version = rootProject.version
}
