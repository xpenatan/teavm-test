import org.teavm.gradle.api.OptimizationLevel

plugins {
    application
    id("org.teavm") version "0.16.0-dev-5"
}

repositories {
    mavenCentral()
    maven("https://teavm.org/maven/repository/")
}

application {
    mainClass.set("MonitorExitRepro")
}

tasks.withType<JavaCompile>().configureEach {
    options.release.set(17)
}

teavm {
    c {
        mainClass = "TestClass"
        fastGlobalAnalysis = false
        optimization = OptimizationLevel.AGGRESSIVE
    }
}
