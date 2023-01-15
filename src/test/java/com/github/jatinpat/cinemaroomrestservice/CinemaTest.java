package com.github.jatinpat.cinemaroomrestservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {
    @Test
    void testContains49seats() {
        var cinema = new Cinema(9, 9);
        assertEquals(81, cinema.available_seats.size());
    }

    @Test
    void testSeatPrice8() {
        var cinema = new Cinema(9, 4);
        assertEquals(8, cinema.available_seats.get(20).getPrice());
    }

    @Test
    void testSeatPrice10() {
        var cinema = new Cinema(4, 1);
        assertEquals(10, cinema.available_seats.get(1).getPrice());
    }

}