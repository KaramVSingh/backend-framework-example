pluginManagement {
    plugins {
        id("software.amazon.smithy").version("0.6.0")
    }
    repositories {
        gradlePluginPortal()
    }
}

rootProject.name = "backend-framework-example"

include("model")