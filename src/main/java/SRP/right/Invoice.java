package SRP.right;


public class Invoice {
    private Pen marker;
    private int quantity;

    public Invoice(Pen marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = (marker.price * quantity);
        return price;
    }
}
