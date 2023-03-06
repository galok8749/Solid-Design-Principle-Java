package SRP.wrong;

public class Invoice {
    private Pen pen;
    private int quantity;

    public Invoice(Pen marker, int quantity) {
        this.pen = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = (pen.price * quantity);
        return price;
    }

    public void printInvoice() {
        // print the invoice
    }

    public void saveToDB() {
        // save data to DB
    }
}
