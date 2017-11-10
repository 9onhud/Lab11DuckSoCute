package mainruns;

import models.*;

public class AbstractFactoryPatternSimulator {
    public static void main(String[] args) {
        AbstractFactoryPatternSimulator simulator = new AbstractFactoryPatternSimulator();

        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Abstract Factory");

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
