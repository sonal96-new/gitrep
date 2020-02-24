package Java8;

//Implement multiple inheritance with default method inside interface.
interface RedLight{
    default void redSignal(){
        System.out.println("Redlight means : " + "stop");
    }

    default void print(){
        System.out.println("Indication to stop ");
    }
}

interface GreenLight
{
    default void greenSignal(){
        System.out.println("Greenlight means : " + "Go");
    }
//overridden
    default void print(){
        System.out.println("Indication to go");
    }
}

 class TrafficLight implements RedLight, GreenLight {

    public void print(){
        System.out.print("Redlight show : ");
        RedLight.super.print();
        System.out.print("GreenLight shows : ");
        GreenLight.super.print();
    }

    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight();
        tl.print();
        tl.redSignal();
        tl.greenSignal();

    }
}