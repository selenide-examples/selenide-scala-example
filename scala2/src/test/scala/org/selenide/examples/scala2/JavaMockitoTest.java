package org.selenide.examples.scala2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.parse;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class JavaMockitoTest {
  @Test
  public void mockWithClass() {
    List<String> names = mock(List.class);
    assert names.size() == 0;

    doReturn(42).when(names).size();
    assert names.size() == 42;
  }

  @Test
  public void mockWithoutClass() {
    List<String> names = mock();
    assert names.size() == 0;

    doReturn(42).when(names).size();
    assert names.size() == 42;
  }

  @Test
  public void spyWithClass() {
    List<String> names = spy(new ArrayList<>());
    assert names.size() == 0;

    names.add("tere");
    assert names.size() == 1;

    doReturn(42).when(names).size();
    assert names.size() == 42;
  }

  @Test
  public void spyWithObject() {
    List<String> names = spy(ArrayList.class);
    assert names.size() == 0;

    names.add("tere");
    assert names.size() == 1;

    doReturn(42).when(names).size();
    assert names.size() == 42;
  }

  @Test
  public void spyWithoutClass() {
    List<String> names = spy();
    assert names.size() == 0;

    doReturn(42).when(names).size();
    assert names.size() == 42;
  }

  @Test
  public void mockFinalClass() {
    RetiredPerson person = mock(RetiredPerson.class);
    when(person.age()).thenReturn(91);
    assert person.age() == 91;
  }

  @Test
  public void spyFinalClass() {
    RetiredPerson person = spy(new RetiredPerson(parse("1981-08-06"), parse("2041-07-07")));
    when(person.today()).thenReturn(parse("1982-08-06"));
    assert person.age() == 1;
  }
}
