import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {


        // ================== Task 1 ==================
        // 1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2 

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(-20);
        arr.add(0);
        arr.add(30);
        arr.add(40);
        arr.add(60);
        arr.add(10);

        System.out.println(arr.getFirst().equals(arr.getLast()));



        // ================== Task 2 ================== 
        // 2.Write a Java program to find the numbers greater than the average of the numbers of a given array.

        ArrayList<Integer> numbers = new ArrayList<>(); 
        numbers.add(1); 
        numbers.add(4); 
        numbers.add(17); 
        numbers.add(7); 
        numbers.add(25); 
        numbers.add(3); 
        numbers.add(100);
        
        int sum = 0; 

        for(int number : numbers){
            sum += number;
        }

        double average = sum / numbers.size();

        System.out.printf("The avarage of said is: %.1f The numbers in the said array that are greater than the average are: ", average);

        for (int number : numbers ){
            if(number > average){
                System.out.print(number + " ");
            }
        }





        // ================== Task 3 ================== 
        // 3.Write a Java program to get the larger value between first and last element of an array of integers.


        ArrayList<Integer> numbers = new  ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        int first = numbers.getFirst(); 
        int last = numbers.getLast(); 

        if(first > last){
            System.out.println("Larger value between first and last element: " + first);
        }else {
            System.out.println("Larger value between first and last element: " + last);
        }

        // ================== Task 4 ================== 
        // 4.Write a Java program to swap the first and last elements of an array and create a new array.


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20); 
        numbers.add(30); 
        numbers.add(40); 

        int first = numbers.getFirst(); 
        int last = numbers.getLast(); 
        ArrayList<Integer> swapNumbers = new ArrayList<>(numbers);
        swapNumbers.set(swapNumbers.size() -1, first); 
        swapNumbers.set(0, last);
        
        System.out.println(numbers);
        System.out.println("New array after swappeng the first and last elements: "+ swapNumbers);



        // ================== Task 5 ================== 
        // 5. Write a program that places the odd elements of an array before the even elements.
    
        int[] numbers = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        ArrayList<Integer> evenNumbers = new ArrayList<>(); 
        ArrayList<Integer> oddNumbers = new ArrayList<>(); 

        for(int number: numbers){
            if(number % 2 != 0 ){
                oddNumbers.add(number); 
            }else {
                evenNumbers.add(number); 
            }
        }


        oddNumbers.addAll(evenNumbers);

        System.out.println("Orginal Array: " + Arrays.toString(numbers) + " \nNew Places: "+oddNumbers);        
        

        // ================== Task 6 ==================
        // 6. Write a program that test the equality of two arrays.

        ArrayList<Integer> numbers = new ArrayList<>(); 
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(6);
        numbers.add(4);

        ArrayList<Integer> numbers_two = new ArrayList<>();
        numbers_two.add(2);
        numbers_two.add(3);
        numbers_two.add(6);
        numbers_two.add(6);
        numbers_two.add(4);

        System.out.println(numbers.equals(numbers_two));
        
    }
}
