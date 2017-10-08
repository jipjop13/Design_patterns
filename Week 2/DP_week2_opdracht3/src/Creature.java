public abstract class Creature {
    abstract void born();
    abstract void life();
    abstract void die();

    public final void circleOfLife(){

        //get born
        born();

        //life
        life();

        //die
        die();

    }
}
