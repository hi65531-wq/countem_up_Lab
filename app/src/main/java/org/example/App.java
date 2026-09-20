package org.example;

public class App {
  public static void main(String[] args) {
    GroceryCounter counter = new GroceryCounter();
    System.out.println("Starting Counter");
    System.out.println("Total: " + counter.total());
    System.out.println("Overflow: " + counter.overFlow());

    counter.tens();
    counter.tens();
    counter.tenths();

    System.out.println("After adding 2 tens and 1 tenth: ");
    System.out.println("Total: " + counter.total());
    System.out.println("Overflow: " + counter.overFlow());
    System.out.println();

    for(int i = 0; i < 35; i++) {
        counter.ones();
    }
    System.out.println("After adding  35 ones: ");
    System.out.println("Total: " + counter.total());
    System.out.println("Overflow: " + counter.overFlow());
    System.out.println();

    for(int i = 0; i < 100; i++) {
        counter.ones();
    }
    System.out.println("After adding 100 ones: ");
    System.out.println("Total: " + counter.total());
    System.out.println("Overflow: " + counter.overFlow());
    System.out.println();

    counter.reset();
    System.out.println("After reset:");
    System.out.println("Total: " + counter.total());
    System.out.println("Overflow: " + counter.overFlow());
  }
}
