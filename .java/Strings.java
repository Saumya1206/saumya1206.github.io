import java.util.*;
public class Strings {
    public static void main(String[] args) {
        
 //Printing name taken by user as input-

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine(); //for one word we'll use -> next and for one line we will use-> nextLine
        //     System.out.println("Your name is: "+ name);
 

//Concatenation
//         String firstName= "Saumya";
//         String lastName="Pathak";
//         //System.out.println(firstName+ " " +lastName);
//         //or
//         String fullname= firstName+" "+lastName;
//       //  System.out.println(fullname.length()); //to get total no. of index we use ".length()"

// // To print diff character seperately we use(charAt)logic.
//        for(int i=0; i<fullname.length(); i++){
//         System.out.println(fullname.charAt(i));



//Compare Strings
//for comaprison logic between two strings we use (.compareto())logic.
       
        //    String name1="Saumya";
        //    String name2="ok";

//Trying it as input
        //  Scanner sc=new Scanner(System.in);
        //  String name1=sc.next();
        //  String name2=sc.next();

        // there are three cases of comaprison:
        //case1- s1 > s2 ; it will return positive value
        //case2- s1 = s2 ; it will return 0
        //case3- s1 < s2 ; it will return negative value
         
        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");
        // } else if(name1.compareTo(name2)>0){
        //     System.out.println("String 1 is greater than string 2");

        // } else {
        //     System.out.println("String 2 is greater than String 1");
        // }

        // in comparison b/w two strings when equal we see first character of each string the higher character will be greater string.
        //for example string 1 = hello, string 2 = wello,
        //string 2 is greater string because w is greater than h.

        
// .compareTo() alt is == but it doesn't give correct answer everytime.LOOk at the following ex.
       //Non-primitive code
    //    if(new String("Saumya")== new String("Saumya")){
    //     System.out.println("String 1 is equal to string 2");
    //    } else{
    //     System.out.println("String 1 is not equal to String 2");
    //    }
    //We can see its giving us wrong ans.


//Substring part it is~
          
        // String sentence="Saumya is a loner";
        // //we use .substring(beg index, end index) ending index is exclusive.(actual end tbp= end index-1)
        // //by default ending index take last index value.
        // String name =sentence.substring(11, sentence.length());
        // System.out.println(name);

//STRINGS ARE IMMUTABLE.



//STRINGGGGG BUILDERRRRRRRRRRR~
            
                      StringBuilder sb=new StringBuilder("satrangi");
                      //System.out.println(sb);
         //print character at index 0. we will use charAt logic
            //  System.out.println(sb.charAt(4));

         // //Set charAt at index 0.
            // sb.setCharAt(0, 'P');
            // System.out.println(sb);

         // INSERT CHAR AT INDEX
        //  sb.insert(3, 'S');
        //  System.out.println(sb);

        //delete 
        //sb.delete(start, end) ending one is non inclusive
        // sb.delete(2,3);
        // System.out.println(sb);

        // sb.append("P"); //str= str+p
        // sb.append("a");
        // sb.append("t");
        // sb.append("h");
        // sb.append("a");
        // sb.append("k");
        // System.out.println(sb.length());

//PRINT INVERSE OF THE STRING.
        for(int i=0; i<sb.length()/2; i++){
            int front=i;
            int back= sb.length()-1-i;//5-1-0 = 4
            
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
System.out.println(sb);

        



       }

    }
    

