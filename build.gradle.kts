plugins {
    id("com.github.ben-manes.versions") version "0.36.0"
}

buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", "1.4.21"))
        classpath("com.android.tools.build:gradle:4.1.2")
        //classpath("com.google.firebase:firebase-crashlytics-gradle:2.4.1")
        //classpath("com.google.android.gms:oss-licenses-plugin:0.10.2")
        //classpath("com.google.gms:google-services:4.3.5")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven("https://jitpack.io")
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
