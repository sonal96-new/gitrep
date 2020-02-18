
//question number 9
package demo;

enum House {

    Flat(15000),Apartment(70000),Bungalow(200000),Rent(12000),House(18000);
    private int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class Main{
    public static void main(String args[])
    {
        System.out.println("All house prices:");
        for (House h : House.values())
            System.out.println(h + " costs " + h.getPrice());
    }
}



