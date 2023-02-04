plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow").version("2.0.4")
    id("com.github.karamvsingh.backend-framework.gradle-plugin").version("0.1.0")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.karamvsingh.backend-framework:service-library:0.1.0")
    model(project(":model"))
}

kotlin {
    jvmToolchain(11)
    sourceSets {
        val main by getting {
            kotlin.srcDir("${buildDir}/generated")
        }
    }
}

tasks.named("build") { dependsOn("shadowJar") }
