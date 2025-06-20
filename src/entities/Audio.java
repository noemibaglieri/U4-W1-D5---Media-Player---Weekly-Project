package entities;

import interfaces.Player;

public class Audio extends Multimedia implements Player {

    private int volume = 5;

    public Audio(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void play() {
        for(int i = 0; i < this.duration; i++) {
            System.out.println("Video title: " + this.title);
            printVolume();
        }
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

        System.out.println("Current volume for this audio: " + volumeState);
    }

    @Override
    public String toString() {
        return "Audio title: " + title + ", Audio duration: " + duration + "s";
    }
}
