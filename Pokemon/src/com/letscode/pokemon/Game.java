package com.letscode.pokemon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Game extends Frame{

    public static final int BACKGROUND_IMAGE_WIDTH = 900;
    public static final int BACKGROUND_IMAGE_HEIGHT = 542;

    public Game() {

    }

    public void play() throws IOException{
        drawInitialState();
    }

    public void drawInitialState() throws IOException {
        JFrame jFrame = new JFrame("Pokemon");
        jFrame.setSize(BACKGROUND_IMAGE_WIDTH, BACKGROUND_IMAGE_HEIGHT);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLayout(null);
        //centers jFrame to center of screen
        jFrame.setLocationRelativeTo(null);

        Canvas canvas = new Canvas();
        canvas.setSize(BACKGROUND_IMAGE_WIDTH, BACKGROUND_IMAGE_HEIGHT);
        //create graphical representation for pokemon fighting
        drawBackground(jFrame);
        drawPokemon(jFrame);
        drawStats(jFrame);

        jFrame.pack();
        jFrame.setVisible(true);
    }

    private void drawBackground(JFrame jFrame) throws IOException {
        JLabel background = new JLabel(new ImageIcon(ImageIO.read(getClass().getClassLoader().getResourceAsStream("battle_background.png"))));
        jFrame.setContentPane(background);

    }

    public void drawPokemon(JFrame jFrame) throws IOException{
        Pokemon pikachu = new Pokemon("Pikachu", 100, com.letscode.pokemon.Type.ELECTRIC);
        Pokemon pidgey = new Pokemon("Pidgey", 20, com.letscode.pokemon.Type.FLYING);

        BufferedImage myPokemon = ImageIO.read(getClass().getClassLoader().getResourceAsStream("pikachu.png"));
        JLabel myPokemonLabel = new JLabel(new ImageIcon(new ImageIcon(myPokemon).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        myPokemonLabel.setBounds(150, 310, 200, 200);

        BufferedImage enemyPokemon = ImageIO.read(getClass().getClassLoader().getResourceAsStream("pidgey.png"));
        JLabel enemyPokemonLabel = new JLabel(new ImageIcon(new ImageIcon(enemyPokemon).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        enemyPokemonLabel.setBounds(650, 125, 150, 150);

        jFrame.add(myPokemonLabel);
        jFrame.add(enemyPokemonLabel);
    }

    public void drawStats(JFrame jframe) {
        JLabel info = new JLabel();
    }
}
