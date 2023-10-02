package web.model;

public class Car {

    private String model;
    private int plateNumber;
    private boolean isAmphibian;
    public Car() {
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
}
