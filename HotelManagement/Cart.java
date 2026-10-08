public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void service() {
        requestCart(numberOfCarts);
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Requested number of carts: " + numberOfCarts + "\n");
    }
}