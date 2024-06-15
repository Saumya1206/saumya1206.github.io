//A FUNCTION THAT CALLS ITSELF 
import java.util.*;
public class recursion {
   // public static void printNumb(int n){
//PRINT NUMBERS FROM 5 TO 1
    //     if (n==0) //bASE CASE
    //     return;

    //     System.out.println(n); //print
        
    //     printNumb(n-1); //recursion


    // }

    // public static void main(String[] args) {
    //     int n=5;
    //     printNumb(n);

//PRINT NUMBERS FROM 1 TO 5
    //          if (n==1)
    //          return;

    //          System.out.println(n);

    //          printNumb(n+1);
    // }
    //     public static  void main(String [] args) {
    //         int n=1;
    //         printNumb(n);



      //  }

//PRINT SUM OF FIRST N NATURAL NUMBER
        //  public static void printSum(int i, int n , int sum){
        //                              //first parameter-tells konse number p hai
        //                              //second p-base condition,final value of N
        //                              //thirs p-sum kya hone wla hai,final value store
        // if(i==n){ //base case
        // sum+=i;
        // System.out.println(sum);
        // return;
        // } 
          
        //  sum+=i;
        //   printSum(i+1, n, sum);
        //   System.out.println(i);

        //  }
        //  public static void main(String[] args) {
        //     printSum(1, 5, 0);
        //  }

//PRINT FACTORIAL OF A NUMBER N
        // public static int calcfactorial(int n){
        //     if(n==1||n==0){ //base case
        //         return 1;
        //     }
        //     //first step- kaam krna
        //     int fact_n1=calcfactorial(n-1); 
        //     int fact_1= n*fact_n1;
        //     return fact_1;
        // }

        // public static void main(String[] args) { //main function
        //     int n=5;
        //     int ans=calcfactorial(n);
        //     System.out.println(ans);
            
        // }

//PRINT THE FIBONNACI SERIES IE 0,1,1,2,3,5 {A,B,C WHERE C=A+B; FIRST- INFO, SEC- KAAM, THIRD-BASE CASE
        
        // public static void printFib(int a, int b, int n){ //a-second last term, b-last term
        //     if (n==0){
        //         return;
        //     } 
            
        //     //kaam
        //      int c=a+b;
        //      System.out.println(c);
        //      printFib(b, c, n-1);

        // }
        // public static void main(String[] args) {
        //     int a=0,b=1;
        //     System.out.println(a);
        //     System.out.println(b);
        //     int n =7;
        //     printFib(a,b,n-2);
        // }

//PRINT A STRING IN REVERSE.
 public static void printRev(String str, int idx){
    if (idx==0){
        System.out.println(str.charAt(idx));
        return;
    }
    
    System.out.println(str.charAt(idx));
    printRev(str, idx-1);
 }

 public static void main(String[] args) {
    String str="abcd";
    printRev(str, str.length()-1);
 }




}                                
    

