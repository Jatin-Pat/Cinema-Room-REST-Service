package com.github.jatinpat.cinemaroomrestservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class SeatController {

    public SeatController() {}

    private Cinema cinema = new Cinema(9, 9);

    @GetMapping("/seats")
    public Cinema getSeat() {return cinema;}

    @PostMapping("/purchase")
    public ResponseEntity<?> postSeat(@RequestBody Seat seat) {
        if (seat.getRow() < 1
                || seat.getRow() > 9
                || seat.getColumn() < 1
                || seat.getColumn() > 9) {
            return new ResponseEntity<>(Map.of("error", "The number of a row or a column is out of bounds!"), HttpStatus.BAD_REQUEST);
        }
        if (cinema.available_seats.contains(seat)) {
            Seat orderedSeat = cinema.available_seats.remove(cinema.available_seats.indexOf(seat));
            return new ResponseEntity<>(orderedSeat, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(Map.of("error", "The ticket has been already purchased!"), HttpStatus.BAD_REQUEST);
        }
    }
}
