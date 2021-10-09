/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.snakegame;

import com.mycompany.snakegame.DataOfSquare;
import java.awt.Color;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataOfSquareTest {

    DataOfSquare dataOfSquare;

    public DataOfSquareTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("should print before any of the tests");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("should print before each of the test scipts");
    }

    /**
     * Test of lightMeUp method, of class DataOfSquare.
     */
    @Test
    public void testLightMeUp() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            System.out.println("lightMeUp");
            int c = 0;
            DataOfSquare instance = null;
            instance.lightMeUp(c);
        });
    }


    @AfterEach
    public void tearDown() {
        System.out.println("should print after each test case");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("should be printed after all the tests have been excuted");
    }

}
