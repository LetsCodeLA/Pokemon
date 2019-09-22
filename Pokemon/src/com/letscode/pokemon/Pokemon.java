package com.letscode.pokemon;

import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int health;
    private ArrayList<Move> moves;
    private Type type;

    public Pokemon(String name, int health, Type type) {
        this.name = name;
        this.health = health;
        this.moves = new ArrayList<>();
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
