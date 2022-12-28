package org.selenide.examples.scala2

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

import java.time.LocalDate

@RunWith(classOf[JUnitRunner])
class PersonSuite extends AnyFunSuite {
  test("calculates age of person") {
    def person = new Person(LocalDate.parse("1981-08-06"))
    assert(person.age() > 40)
  }
}
