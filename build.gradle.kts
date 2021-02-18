plugins {
    java
}

group = "com.codewars"
version = "1.0"

subprojects {
    apply(plugin = "java")

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    sourceSets {
        main {
            java {
                srcDir("main")
            }
        }
        test {
            java {
                srcDir("test")
            }
        }
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("junit:junit:4.13.1")
        implementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
        implementation("org.junit.jupiter:junit-jupiter-engine:5.7.1")
        implementation("org.junit.platform:junit-platform-launcher:1.7.1")
        implementation("org.junit.vintage:junit-vintage-engine:5.7.1")
        implementation("org.mockito:mockito-core:3.7.7")
        implementation("org.assertj:assertj-core:3.19.0")
        implementation("org.assertj:assertj-guava:3.4.0")
        implementation("org.apache.commons:commons-lang3:3.11")
        implementation("org.apache.commons:commons-math3:3.6.1")
        implementation("com.google.guava:guava:30.1-jre")
        implementation("org.jsoup:jsoup:1.13.1")
        implementation("org.dom4j:dom4j:2.1.3")
    }

    tasks {
        test {
            useJUnitPlatform()
        }
    }
}