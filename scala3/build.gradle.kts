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
    implementation("org.scala-lang:scala3-library_3:3.7.4")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-inline:4.11.0")
    testImplementation("org.scalatest:scalatest_3:3.2.15")
    testImplementation("org.scalatestplus:junit-4-13_3:3.2.19.1")
    testImplementation("com.codeborne:selenide:7.12.2")

    testRuntimeOnly("org.scala-lang.modules:scala-xml_3:2.4.0")
    testRuntimeOnly("org.slf4j:slf4j-simple:2.0.17")
}

tasks {
    test {
        systemProperties["selenide.headless"] = "true"
    }
}
