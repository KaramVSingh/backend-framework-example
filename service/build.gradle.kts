plugins {
    kotlin("jvm")
    id("com.google.devtools.ksp").version("1.8.0-1.0.8")
    id("com.github.johnrengelman.shadow").version("2.0.4")
    id("io.github.karamvsingh.backend-framework.gradle-plugin").version("0.1.2")
    kotlin("plugin.serialization").version("1.8.0")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.github.karamvsingh.backend-framework:service-library:0.1.2")

    model(project(":model"))
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    sourceSets {
        val main by getting {
            kotlin.srcDir("${buildDir}/generated")
        }
    }
}

tasks.named("build") { dependsOn("shadowJar") }
