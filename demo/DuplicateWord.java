
//question number 2
package demo;

public class DuplicateWord {
    public static void main(String[] args) {
        String str = "A short boy was playing with a tall girl and tall boy on a small ground";
        int count, c=0;

        str = str.toLowerCase();


        String words[] = str.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                    words[j] = " ";
                }

            }
            if (count > 1 && words[i] != " ") {


                System.out.println(words[i]);
                c++;
            }

        }
        System.out.println("The count of duplicate words : " + c);

    }
}

