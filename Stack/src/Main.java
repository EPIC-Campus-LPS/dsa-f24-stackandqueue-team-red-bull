public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(2); //adds new elements to array
        stack.push(4);
        stack.push(10);
        stack.push(7);
        stack.push(2);
        stack.push(8);

        System.out.println(stack.isEmpty()); //checks to see if the array is empty
        System.out.println(stack.peek()); //finds the top element in the array
        stack.pop(); //removes top element
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.size()); //checks the size of the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.size());
        stack.pop(); //triggers EmptyStackException
    }
}