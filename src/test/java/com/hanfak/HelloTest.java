package com.hanfak;

import com.hanfak.Hello;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloTest {
  @Test
  public void exampleTest() {
    Hello hello = new Hello();
    assertThat(hello.run()).isEqualTo("Hello");
  }
}