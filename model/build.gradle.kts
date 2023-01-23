plugins {
    id("software.amazon.smithy")
}

dependencies {
    implementation("software.amazon.smithy:smithy-model:1.27.0")
}

project.buildDir = file("build")

configure<software.amazon.smithy.gradle.SmithyExtension> {}