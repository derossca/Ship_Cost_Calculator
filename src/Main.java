//importing scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //class ShippingCosts
        //	main()
        //		num itemPrice
        //		num shippingCost
        //		output “What is the cost of the item?”
        //		input itemPrice
        //		if itemPrice >= 100 then
        //			shippingCost = 0
        //			output “Shipping is “ + shippingCost + “. “ + “Your total is “ + shippingCost + itemPrice
        //		else
        //			shippingCost = 0.02 * itemPrice
        //			output “Shipping is “ + shippingCost + “. “ + “Your total is “ + shippingCost + itemPrice
        //		end if
        //	return
        //end class

        //calling in scanner
        Scanner in = new Scanner(System.in);
        //declaring variables
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = itemPrice + shippingCost;
        //output asking for itemPrice
        System.out.println("What is the cost of the item?");
        //input itemPrice
        itemPrice = in.nextDouble();
        //clear buffer
        in.nextLine();
        //if statements with input of itemPrice and output shipping cost and total cost
        if(itemPrice >= 100){
            shippingCost = 0;
            System.out.println("Shipping is " + shippingCost + " and your total is " + (shippingCost + itemPrice));
        }
        //else shipping is 2% of itemPrice and output shipping and total cost
        else {
            shippingCost = .02 * itemPrice;
            System.out.println("Shipping is " + shippingCost + " and your total is " + (shippingCost + itemPrice));
        }
    }
}