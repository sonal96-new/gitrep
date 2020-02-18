
//question number 4
package demo;

public class Number {
    static void Percentage(String str)
    {
int l=str.length();
int upper=0,lower=0,other=0,digits=0;
for(int i=0;i<l;i++) {
    char ch = str.charAt(i);
    if (Character.isUpperCase(ch)) {
        upper++;
    } else if (Character.isLowerCase(ch)) {
        lower++;
    } else if (Character.isDigit(ch)) {
        digits++;
    } else {
        other++;
    }
}
    System.out.println("the total no of uppercase characters are :" + upper);
    System.out.println("the total no of lowercase characters are :" + lower);
    System.out.println("the total no of digits  are :" + digits);
    System.out.println("the total no of others characters are :" + other);
    double upperPercent = (upper * 100) / l;
    double lowerPercent = (lower* 100) / l;
    double digitsPercent = (digits * 100) /l;
    double otherPercent = (other * 100) / l;

        System.out.println("the percentage of  uppercase characters are :" + upperPercent + "%");
        System.out.println("the percentage of  lowercase characters are :" + lowerPercent + "%");
        System.out.println("the percentage of  digits are :" + digitsPercent + "%");
        System.out.println("the percentage of  other characters are :" + otherPercent + "%");


    }

    public static void main(String[] args) {
        Percentage("I got 99% Marks in Maths");
    }
}
