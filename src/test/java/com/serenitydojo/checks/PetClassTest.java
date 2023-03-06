package com.serenitydojo.checks;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.assertj.core.api.Assertions.assertThat;

public class PetClassTest {
    @Test
    public void thePetClassShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.Pet")).isNotNull();
    }

    @Test
    public void shouldHaveAName() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Pet").getDeclaredField("name").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void shouldHaveAnAge() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Pet").getDeclaredField("age").getGenericType()).isEqualTo(int.class);
    }
}
