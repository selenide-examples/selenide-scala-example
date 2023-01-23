plugins {
    scala
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.2.2")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-core:5.0.0")
    testImplementation("org.scalatest:scalatest_3:3.2.15")
    testImplementation("org.scalatestplus:junit-4-13_3:3.2.15.0")
    testImplementation("com.codeborne:selenide:6.11.1")

    testRuntimeOnly("org.scala-lang.modules:scala-xml_3:2.1.0")
}

tasks {
    test {
        systemProperties["selenide.headless"] = "true"
    }
}