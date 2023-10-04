package web.model;

public class Car {

    private String model;

    private int plateNumber;

    private boolean isAmphibian;

    public Car() {
    }
    public Car(String model, int plateNumber, boolean isAmphibian) {
        this.model = model;
        this.plateNumber = plateNumber;
        this.isAmphibian = isAmphibian;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean getIsAmphibian() {
        return isAmphibian;
    }

    public void setIsAmphibian(boolean amphibian) {
        isAmphibian = amphibian;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", plateNumber=" + plateNumber +
                ", isAmphibian=" + isAmphibian +
                '}';
    }

}
