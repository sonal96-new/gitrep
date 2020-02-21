/* Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(),
isFull() and an additional operation getMin() which should return minimum element from the SpecialStack.
(Expected complexity -O(1))
*/
package Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

class SpecialStack extends Stack<Integer>
{
    SupportStack s;

    public SpecialStack(int n) {
        super();
        s = new SupportStack(n);
    }

    @Override
    public Integer push(Integer item) {

        if(s.isEmpty())
            s.push(item);
        if(item < s.lastElement())
            s.push(item);
        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {

        if(s.contains(this.lastElement()))
            s.pop();
        return super.pop();
    }

    @Override
    public boolean empty() {
        return super.empty();
    }

    @Override
    public synchronized int search(Object o) {
        return super.search(o);
    }


    public int getMin()
    {
        return (int)s.lastElement();
    }


}

class SupportStack extends Stack<Integer>
{
    public SupportStack(int n) {
        super();
    }

    @Override
    public Integer push(Integer item) {
        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {
        return super.pop();
    }

    @Override
    public boolean empty() {
        return super.empty();
    }

    @Override
    public synchronized int search(Object o) {
        return super.search(o);
    }
}


class myClass
{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n = obj.nextInt();
        SpecialStack stack = new SpecialStack(n);

        int ch;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Push\n2. Pop\n3. Check if empty\n4. Check if full\n5. Check the minimum element in the stack.\n" +
                    "Press 6 to exit.");

            ch = obj.nextInt();

            switch(ch)
            {
                case 1:
                    if(stack.size() != n) {
                        System.out.println("Enter the Element: ");
                        int d = obj.nextInt();
                        stack.push(d);
                        System.out.println(d+" PUSHED INTO STACK");
                    }
                    else {
                        System.out.println("\n STACK IS FULL ! POP OUT ELEMENT BEFORE PUSH. \n");
                    }
                    break;

                case 2:
                    if(!stack.isEmpty()) {
                        int x = stack.pop();
                        System.out.println("POP :" + x);
                    }
                    else {
                        System.out.println("\n Empty \n");
                    }
                    break;

                case 3:
                    if(stack.isEmpty())
                        System.out.println("\n Empty \n");
                    else
                        System.out.println("\n Not Empty \n");
                    break;

                case 4:
                    if(stack.size() == n)
                        System.out.println("\n Stack full \n");
                    else
                        System.out.println("\n Not yet full. \n");
                    break;

                case 5:
                    if(!stack.isEmpty())
                        System.out.println("\n MINIMUM ELEMENT: " + stack.getMin() + "\n");
                    else
                        System.out.println("\n Empty \n");
                    break;

            }

        }while(ch != 6);
    }
}
