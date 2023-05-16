buildscript{
    /*ext {
        //compose_version = "1.3.0"
        //kotlin_version = "1.8.10"
        //room_version = "2.5.1"
        //hilt_navigation_compose_version = "1.0.0"
        //hilt_version = "2.44"
        //navigation_compose_version = "2.5.3"
    } */
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44") //hilt_version
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0-alpha03" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false //kotlin_version

    //ksp
    id("com.google.devtools.ksp") version "1.8.21-1.0.11" apply false
}