import models.*;

/**
 * Created by 708 on 11/3/2017.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
//        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
//        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
//        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
//        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
//        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
////        Quackable mallardDuck = new QuackEcho(new QuackCounter((new MallardDuck())));
////        Quackable redheadDuck = new QuackEcho(new QuackCounter((new RedheadDuck())));
////        Quackable duckCall = new QuackEcho(new QuackCounter((new DuckCall())));
////        Quackable rubberDuck = new QuackEcho(new QuackCounter((new RubberDuck())));

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//
//        simulate(gooseDuck);
//        simulate(pigeon);

        System.out.println("The ducks quacked "+QuackCounter.getQuacks()+" times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
