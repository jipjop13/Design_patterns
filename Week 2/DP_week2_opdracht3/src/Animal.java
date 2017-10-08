public class Animal extends Creature {
    @Override
    void born() {
        System.out.println("Animal is born");
    }

    @Override
    void life() {
        System.out.println("Animal lives a happy life");
    }

    @Override
    void die() {
        System.out.println("Animal died");
    }
}
