import impl.Water;
import parts.Spine;

public class Whale extends Mammal implements Water {

    public Whale(Spine spine) {
        super(spine);
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe");
    }

}
