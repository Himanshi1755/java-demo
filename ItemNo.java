import java.util.Scanner;

public class ItemNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define variables
        int itemNo;
        int qty;
        double rate, totalAmount, discount, finalAmount;
        
        // Item details
        System.out.print("Enter Item_No: ");
        itemNo = sc.nextInt();

        System.out.print("Enter Quantity: ");
        qty = sc.nextInt();

        System.out.print("Enter Rate : ");
        rate = sc.nextDouble();

        // Calculate total amount
        totalAmount = qty * rate;

        // Apply discount if applicable (10% discount if totalAmount is more than 1000)
        if (totalAmount > 200) {
//discount = 5;
            discount = totalAmount * 0.5;  // 5% discount
        } else {
            discount = 0;
        }

        // Final amount after discount
        finalAmount = totalAmount - discount;

        // Display Product Details
        System.out.println("\n---- Product Details -----:");
        System.out.println("Item_No: " + itemNo);
        System.out.println("Quantity: " + qty);
        System.out.println("Rate: " + rate);
        System.out.println("Total Amount: " + totalAmount);
       // System.out.println("Discount: " + discount);
        System.out.println("Amount after Discount: " + finalAmount);

        sc.close();
    }
}
