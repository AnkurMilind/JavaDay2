public class Car extends Vehicle{
    private final String TYPE = "Car";
    private byte doorCount;

    public void setDoorCount(byte doorCount) {
        this.doorCount = doorCount;
    }

    public String getTYPE() {
        return TYPE;
    }

    public byte getDoorCount() {
        return doorCount;
    }

    public Car(String makeModel, byte doorCount, Colour colour, String lisencePlate, int tyreCount, int passengerCount) {
        this.makeModel = makeModel;
        this.doorCount = doorCount;
        this.colour = colour;
        this.liscencePlate = lisencePlate;
        this.tyresCount = tyreCount;
        this.passengerCount = passengerCount;
    }
}
