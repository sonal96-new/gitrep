//question number 11

package demo;

class SBI
{
    public double rateofinterest;
    public String IFSCCODE,Branchname;
    void getDetails(double rateofinterest,String IFSCCODE,String branchname)
    {
        this.rateofinterest=rateofinterest;
        System.out.println("the rate of interest : "+rateofinterest);
        this.IFSCCODE=IFSCCODE;
        System.out.println("the IFSCCODE : "+IFSCCODE);
        this.Branchname=Branchname;
        System.out.println("Branch name : "+ branchname);

    }
}
class BOI extends SBI{
    void getDetails(double rateofinterest,String IFSCCODE,String branchname){
        this.rateofinterest=rateofinterest;
        System.out.println("the rate of interest : "+rateofinterest);


        this.IFSCCODE=IFSCCODE;
        System.out.println("the IFSCCODE : "+IFSCCODE);
        this.Branchname=Branchname;
        System.out.println("Branch name : "+ branchname);
    }

}
class ICICI extends SBI{
    void getDetails(double rateofinterest,String IFSCCODE,String branchname) {
        this.rateofinterest = rateofinterest;
        System.out.println("the rate of interest : " + rateofinterest);
        this.IFSCCODE = IFSCCODE;
        System.out.println("the IFSCCODE : " + IFSCCODE);
        this.Branchname = Branchname;
        System.out.println("Branch name : " + branchname);
    }

}

public class BaseClassBank {

    public static void main(String[] args) {

        SBI sb=new SBI();
        sb.getDetails(12.5,"SBI9980023","kidwai nagar");

        SBI bo=new BOI();
        bo.getDetails(10.5,"BOI9980023","kayu koti");
        SBI ic=new ICICI();
        ic.getDetails(9.5,"ICICI9980023","birhana road");


    }
}
