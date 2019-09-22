package com.letscode.pokemon;

import java.awt.*;

public class Drawer {
    private Graphics2D graphics2D;
    private Canvas canvas;
    private Pokemon myPokemon;
    private Pokemon enemyPokemon;

    public Drawer(Canvas canvas, Pokemon myPokemon, Pokemon enemyPokemon) {
        this.canvas = canvas;
        this.myPokemon = myPokemon;
        this.enemyPokemon = enemyPokemon;
    }
}
