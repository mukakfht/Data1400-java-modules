import javax.swing.JOptionPane;

public class CoffeeMachine {
    String brand;

    public CoffeeMachine() {
        this.brand = JOptionPane.showInputDialog("Hvilket merke er kaffemaskien?");


    }


    public String brew() {
        return "En kopp filterkaffe fra " + brand;
    }

    /*public String brew(String coffeeType, int cups) {
        return cups + " kopper " + coffeeType+  " fra " + brand;

    }

    public String brew(int cups){
        return cups + " kopper filterKaffe fra " + brand;
    }
    */

    //  public void brew() {
    //    System.out.println("En kopp filterkaffe fra " + brand);
    // }

}
