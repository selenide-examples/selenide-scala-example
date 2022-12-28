package org.selenide.examples.scala3;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
  @Test
  public void webTestSample() {
    open("https://duckduckgo.com");
    $("[name=q]").val("Selenide Scala").pressEnter();
  }
}
