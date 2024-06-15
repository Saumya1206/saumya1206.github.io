    //returnType functionName(type agr1, type arg2..) {
        //operation
    //(rt=> can be integer,string,float etc.)
    //void=> no return
    //function name should not be a keyword. ie. random name or precised name of the code.
    //args means input. Firstly we will define type ie. can be string,float,integer etc
    //for ex. int age, float temp.
 
// Print a given name in function
// import java.util.*;
// public class functions {
//     public static void printMyName (String name){
//         System.out.println(name);
//         return;
//     }

//     //take input from user
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     String name=sc.next();
    
//     printMyName(name); //function ko call kiya
// }

// }

//Make a function to add 2 numbers and return their sum
import java.util.*;
public class functions{
//     public static int calculateSum(int a , int b){ //args cane be passed  in two ways below;
//                                                    // by reference or by value
       
//        // definig sum variable                  //doing calc directly, ex product of a and b
//         int sum = a+b;                          // return a * b;
//         return sum;
//         // or we can directly a and b directly and by not defining a and b variable again 
        
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

// // we need to make sum variable for both main function and new function for sum.
//         int sum = calculateSum(a, b);
//         System.out.println(sum);
        
        //Doing it directly for multiplication of a and b
        //System.out.println("Product of two number is: "+ calculateProduct(a, b));


//Find the factorial of the number.
        public static void printFactorial(int n){
            //loop
            int factorial=1;
            for(int i=n;i>=1;i--){
                factorial=factorial*i;
            }
            System.out.println(factorial); // no need of returning value in void function.
            return;

        }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();

            printFactorial(n);
        }
        }









    
    

