pluginManagement {
    plugins {
        id("software.amazon.smithy").version("0.6.0")
        kotlin("js").version("1.8.0")
    }
    repositories {
        gradlePluginPortal()
        google()
    }
}

rootProject.name = "backend-framework-example"

include("model")
include("service")