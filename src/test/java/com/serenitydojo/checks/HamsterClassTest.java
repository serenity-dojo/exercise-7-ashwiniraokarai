package com.serenitydojo.checks;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.assertj.core.api.Assertions.assertThat;

public class HamsterClassTest {
    @Test
    public void theDogClassShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.Hamster")).isNotNull();
    }

    @Test
    public void shouldBeAPet() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Hamster").getSuperclass().getSimpleName()).isEqualTo("Pet");
    }

    @Test
    public void theDogClassShouldHaveAFavoriteToy() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Hamster").getDeclaredField("favoriteGame").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void theDogClassShouldHaveAMethodCalledMakeNoise() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Dog").getMethod("makeNoise").getReturnType()).isEqualTo(String.class);
    }

    @Test
    public void theDogClassShouldHaveAConstantField_MAKE_NOISE() throws Exception {
        Field makeNoise = Class.forName("com.serenitydojo.Dog").getDeclaredField("DOG_NOISE");
        assertThat(makeNoise.getType()).isEqualTo(String.class);
        assertThat(Modifier.isFinal(makeNoise.getModifiers())).isTrue();
        assertThat(Modifier.isStatic(makeNoise.getModifiers())).isTrue();
    }
}
