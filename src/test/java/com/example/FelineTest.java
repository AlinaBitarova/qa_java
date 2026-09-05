package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {


    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals("Неправильный рацион представителя кошачьих", expectedFood, actualFood);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("Семья представителя кошачьих не та", expectedFamily, actualFamily);

    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        assertEquals("Котят больше одного", expectedKittens, actualKittens);

    }

    @Test
    public void getSeveralKittensTest() {
        Feline feline = new Feline();
        int expectedKittens = 2;
        int actualKittens = feline.getKittens(2);
        assertEquals("Котят неверное число", expectedKittens, actualKittens);

    }


}