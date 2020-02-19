//ques3
//ClassNotFoundException
package java2;
    public class Example {

        public static void main(String args[])
        {
            try
            {
                Class.forName("single");
            }
            catch (ClassNotFoundException ex)
            {
                ex.printStackTrace();
            }
        }
    }

