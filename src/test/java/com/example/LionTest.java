package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittens);
        int actualKittens = lion.getKittens();
        assertEquals("Котят неверное число", expectedKittens, actualKittens);
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expectedMane = false;
        boolean actualMane = lion.doesHaveMane();
        assertEquals("Неверно определено наличие гривы", expectedMane, actualMane);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals("Рацион льва неправильный", expectedFood, actualFood);
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void shouldBeExceptionWhenInvalidSex() {
        try {
            Lion lion = new Lion("Лев", feline);
        } catch (Exception exception) {
            String expectedExceptionText = "Используйте допустимые значения пола животного - самец или самка";
            String actualExceptionText = exception.getMessage();
            assertEquals("Неверное сообщение об ошибке", expectedExceptionText, actualExceptionText);
        }
    }

}