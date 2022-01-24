public class Bike extends Vehicle{
    private byte standCount;
    private final String TYPE = "Bike";

    public void setStandCount(byte standCount){
        this.standCount = standCount;
    }

    public byte getStandCount() {
        return standCount;
    }

    public String getTYPE() {
        return TYPE;
    }

    public Bike(String makeModel, byte standCount, Colour colour, String lisencePlate, int tyreCount, int passengerCount) {
        this.makeModel = makeModel;
        this.standCount = standCount;
        this.colour = colour;
        this.liscencePlate = lisencePlate;
        this.tyresCount = tyreCount;
        this.passengerCount = passengerCount;
    }
}
