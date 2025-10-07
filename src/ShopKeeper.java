public class ShopKeeper {
    private int totalBill;
    private int[] pakNotes = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

    ShopKeeper() {
        this.totalBill = 0;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int[] getPakNotes() {
        return pakNotes;
    }

    ShopKeeper(int totalBill) {
        this.totalBill = totalBill;
    }

    ShopKeeper(ShopKeeper other) {
        this.totalBill = other.totalBill;
        this.pakNotes = other.pakNotes;
    }

    void giveChange(int moneyGiven, int totalBill) {
        int change = moneyGiven - totalBill;
        if (totalBill>moneyGiven){
            System.out.println(totalBill-moneyGiven+" more required");
        }else {
            System.out.println("total change to return:" + change);
            for (int i = 0; i < getPakNotes().length; i++) {
                int noteCount = change / getPakNotes()[i];
                if (noteCount > 0) {
                    System.out.println(getPakNotes()[i] + " x " + noteCount);
                    change = change % pakNotes[i];
                }
            }
        }
    }
}

