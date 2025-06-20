package entities;

import interfaces.Shower;

import java.sql.SQLOutput;

public class Image extends Multimedia implements Shower {

    private int luminosity = 5;

    public Image(String title) {
        super(title);
    }

    @Override
    public void show() {
        System.out.println("Image title: " + this.title);
        System.out.println("Image luminosity: " + this.luminosity);
    }

    @Override
    public void raiseLuminosity(int luminosity) {
    this.luminosity = luminosity;
    }

    @Override
    public void lowerLuminosity(int luminosity) {
    this.luminosity = luminosity;
    }
}
