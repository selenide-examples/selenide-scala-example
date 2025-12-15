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
    implementation("org.scala-lang:scala-library:2.13.18")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-core:5.21.0")
    testImplementation("org.scalatest:scalatest_2.13:3.3.0-SNAP4")
    testImplementation("org.scalatestplus:junit-4-12_2.13:3.3.0.0-SNAP2")
    testImplementation("com.codeborne:selenide:7.13.0")

    testRuntimeOnly("org.scala-lang.modules:scala-xml_2.13:2.4.0")
    testRuntimeOnly("org.slf4j:slf4j-simple:2.0.17")
}

tasks {
    test {
        systemProperties["selenide.headless"] = "true"
    }
}
