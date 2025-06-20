package entities;

import interfaces.Player;
import interfaces.Shower;

public class Video extends Multimedia implements Player, Shower {

    private int volume;
    private int luminosity = 5;

    public Video(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void play(int duration) {

        for(int i = 0; i < duration; i++) {
            System.out.println("Video title: " + this.title);
        }
        printVolume();
        printLuminosity();
    }

    @Override
    public void raiseVolume(int volume) {
    this.volume = volume;
    }

    @Override
    public void lowerVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void printVolume() {

        StringBuilder volumeState = new StringBuilder();

        for(int i = 0; i < this.volume; i++) {
            volumeState.append("!");
        }

        System.out.println("Current volume for this video: " + volumeState);
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

        System.out.println("Current luminosity for this video: " + luminosityState);
    }

    @Override
    public void show() {
        System.out.println("Video title: " + this.title);
        printLuminosity();
    }
}
