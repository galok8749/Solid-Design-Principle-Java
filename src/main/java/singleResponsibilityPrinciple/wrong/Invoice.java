package singleResponsibilityPrinciple.wrong;

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

    public void printInvoice() {
        // print the invoice
    }

    public void saveToDB() {
        // save data to DB
    }
}
