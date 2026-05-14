val bucket = configurations.dependencyScope("bucket")
configurations.resolvable("resolvable") {
    extendsFrom(bucket.get())
    resolutionStrategy.activateDependencyLocking()
}

repositories {
    mavenCentral()
}

dependencies {
    bucket("org.slf4j:slf4j-api:2.0.16")
}
