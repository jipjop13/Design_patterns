public class Main {
    public static void main(String[] args) {
        TeslaFactory factory = new TeslaFactory();

        //Create model X
        CarModel car1 = factory.createCar("ModelX");
        car1.AssembleCar();

        //create model S
        CarModel car2 = factory.createCar("ModelS");
        car2.AssembleCar();

        //Create Model 3
        CarModel car3 = factory.createCar("Model3");
        car3.AssembleCar();
    }
}
