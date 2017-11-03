package models;

/**
 * Created by 708 on 11/3/2017.
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter (Goose goose) {
        this.goose = goose;
    }
    public void quack() {
        goose.honk();
    }
}
