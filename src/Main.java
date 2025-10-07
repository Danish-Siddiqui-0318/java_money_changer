import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Total Bill: ");
        int bill = input.nextInt();
        System.out.println("Enter Money Given :");
        int money = input.nextInt();

        input.close();
        Customer customer1 = new Customer(money);
        ShopKeeper shop1 = new ShopKeeper(bill);


        shop1.giveChange(customer1.getMoneyGiven(), shop1.getTotalBill());
    }
}
