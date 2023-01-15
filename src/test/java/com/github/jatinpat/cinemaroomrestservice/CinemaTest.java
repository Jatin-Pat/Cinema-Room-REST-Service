package com.github.jatinpat.cinemaroomrestservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {
    @Test
    void contains49seats() {
        var cinema = new Cinema(9, 9);
        assertEquals(81, cinema.available_seats.size());
    }

    @Test
    void seatPrice8() {
        var cinema = new Cinema(9, 4);
        assertEquals(8, cinema.available_seats.get(20).getPrice());
    }

    @Test
    void seatPrice10() {
        var cinema = new Cinema(4, 1);
        assertEquals(10, cinema.available_seats.get(1).getPrice());
    }

}