package org.selenide.examples.scala2

import org.junit.Test
import org.junit.Ignore
import org.mockito.Mockito
import org.mockito.Mockito.doReturn

import java.time.LocalDate

class ScalaMockitoTest {
  @Test def mockWithClass(): Unit = {
    val person: Person = Mockito.mock(classOf[Person])
    assert(person.age() == 0)

    doReturn(42).when(person).age()
    assert(person.age() == 42)
  }

  @Test @Ignore
  def mockWithoutClass(): Unit = {
    val person: Person = Mockito.mock()
    assert(person.age() == 0)

    doReturn(42).when(person).age()
    assert(person.age() == 42)
  }

  @Test def spyWithObject(): Unit = {
    val person: Person = Mockito.spy(new Person(LocalDate.parse("1981-06-08")))
    assert(person.age() > 40)

    doReturn(LocalDate.parse("1982-06-08")).when(person).today()
    assert(person.age() == 11111)
  }

  @Test def spyWithClass(): Unit = {
    val person: Person = Mockito.spy(classOf[Person])
    assert(person.age() > 40)

    doReturn(LocalDate.parse("1982-06-08")).when(person).today()
    assert(person.age() == 12)
  }

  @Test @Ignore
  def spyWithoutClass(): Unit = {
    val person: Person = Mockito.spy()
    assert(person.age() > 40)

    doReturn(LocalDate.parse("1971-01-01")).when(person).today()
    assert(person.age() == 1)
  }

}
