plugins {
    Plugins.apply {
        id(javaLibrary)
        id(kotlinJvm)
    }
}

dependencies {
    // coroutines
    implementation(Dependencies.Coroutines.coroutines)
    implementation(Dependencies.Inject.inject)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}