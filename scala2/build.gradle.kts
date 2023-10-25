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
    testImplementation("org.mockito:mockito-core:5.6.0")
    testImplementation("org.scalatest:scalatest_2.13:3.2.17")
    testImplementation("org.scalatestplus:junit-4-12_2.13:3.2.2.0")
    testImplementation("com.codeborne:selenide:7.0.0")

    testRuntimeOnly("org.scala-lang.modules:scala-xml_2.13:2.2.0")
}

tasks {
    test {
        systemProperties["selenide.headless"] = "true"
    }
}