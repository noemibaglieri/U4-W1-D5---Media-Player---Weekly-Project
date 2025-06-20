package entities;

import interfaces.Player;

public class Audio extends Multimedia implements Player {

    private int volume;

    public Audio(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void play(int duration) {

    }

    @Override
    public void raiseVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void lowerVolume(int volume) {
    this.volume = volume;
    }
}
