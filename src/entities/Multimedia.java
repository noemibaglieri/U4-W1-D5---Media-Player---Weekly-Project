package entities;

public abstract class Multimedia {
    // lista attributi
    protected String title;
    protected int duration;

    // lista costruttori
    public Multimedia(String title){
    this.title = title;
    }

    public Multimedia(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // lista metodi
    public void getTitle() {
        System.out.println("Title: " + this.title);
    }
}
