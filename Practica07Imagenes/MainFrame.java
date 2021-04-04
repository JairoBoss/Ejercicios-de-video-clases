package Practica07Imagenes;

import javax.swing.*;

public class MainFrame extends JFrame {

    Boxes box;

    public MainFrame(){
        box = new Boxes();
        this.setTitle("IMAGENES");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

/*
        box.setListen(new Listener() {
            @Override
            public void barbilla() {

            }

            @Override
            public void lentes() {

            }

            @Override
            public void cabello() {

            }

            @Override
            public void dientes() {

            }
        });
*/








        this.add(box);
        this.setVisible(true);
    }
}
