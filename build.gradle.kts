plugins {
    java
    id("io.github.art.project") version "1.0.113"
}

repositories {
    jcenter()
}

tasks.withType(Wrapper::class) {
    gradleVersion = "5.6"
}

art {
    idea()
    lombok()
    embeddedModules {
        useVersion("1.1.14")
        kit()
    }
}
group = "ru"
version = "1.0-SNAPSHOT"