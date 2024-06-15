// import java.util.*;
// public class conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        //if-else statement
        //int age = sc.nextInt();

        //if (age>18) {
        //    System.out.println("Adult");
        //} else { 
        //    System.out.println("Not Adult");

        //example 2 

       // int a= sc.nextInt();
        //int b=sc.nextInt();

        

        //if (x % 2 == 0) {
          //  System.out.println("Even");
        //} else { 
         //   System.out.println("odd");
        //}

        //if (a==b) {
         //   System.out.println("Equal");
        //} else {
          //  if (a>b) { // WE CAN ALSO USE ELSE IF STATEMENT
            //    System.out.println("A is greater tha B ");
        /*   } else if (a>b) {
            System.out.println("A is greater than B");
          }    
         else {
                System.out.println("B is greater than A");
            }*/
         

        // rOLES OF bUTTONS using else-if method

    //      int button=sc.nextInt();

    //     // if (button==1) {
    //     //     System.out.println("Hello");
    //     // } else if (button==2) {
    //     //     System.out.println("Namaste"); 
    //     // } else if (button==3) {
    //     //     System.out.println("Bonjour");
    //     // } else {
    //     //     System.out.println("Invalid Button");
    //     // }

    //     // Roles of Button using (SWITCH) method

    //     switch(button) {
    //         case 1 : System.out.println("Namaste");
    //         break;

    //         case 2 : System.out.println("Hello");
    //         break;

    //         case 3 : System.out.println("Bonjour");
    //         break;

    //         default: System.out.println("Invalid Button");

    //     }
    // }



    // }

    import java.util.*;
    public class conditions{
      public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // int marks = sc.nextInt();

        // if(marks>90){
        //   System.out.println("A grade");
        // } else if(marks>60){
        //   System.out.println("B grade");
        // } else if (marks>40){
        //   System.out.println("C grade");

        // } else{
        //   System.out.println("Fail");
        // }

        // int x= sc.nextInt();
        // if (x%2==0){
        //   System.out.println("Even");}
        //   else{
        //     System.out.println("Odd");
        //   }
        // }
        // int year = sc.nextInt();
        // if (year%4==0 && year%100 !=0){
        //   System.out.println("Year is a leap year");
          
        // } else {
        //   System.out.println("This year is not a leap year");
        // }

        // int age = sc.nextInt();
        // if (age>60 || (age>18 && age<22)){
        //   System.out.println("20% Discount granted");
          
        // } else {
        //   System.out.println(" 20% Discount not granted");
        // }
        // int age=sc.nextInt();
         
        // String eligibilty = (age>18)?"Eligible":"Not eligibile";
        // System.out.println(eligibilty);

        // int marks=sc.nextInt();

        // String result=(marks>90)?"A":(marks>60)?"B":(marks>40)?"C":"Failed";
        // System.out.println(result);


        //Assignment qus by adi
//qus 1 
        // int year=sc.nextInt();

        // if(year%4==0 && year%100!=0){
        //   System.out.println("This year is a leap year");
        // } else {
        //   System.out.println("This year is not a leap year");
        // }

//qus2
        // int number =sc.nextInt();
        // if( number>=0){
        //   System.out.println(number +" "+ "is positive");
          
        // } else {
        //   System.out.println(number +" "+ "is negative");
        // }

//qus 3 
          // int num1=10;
          // int num2=25;
          // int num3=8;

          // int largest;

          // if(num1>=num2 && num1>=3){
          //   largest=num1;
          // } else if (num2>=num1 && num2 >= num3){
          //   largest=num2;
          // } else {
          //   largest=num3;
          // }
          // System.out.println("The largest number is:"+ largest);

//qus 4

          // int num=sc.nextInt();

          // String result=(num%2==0)?"even":"Odd";
          // System.out.println(num+"is"+result);

//qus 5
          // int marks=sc.nextInt();
          // String result=(marks>=30)?"You Passed the exam.":"You Failed the exam";
          // System.out.println(result);
     
//qus 6
          // int num1=10;
          // int num2=5;
          // int num3=8;

          // int minimum=((num1<num2) && (num1<num3))?num1:((num2<num1) && (num2<num3))?num2:num3;
          // System.out.println("The minimum number is "+minimum);


          // int num1=sc.nextInt();
          // int num2=sc.nextInt();

          // String operator=sc.next();

          // switch(operator){
          //   case "+":
          //   System.out.println(num1+num2);
          //   break;

          //   case "-":
          //   System.out.println(num1-num2);
          //   break;

          //   case "*":
          //   System.out.println(num1*num2);
          //   break;

          //   case "/":
          //   System.out.println((double)num1/num2);
          //   break;

          //   default:
          //   System.out.println("Invalid operation");
          // }


          // int score=sc.nextInt();
          
          // switch(score/10){
          //   case 7:
          //   System.out.println("7 cgpa");
          //   break;

          //   case 8:
          //   System.out.println("8 cgpa");
          //   break;

          //   case 9:
          //   System.out.println("9 cgpa");

          //   case 10:
          //   System.out.println("10 cgpa");
          //   break;

          //   default:
          //   System.out.println("below 7 cgpa");

          // int day=sc.nextInt();

          // switch(day){
          //   case 1:
          //   System.out.println("Monday");
          //   break;

          //   case 2:
          //   System.out.println("Tuesday");
          //   break;

          //   case 3:
          //   System.out.println("Wednesday");
          //   break;

          //   case 4:
          //   System.out.println("Thursday");
          //   break;

          //   case 5:
          //   System.out.println("Friday");
          //   break;

          //   case 6:
          //   System.out.println("Saturday");
          //   break;

          //   case 7:
          //   System.out.println("Sunday");
          //   break;

          //   default:
          //   System.out.println("Invalid number");
            

          // int month=sc.nextInt();
          // int days;
          // switch( month ){
          //   case 1: case 3: case 5: case 7: case 8: case 10: case 12:
          //   System.out.println( days=31);
          //   break;

          //   case 4: case 6: case 9: case 11:
          //   System.out.println( days=30);
          //   break;

          //   case 2:
          //    System.out.println(days=28);
          //   break;

          //   default:
          //   System.out.println("Invalid month");
//Scanner sc =new Scanner(System.in);
          // String characters=sc.nextLine();
          
          // switch (characters){
          //   case ("a"): case ("e"): case("i"): case("o"): case("u"):
          //   System.out.println("char is vowel");
          //   break;

          //   default:
          //   System.out.println("char is consonant");
         String chara =sc.nextLine();

         switch(chara){
          case ("A"):
          System.out.println("Excellent");
          break;

          case("B"):
          System.out.println("Good");
          break;

          case("C"):
          System.out.println("Satisfactory");
          break;

          case("D"):
          System.out.println("Pass");
          break;

          case("F"):
          System.out.println("Fail");
          break;

         }


        
        }

          }

          
          

          
        
    

    






