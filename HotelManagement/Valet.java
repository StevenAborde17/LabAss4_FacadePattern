public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void service() {
        pickUpVehicle(plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Vehicle with the plate number " + plateNumber + " is ready for pick up.");
    }
}