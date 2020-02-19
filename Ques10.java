
/*10. Design classes having attributes and method(only skeleton) for a coffee shop.
        There are three different actors in our scenario and i have listed the different actions they do also below*/
package java2;

import java.util.LinkedList;
import java.util.Queue;

class Customer
{
    public int token;
    final int amount=50;
  //places the order and also pay the cash
 void  placeOrder()
 {}
 //here token is generated
 void getToken()
 {}
 //received the notification
  void message(String s)
 {
     System.out.println(s);
 }

}
class Casier extends Customer
{
    public Queue<Integer> queue=new LinkedList<>();
//get the order and payment from customer
    void getOrder()
{}
//create order and generate token
void createOrder()
{}
//notify the customer
 void message(String s)
{
    message(s);
}
}
class Barista extends Casier
{
void nextOrder()
{}
void prepare()
{}

}
public class Ques10 {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.placeOrder();
        c.getToken();
        Casier ca=new Casier();
        ca.getOrder();
        ca.createOrder();
        ca.message("you have to wait for your token");
        Barista b=new Barista();
        b.nextOrder();
        b.prepare();
        Barista ba = (Barista) new Customer();
        ba.message("your order is ready");

    }
}
