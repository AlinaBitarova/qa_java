package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTestParameterized {

    String sex;
    Boolean hasMane;

    public LionTestParameterized(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] lionData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception{
        Lion lion = new Lion(sex, new Feline());
        assertEquals(hasMane, lion.doesHaveMane());

    }

}