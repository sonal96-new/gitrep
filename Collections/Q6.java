//Write a program to sort the Student objects based on Score , if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

package Collections;
import java.util.*;

class Student {
    private int age;
    private double score;
    private String name;
    public Student(String name, Double score, int age){
        this.age = age;
        this.score = score;
        this.name = name;
    }
    @Override
    public String toString() {
        return " {name: " + name + " age: " + age + " score: " + score + "}";
    }

    public Double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}
class StudentSortingComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        // all comparison
        int compareName = s1.getName()
                .compareTo(s2.getName());
        int compareScore = s1.getScore()
                .compareTo(s2.getScore());



        if(compareScore == 0) {
            return ((compareName == 0) ? compareScore : compareName);
        }
        else {
            return compareScore;
        }
    }
}
public class Q6 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Nitin", 94.24, 25));
        list.add(new Student("Rahul", 75.34, 24));
        list.add(new Student("Simi", 45.34, 28));
        list.add(new Student("Reena", 85.34, 26));
        list.add(new Student("Neha", 94.24, 25));
        list.add(new Student("Richa", 55.34, 27));
        list.add(new Student("Rekha", 55.34, 26));
        Iterator<Student> stIterator = list.iterator();

        System.out.println("Before Sorting:\n");
        while (stIterator.hasNext()) {
            System.out.println(stIterator.next());
        }

        Collections.sort(list,new StudentSortingComparator());

        System.out.println("\n\n After Sorting:\n");
        for (Student values : list) {
            System.out.println(values);
        }

    }
}
