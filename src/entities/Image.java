package entities;

import interfaces.Shower;

public class Image extends Multimedia implements Shower {

    private int luminosity = 5;

    public Image(String title) {
        super(title);
    }

    @Override
    public void show() {
        System.out.println("Video title: " + this.title);
        printLuminosity();
    }

    @Override
    public void raiseLuminosity(int luminosity) {
    this.luminosity += luminosity;
    }

    @Override
    public void lowerLuminosity(int luminosity) {
    this.luminosity -= luminosity;
    }

    @Override
    public void printLuminosity() {

            StringBuilder luminosityState = new StringBuilder();

            for(int i = 0; i < this.luminosity; i++) {
                luminosityState.append("*");
            }

            System.out.println("Current luminosity for this image: " + luminosityState);
        }

    @Override
    public String toString() {
        return "Image title: " + title;
    }
}
