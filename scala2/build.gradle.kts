plugins {
    scala
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.12")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-core:5.7.0")
    testImplementation("org.scalatest:scalatest_2.13:3.3.0-SNAP4")
    testImplementation("org.scalatestplus:junit-4-12_2.13:3.3.0.0-SNAP2")
    testImplementation("com.codeborne:selenide:7.0.2")

    testRuntimeOnly("org.scala-lang.modules:scala-xml_2.13:2.2.0")
}

tasks {
    test {
        systemProperties["selenide.headless"] = "true"
    }
}