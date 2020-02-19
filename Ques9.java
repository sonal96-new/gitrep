
//9.  Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
// There are stress and fire tests for each products.
package java2;

import java.util.Scanner;

 interface Furniture {
   public   void stressTest();
   public   void fireTest();
}

abstract class Chair implements Furniture {
    abstract String chairType();

}
 abstract class Table implements Furniture {
     abstract String tableType();
}

class MetalChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }

    @Override
    public void fireTest() {
        System.out.println("failed fire Test");
    }
    @Override
    public String chairType() {

        String s = "This is a metal chair";
        return s;
    }

}

 class MetalTable extends Table {
    @Override
    public void stressTest() {

        System.out.println("Passed Stress Test");
    }

    @Override
    public void fireTest() {

        System.out.println("Passed Fire Test");
    }

    @Override
    public String tableType() {

        String s = "This is a metal Table";
        return s;
    }
}


 class WoodenTable extends Table {
    @Override
    public void stressTest() {

        System.out.println("Failed Stress Test");
    }

    @Override
    public void fireTest() {
        System.out.println("passed Fire Test");
    }

    @Override
    public String tableType() {
        String s = "This is a wooden Table";
        return s;
    }
}


class WoodenChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }

    @Override
    public void fireTest() {
        System.out.println("failed fire Test");
    }
    @Override
    public String chairType() {
        String s = "This is a wooden chair";
        return s;
    }
}

public class Ques9 {
    public static void main(String[] args){
        Table table=null;
        System.out.println("Enter the input");
        Scanner in =  new Scanner(System.in);
        String str = in.next();
        switch(str)
        {
            case "metal":
            table = new MetalTable();
            break;
            case "wooden":
                table = new WoodenTable();
                break;
            default:
                System.out.println("wrong choice is entered");
        }
        System.out.println(table.tableType());
        table.stressTest();
        table.fireTest();

    }
}
