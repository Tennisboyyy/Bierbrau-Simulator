package com.bierbrau.game;

import java.io.*;

public class GameManager {

    public static Game game;

    public static void loadGame(String spielstand) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("data/saves/" + spielstand + ".bbs");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        game = (Game) objectInputStream.readObject();
        objectInputStream.close();
    }

    public static void saveGame(String spielstand) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("data/saves/" + spielstand + ".bbs");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(game);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

}
