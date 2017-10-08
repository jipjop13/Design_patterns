public class Human extends Creature {
    @Override
    void born() {
        System.out.println("Human is born");
    }

    @Override
    void life() {
        System.out.println("Human lives a happy life");
    }

    @Override
    void die() {
        System.out.println("Human dies");
    }
}
