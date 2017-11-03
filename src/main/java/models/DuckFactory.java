package models;

/**
 * Created by 708 on 11/3/2017.
 */
public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {

        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    public Quackable createRedheadDuck() {

        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new QuackEcho(new DuckCall())); }

    public Quackable createRubberDuck() {

        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
