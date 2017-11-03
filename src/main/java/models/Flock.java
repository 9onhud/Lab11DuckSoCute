package models;

import java.util.ArrayList;

/**
 * Created by 708 on 11/3/2017.
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        for (Quackable quacker: quackers)
            quacker.quack();
    }
}
