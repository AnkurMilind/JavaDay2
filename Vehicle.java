public class Vehicle{
    protected String liscencePlate, makeModel;
    protected int tyresCount, passengerCount;
    protected Colour colour;

public String getMakeModel(){
    return this.makeModel;
}

    public Colour getColour() {
        return colour;
    }

    public String getLiscencePlate() {
        return liscencePlate;
    }

    public int getTyresCount() {
        return tyresCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}
