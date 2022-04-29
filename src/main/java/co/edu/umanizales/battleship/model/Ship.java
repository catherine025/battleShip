package co.edu.umanizales.battleship.model;

public class Ship {
    private int id;
    private String name;
    private byte numPlaces;

    public Ship(String name, byte numPlaces) {
        this.name = name;
        this.numPlaces = numPlaces;
    }
}
