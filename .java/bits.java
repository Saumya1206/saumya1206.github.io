import java.util.*;
public class bits {
    private static int i;

    public static void main (String args[]) {
//Get Bit
//bitmask : 1<<i
//Operation : And
    //  int n=5;
    //  int pos=1;
    //  int bitMask=1<<pos;
    
    //  if ((bitMask & n)==0){
    //     System.out.println("bit was zero");
    //  } else {
    //     System.out.println("bit was one");
    //  }

//Set Bit
//bitmask : 1<<i
//operation : Or
    //  int newNumber = bitMask|n;
    //  System.out.println(newNumber);

//Clear Bit
//Bitmask: 1<<i
//operation : AND with NOT
 
        //  int notBitMask = ~(bitMask);
        //  int newNumber= notBitMask & n;
        //  System.out.println(newNumber);

   
//UPDATE BIT
//For 1==>0 CLEAR HI HAI
//bitmask:1<<i
//operation- AND with NOT

//For 0==>1 SET HI HAI
//bitmask:1<<i
//operation- OR
    Scanner sc= new Scanner(System.in);
    int oper=sc.nextInt();
    //oper=1 > SET, opper=0 > CLEAR

     int n =5;
     int pos=1;     
     //(for info only) int oper=1; //update bit to 1 else update bit to 0
    
     
    int bitMask = 1<<pos;
     
     //set operation
     if (oper==0){
     
     int newNumber= bitMask | n;
     System.out.println(newNumber);
     } else {
        //clear operation
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);

     }

          
    
    
    }
    
    
    }
    

