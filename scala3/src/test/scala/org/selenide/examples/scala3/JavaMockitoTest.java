package org.selenide.examples.scala3;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;

public class JavaMockitoTest {
  @Test
  public void mockWithClass() {
    List<String> names = Mockito.mock(List.class);
    assert names.size() == 0;

    doReturn(42).when(names).size();
    assert names.size() == 42;
  }

  @Test
  public void mockWithoutClass() {
    List<String> names = Mockito.mock();
    assert names.size() == 0;

    doReturn(42).when(names).size();
    assert names.size() == 42;
  }

  @Test
  public void spyWithClass() {
    List<String> names = Mockito.spy(new ArrayList<>());
    assert names.size() == 0;

    names.add("tere");
    assert names.size() == 1;

    doReturn(42).when(names).size();
    assert names.size() == 42;
  }

  @Test
  public void spyWithObject() {
    List<String> names = Mockito.spy(ArrayList.class);
    assert names.size() == 0;

    names.add("tere");
    assert names.size() == 1;

    doReturn(42).when(names).size();
    assert names.size() == 42;
  }

  @Test
  public void spyWithoutClass() {
    List<String> names = Mockito.spy();
    assert names.size() == 0;
    
    doReturn(42).when(names).size();
    assert names.size() == 42;
  }
}
