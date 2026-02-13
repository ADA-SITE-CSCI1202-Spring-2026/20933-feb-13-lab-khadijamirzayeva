package week03.invoice;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }


    public String getPartNumber() { return partNumber; }
    public String getPartDescription() { return partDescription; }
    public int getQuantity() { return quantity; }
    public double getPricePerItem() { return pricePerItem; }

       public static void main(String[] args) {
        Invoice inv = new Invoice("1234", "Hammer", 5, 19.99);

        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price per Item: $" + inv.getPricePerItem());
        System.out.println("Total Amount: $" + (inv.getQuantity() * inv.getPricePerItem()));
    }
}
