package controller;

import model.Player;

import java.io.IOException;

/**
 * Created by asuspc on 4/24/2017.
 */
public class driver {
    public static void main(String[] args) throws IOException {
        PlayGame play = new PlayGame();
        play.initGame();
    }
}
