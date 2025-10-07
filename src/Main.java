public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setMoneyGiven(2000);
        ShopKeeper shop1 = new ShopKeeper();
        shop1.setTotalBill(1500);
        customer1.setMoneyGiven(10000);
        shop1.setTotalBill(7250);
        customer1.setMoneyGiven(5000);
        shop1.setTotalBill(10000);

        shop1.giveChange(customer1.getMoneyGiven(), shop1.getTotalBill());
    }
}
