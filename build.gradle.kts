buildscript {
    val korgePluginVersion: String by project

    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
    dependencies {
        classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:$korgePluginVersion")
    }
}

allprojects {
    repositories.apply {
        mavenLocal()
        maven { url = uri("https://dl.bintray.com/korlibs/korlibs") }
        jcenter()
        mavenCentral()
    }
}
