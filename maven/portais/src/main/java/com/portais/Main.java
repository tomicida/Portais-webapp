package com.portais;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        option1();
    }

    public static void option1() throws FileNotFoundException{
        GUI gui = new GUI();
        gui.Show();
    }
    
}
