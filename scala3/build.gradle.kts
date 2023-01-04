plugins {
    scala
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.2.1")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-inline:4.11.0")
    testImplementation("org.scalatest:scalatest_3:3.2.14")
    testImplementation("org.scalatestplus:junit-4-13_3:3.2.14.0")
    testImplementation("com.codeborne:selenide:6.11.0")

    testRuntimeOnly("org.scala-lang.modules:scala-xml_3:2.1.0")
}

tasks {
    test {
        systemProperties["selenide.headless"] = "true"
    }
}