package models;

/**
 * Created by 708 on 11/3/2017.
 */
public class PigeonAdapter implements Quackable {
    Pigeon pigeon;
    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }
    public void quack() {
        for (int i=0; i<2; i++)
            pigeon.coo();
    }
}
