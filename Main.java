public class Main {
    public static void main(String[] args) {
    Car myCarObj = new Car("Maruti Suzuki - Alto LXI 2002", (byte)4, Colour.Pearl, "UP70A2409", 4,4 );
    Bike myBikeObj = new Bike("Royal Enfield - Continental ABS", (byte)2, Colour.Red, "MP042305", 2, 2);
    Vehicle mySecondCarObj = new Car("Maruti Suzuki - Baleno Alpha", (byte)4, Colour.Blue, "DL12CK3318", 4,5);
    System.out.println(fetchVehicleData(myCarObj));
    System.out.println(fetchCarData(myCarObj));
    System.out.println(fetchBikeData(myBikeObj));

    }

    private static String fetchVehicleData(Vehicle vehicleObj){
        String vehicleDetail;
        vehicleDetail = "****************************************************************************\n"+
                "CANNOT EXTRACT MAKEMODEL HERE Because the Scope of Vehicle Object cannot touch Derived Class objects"
                +"\nColour: "+vehicleObj.getColour()+"\nLicense Plate: "+vehicleObj.getLiscencePlate()+
                "\nTyres: "+vehicleObj.getTyresCount()+"\nCapacity: "+vehicleObj.passengerCount + " adults";
    return vehicleDetail;
    }

    private static String fetchCarData(Car carObj){
        String carDetails;
        carDetails = "****************************************************************************\n"+
                "\nMake and Model: "+carObj.getMakeModel()
    +"VehicleType: "+carObj.getTYPE()+"\nDoors: "+carObj.getDoorCount()+"Colour: "+carObj.getColour()+
            "\nLisence Plate: "+carObj.liscencePlate+ "\nTyres: "+carObj.getTyresCount()+"\nCar Seating Capacity: "+carObj.passengerCount + " adults";
        return carDetails;
    }
    private static String fetchBikeData(Bike bikeObj){
        String bikeDetails;
        bikeDetails = "****************************************************************************\n"+
                "\nMake and Model: "+bikeObj.getMakeModel()+"VehicleType: "+bikeObj.getTYPE()+"\nNumber Of Stands: "+bikeObj.getStandCount()+"\nColour: "+bikeObj.getColour()+
                "\nLisence Plate: "+bikeObj.liscencePlate+ "\nTyres: "+bikeObj.getTyresCount()+"\nBike Capacity: "+bikeObj.passengerCount + " adult(s) (Rider + Only One Pillion)/Only Single Rider";
        return bikeDetails;
    }

}
