package bai1_5;

public class Main {
    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("A238", "Pen Blue", 567, 0.07);
        System.out.println(i1);

        i1.setQty(999);
        i1.setUnitPrice(0.09);
        System.out.println(i1);
        System.out.println("id is: " + i1.getId());
        System.out.println("desc is: " + i1.getDesc());
        System.out.println("qty is: " + i1.getQty());
        System.out.println("unitPrice is: " + i1.getUnitPrice());
        System.out.println("The total is: " + i1.getTotal());
    }
}
