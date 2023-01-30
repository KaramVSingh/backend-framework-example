plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow").version("2.0.4")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.amazonaws:aws-lambda-java-core:1.2.1")
    implementation("com.amazonaws:aws-lambda-java-events:3.11.0")
    runtimeOnly("com.amazonaws:aws-lambda-java-log4j2:1.5.1")
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
