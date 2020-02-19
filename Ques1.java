
/*1. Create Java classes having suitable attributes for Library management system.
 Use OOPs concepts in your design.Also try to use interfaces and abstract classes.*/

package java2;

import java.util.Scanner;

interface Person
{
    abstract String get_department();

}
abstract class Book
{
    public String book_name;
    public int book_id;
    public String author_name;
    public Book(String n,int id,String author_name)
    {
        this.book_name=n;
        this.book_id=id;
        this.author_name=author_name;
    }

    abstract String getName();
    abstract String getAuthorName();
    abstract int getBookId();

}

 class Comics extends Book
{


    public Comics(String n, int id, String author_name )
    {
        super(n,id,author_name);
    }
    public String getName()
    {
        return this.book_name;
    }
    public String getAuthorName()
    {
        return this.author_name;
    }
    public int getBookId()
    {
        return this.book_id;
    }
}


class Novels extends Book
{


    public Novels(String n, int id, String author_name )
    {
        super(n,id,author_name);
    }
    public String getName()
    {
        return this.book_name;
    }
    public String getAuthorName()
    {
        return this.author_name;
    }
    public int getBookId()
    {
        return this.book_id;
    }
}
class Librarian
{

   public void add_books(String b)
   {
       System.out.println("the one book is added "+ b);
   }


    public void Return_books(String b_name,String author)
    {
        System.out.println("the name of the book  which is returned " + b_name + " author of book " + author);
    }
}

class Student implements Person
{

    String dept;
    int s_id;
    String st_name;
    public Student(String st_name,String d, int id)
    {
        dept = d;
        s_id = id;
        this.st_name=st_name;
    }

@Override
    public String get_department()
    {
        return dept;
    }
    public String get_Name()
    {
        return st_name;
    }
    public int get_id()
    {
        return s_id;
    }
    public void issue_book()
    {

    }
}
class Teacher implements Person
{

    String dept;
    int t_id;
    String t_name;
    public Teacher(String name,String d, int id)
    {
        dept = d;
        t_id = id;
        this.t_name=name;
    }

    @Override
    public String get_department()
    {
        return dept;
    }
    public String get_Name()
    {
        return t_name;
    }
    public int get_id()
    {
        return t_id;
    }
}

public class Ques1 {
    public static void main(String[] args)
    {
        int choice;
        Scanner s=new Scanner(System.in);
            System.out.println("Welcome to library");
            System.out.println("Enter 1 for student,2 for teacher,3 for Admin");

            do
            {
                System.out.println("enter your choice or If you want to exit then enter 0");
                choice=s.nextInt();
            switch (choice)
            {
                case 1:
                    Student st = new Student("sonal", "IT", 4147);
                    System.out.println("name of student " + st.get_Name());
                    break;
                case 2:
                    Teacher t = new Teacher("Jatin", "IT", 4156);
                    System.out.println("name of teacher " + t.get_Name());
                    break;
                case 3:
                    Librarian l = new Librarian();
                    l.add_books("2 states");
                    l.Return_books("Touch the sky", "Rashmi bansal");
                    break;
                default:
                    System.out.println("wrong choice is entered");
            }
        }

        while(choice!=0);

    }
}
