plugins {
    scala
    `java-library`
}

repositories {
    mavenCentral()
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.6.3")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-inline:4.11.0")
    testImplementation("org.scalatest:scalatest_3:3.2.15")
    testImplementation("org.scalatestplus:junit-4-13_3:3.2.19.0")
    testImplementation("com.codeborne:selenide:7.7.0")

    testRuntimeOnly("org.scala-lang.modules:scala-xml_3:2.3.0")
}

tasks {
    test {
        systemProperties["selenide.headless"] = "true"
    }
}