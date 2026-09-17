package org.example;

public class GroceryCounter {
    private int count;
    private int overFlow;

    public GroceryCounter() {
        this.count = 0;
        this.overFlow = 0;
    }

    public void ones() {
        this.count += 100;
        checkOverFlow();
    }

    public void tens() {
        this.count += 1000;
        checkOverFlow();
    }

    public void tenths() {
        this.count += 10;
        checkOverFlow();
    }

    public void hundredths() {
        this.count += 1;
        checkOverFlow();
    }

    private void checkOverFlow() {
        if(this.count > 9999) {
            this.count -= 10000;
            this.overFlow++;
        }
    }

    public String total() {
        double total = this.count / 100.0;
        return String.format("$%.2f", total);
    }

    public int overFlow() {
        return this.overFlow;
    }

    public void reset() {
        this.count = 0;
        this.overFlow = 0;
    }

}
