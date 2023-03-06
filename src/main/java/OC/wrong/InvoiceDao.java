package OC.wrong;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // save to DB
    }

    public void saveToFile(String fileName) {
        // save to file with name fileName
    }
}
