plugins {
    kotlin("js")
}

dependencies {
    testImplementation(kotlin("test"))
}

project.buildDir = file("build")

kotlin {
    js(IR) {
        useCommonJs()
        binaries.executable()
        nodejs {}
    }
    sourceSets {
        val main by getting {
            kotlin.srcDir("${buildDir}/generated")
        }
    }
}