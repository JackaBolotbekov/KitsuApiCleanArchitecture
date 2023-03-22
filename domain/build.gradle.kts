plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    // courutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    // Hilt
    implementation("javax.inject:javax.inject:1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}