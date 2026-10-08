public class FrontDesk {
    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk(String plateNumber, int roomNumber, int numberOfCarts) {
        valet = new Valet(plateNumber);
        housekeeping = new HouseKeeping(roomNumber);
        cart = new Cart(numberOfCarts);
    }

    public void offerServices() {
        valet.service();
        housekeeping.service();
        cart.service();
    }
}