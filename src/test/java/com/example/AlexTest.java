package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        List<String> actualFriends = alex.getFriends();
        assertEquals("Неверный список друзей", expectedFriends, actualFriends);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex(feline);
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = alex.getPlaceOfLiving();
        assertEquals("Неверное место жительства", expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void getKittens() throws Exception {
        Alex alex = new Alex(feline);
        int expectedKittens = 0;
        int actualKittens = alex.getKittens();
        assertEquals("Котят быть не должно", expectedKittens, actualKittens);
    }

}