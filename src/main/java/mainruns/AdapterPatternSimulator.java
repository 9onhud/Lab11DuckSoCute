package mainruns;

import models.*;

public class AdapterPatternSimulator {
    public static void main(String[] args) {
        AdapterPatternSimulator simulator = new AdapterPatternSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With goose adapter");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        simulate(gooseDuck);
        simulate(pigeon);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
