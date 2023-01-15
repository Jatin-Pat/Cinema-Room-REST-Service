package com.github.jatinpat.cinemaroomrestservice;


public class Seat {
    private int row;
    private int column;
    private int price;

    public Seat() {}

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.price = row <= 4 ? 10 : 8;
    }

    public int getPrice() {
        return price;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seat seat = (Seat) o;
        if (row != seat.row) return false;
        return column == seat.column;
    }
}
