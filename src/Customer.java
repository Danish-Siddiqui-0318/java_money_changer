public class Customer implements Cloneable {

    private int moneyGiven;

    Customer() {
        moneyGiven = 0;
    }

    Customer(int moneyGiven) {
        this.moneyGiven = moneyGiven;
    }

    Customer(Customer other) {
        this.moneyGiven = other.moneyGiven;
    }

    public int getMoneyGiven() {
        return moneyGiven;
    }

    public void setMoneyGiven(int moneyGiven) {
        this.moneyGiven = moneyGiven;
    }

    Customer deepCopy() {
        return new Customer(this.moneyGiven);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
