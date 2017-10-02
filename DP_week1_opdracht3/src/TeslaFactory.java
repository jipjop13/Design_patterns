public class TeslaFactory {

    public CarModel createCar(String carModel){
        if(carModel == null){
            return null;
        }
        if(carModel.equalsIgnoreCase("Model3")){
            return new Model3();

        } else if(carModel.equalsIgnoreCase("ModelX")){
            return new ModelX();

        } else if(carModel.equalsIgnoreCase("ModelS")){
            return new ModelS();
        }

        return null;
    }
}
