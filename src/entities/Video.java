package entities;

import interfaces.Player;

public class Video extends Multimedia implements Player {

    public Video(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void play(int duration) {

    }

    @Override
    public void raiseVolume(int volume) {

    }

    @Override
    public void lowerVolume(int volume) {

    }
}
