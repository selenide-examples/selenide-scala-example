package org.selenide.examples.scala3;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
  @Test
  public void webTestSample() {
    open("https://selenide.org");
    $(".main-menu-pages").find(byText("Users")).click();
    $$("#selenide-users .user:not(.hidden)").shouldHave(size(1));

    $$("#user-tags .tag").shouldHave(sizeGreaterThan(8));

    $("#user-tags").find(byTagAndText("a", "all")).click();
    $$("#selenide-users .user:not(.hidden)").shouldHave(sizeGreaterThan(80));
  }
}
