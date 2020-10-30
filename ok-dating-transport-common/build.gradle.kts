plugins {
    kotlin("jvm") version "1.4.0"
    //kotlin("multiplatform")
}

group = rootProject.group
version = rootProject.version

repositories {
    mavenCentral()
}


dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))

}
