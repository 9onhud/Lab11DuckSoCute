package models;

/**
 * Created by 708 on 11/3/2017.
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static  int numberOfQuacks;
    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
    public static int getQuacks() {
        return numberOfQuacks;
    }
}
