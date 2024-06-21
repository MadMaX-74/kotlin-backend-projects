plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libraries") {
            from(files("gradle/libraries.versions.toml"))
        }
    }
}

rootProject.name = "kotlin-backend-projects"

include("plugin")
include("training-modules")
include("project-modules")
