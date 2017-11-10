package mainruns;

import models.*;

public class DecoratorPatternSimulator {
    public static void main(String[] args) {
        DecoratorPatternSimulator simulator = new DecoratorPatternSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        simulate(gooseDuck);
        simulate(pigeon);

        System.out.println("The ducks quacked "+QuackCounter.getQuacks()+" times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
