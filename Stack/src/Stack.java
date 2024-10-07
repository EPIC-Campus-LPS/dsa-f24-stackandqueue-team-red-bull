import java.util.EmptyStackException;

public class Stack {
    int[] arr = new int[0]; //sets initial array to 0

    public int push(int element) { //method
        int[] arr2 = new int[arr.length + 1]; //creates new array that's 1 bigger than arr
        for (int i = 0; i < arr.length; i++) { //copies items in arr into arr2
            arr2[i] = arr[i];
        }
        arr2[arr.length] = element; //sets arr2's indexes to element
        arr = arr2; //resets arr so it can be used by the other methods
        for (int j = 0; j < arr.length; j++) { //prints out the arr
            System.out.println(arr[j]);
        }
        return element; //returns element
    }

    public int pop() {
        if (arr.length == 0) { //throws an error if the length of the array is 0
            throw new EmptyStackException();
        }
        int top = arr[arr.length - 1]; //index of top of arr
        int[] arr3 = new int[arr.length - 1]; //new arr that's 1 less than original
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr[i]; //sets index of arr to arr3 (copies it)
        }
        arr = arr3; //resets arr so it can be used by the other methods
        return top; //returns what the top of the stack is now
    }

    public int peek() {
        if (arr.length == 0) {
            throw new EmptyStackException();
        }
        return arr[arr.length - 1]; //finds the last element in the array and returns it
    }

    public int size() {
        return arr.length; //finds the length of the array
    }

    public boolean isEmpty() {
        if (arr.length == 0) { //checks to see if the array is empty
            return true;
        } else {
            return false;
        }
    }
}
