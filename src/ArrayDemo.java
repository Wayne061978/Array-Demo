import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {

    Scanner input = new Scanner(System.in);

    /**
     * The Arrays.toString() method returns a string representation of the
     * array contents. Useful for quickly displaying array elements without writing a loop.
     */
    public void useToString(){
        int []  numbers = {5, 10, 15, 20, 25};

        System.out.println("Array Elements:  " + Arrays.toString(numbers));
    }

    /**
     * The Arrays.fill() method assigns a specified value to each element
     * of the array or a specific range.
     */
    public void useFill(){
        int[] numbers = new int[5];
         Arrays.fill(numbers, 7);
        System.out.println("Array Elements:  " + Arrays.toString(numbers));

    }

    /**
     * The Arrays.fill() method assigns a specified value to each element of the
     * array or a specific range.
     */

    public void useSort(){
        int [] numbers = {25, 5, 15, 10, 20};
        Arrays.sort(numbers);
        System.out.println("Array Elements:  " + Arrays.toString(numbers));
    }

    /**
     * For loop, Manually copy each element using a loop.
     */
    public void useForLoop(){
        int [] source = {5, 10, 15};
        int [] destinaiton = new int[source.length];
        System.out.println("New destination Array:");
        for(int i =0; i < source.length; i++){
            destinaiton[i] = source[i];

            System.out.println(destinaiton[i]);
        }
    }

    /**
     * Copying Arrays Using Object.clone()
     * The clone() method creates a new array with the same contents.
     */
    public void useClone(){
        int [] source = {2,4,6};
        int [] destination = source.clone();
        System.out.println(Arrays.toString(destination));
    }

    /**
     * Copying Arrays Using System.arraycopy()
     * Efficiently copies array elements using native optimization.
     */
    public void useArrayCopy(){
        int [] source = {2,4,8,6,3};
        int [] destination = new int[source.length];

        System.arraycopy(source, 0, destination, 0, source.length);
        System.out.println(Arrays.toString(destination));

    }

    /**
     * Copying Arrays Using Arrays.copyOf()
     * Creates a new array by copying specified elements
     */
    public void useCopyOf(){
        int[] source = {6, 7, 8};
        int [] destination = Arrays.copyOf(source, source.length);
        System.out.println(Arrays.toString(destination));
    }

    /**
     * Copying Arrays Using Assignment Statement
     * Assignment creates a reference to the same array.

     */
    public void useAssignmentStatement() {
        int[] source = {5, 10, 15};
        int[] destination = source;  // Points to same array
        System.out.println(Arrays.toString(destination));
    }

    /**
     * Initializing Arrays With Input Values
     * Prompt the user for array elements and populate it.
     */

    public void populateArray(){
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[5];
        System.out.println("Enter 5 integers: ");

        //Input element into the array
        for(int i =0; i < numbers.length; i++){
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for(int num : numbers){
            System.out.println(num);
        }
    }

    /**
     * Initializing Arrays With Random Values
     * Use the Random class to populate arrays with random values.
     */

    public void useRandom(){
        Random random = new Random();
        int [] numbers = new int[5];
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        for( int number : numbers){
            System.out.println(number);
        }
    }

    /**
     * Summing All Elements in an Array
     * Iterate through the array to calculate the sum.
     */
    public void useSumArrayElements(){
        int [] numbers = {5, 10, 15};
        int sum = 0;
        for(int num : numbers){
            sum += num;  //running total
        }
        System.out.println("Sum: " + sum);
    }

    /**
     * Finding Maximum Element in Array
     * Find the largest element in the array.
     */
    public void findMaxElementValue(){
        //Prompt user to input the size of array
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();

        //Initialize the array
        int [] numbers = new int[n];

        //Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

       //Find the maximum value
        int max = numbers[0]; //Assume the first element is the largest
        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        //display the max value
        System.out.print("The maximum element in the array is: " + max);

    }

    /**
     * Printing Array in Reverse Order
     * Iterate backward to display elements in reverse.
     */

    public void reverseArray(){
        int [] numbers = {1,2,3,4,5,6,7};

        for(int i = numbers.length-1; i >= 0; i--){
            System.out.print(numbers[i] + " ");

        }
    }

}
