plugins {
    id("software.amazon.smithy")
}

dependencies {
    implementation("software.amazon.smithy:smithy-model:1.29.0")
}

configure<software.amazon.smithy.gradle.SmithyExtension> {}