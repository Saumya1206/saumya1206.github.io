//import java.util.Arrays;
//public class practice {
 
    //QUS 1 Printing LCM

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int ans=(a>b)?a:b;

    //     while(true){
    //         if(ans%a==0 && ans%b==0)
    //         break;
    //         ans++;
    //     }
    //     System.out.println("LCM OF" + a + " and " + b + "= " + ans);
    // }
 
    
    //QUES 2 PRINTING FACTORIAL

    //   static int factorial(int n){
    //     if(n==0)
    //     return 1;

    //     return n * factorial(n-1);
    //   }

    //   public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int number=sc.nextInt();
    //     System.out.println("Factorial of" + number + " is :" + factorial(number));
    //   }


    //Ques-3 Printing GCD/HCF

//     static int GCD(int x, int y){
//         if(x==0 || y==0)
//         return 1;

//         if(x==y)
//         return x;

//         if(x>y)
//         return GCD(x-y,y);
//         else
//         return GCD(x,y-x);

    
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();
//         System.out.println("GCD of " + x + " and" + y + "is :"+ GCD(x, y));
//     }


// public static void main(String[] args) {
//     int x =12;
//     int flg=0;
//     for(int i=2;i<=(int)x/2;i++
//     )
// }
//  static int GCD(int x , int y){
//     if(x==0)
//     return y;
//     if(y==0)
//     return x;

//     if(x==y)
//     return x;

//     if(x>y)
//     return GCD(x-y, y);
//     else
//     return GCD(x,y-x);
//  }
//  public static void main(String[] args) {
//     int x=28, y=12;
//     System.out.println("GCD OF" + x +"and " + y + ": " + GCD(x, y));
//  }


// static void prime_num(int n){
//     int x, y, flg;
//     System.err.println("All the prime number within 1 and" + n + "are : ");

//     for(x= 2; x<=n ; x++){
//         flg=1;
//         for(y=2; y<=x/2; y++){
//             if(x%y==0){
//                 flg=0;
//                 break;
//             }
//         }
//         if (flg==1){
//             System.out.print(x + " ");
//         }
//     }
    
//     }
//     public static void main (String[] args){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         prime_num(n);


// }

// public static void main(String[] args) {
//     long x=20; long product=1;
//     for(int i=1; i<=x; i++){
//         product*=i;
//     }
//     System.out.println(product);
    
// }

// static int fact(int n){
//     if(n==0)
//         return 1;
//       else
//         return n*fact(n-1);
    
// }
// public static void main(String[] args) {
//     int num=6;
//     System.out.println(fact(num));
    
// }

// public static void main(String[] args) {
//     int a=0 , b=1 , c;
//     Scanner sc=new Scanner(System.in);
//     int y=sc.nextInt();
//     System.out.print(a + " " + b + " ");
//     for(int x=0; x<y-2;x++){
//         c=a+b;
//         a=b;
//         b=c;
//         System.out.print(c + " ");
//     }

    
//}

// public static void main(String[] args) {
//     int arr[]={3,8,9,5,6,2};
//     Arrays.sort(arr);
//     reverse(arr);
//     System.out.println(Arrays.toString(arr));
// }
// static void reverse(int [] array){
//     int n=array.length;
//     for(int i=0 ; i<n/2;i++){
//         int temp=array[i];
//         array[i]=array[n-i-1];
//         array[n-i-1]=temp;

    
//     }
//}

//public static void main(String[] args){
    // try{
    //     System.out.println(9/3);
    //     int[]arr=new int[3];
    //     System.out.println(arr[2]);
    // }
    // catch(ArithmeticException e){
    //     System.out.println("This is arithmetic exception");
    // } catch(ArrayIndexOutOfBoundsException e){
    //     System.out.println("This is index out of bounds");
    // } catch(Exception e){
    //     System.out.println("unsual exception");
    // }

    // System.out.println("rest code");

    // try{
    //     System.out.println(2/0);
    //  } catch(ArithmeticException e){
    //     System.out.println(e);
    //  } finally{
    //     System.out.println("Final block");
    //  }
    //  System.out.println("rest code");

//     try{
//         try{
//             try{
//                 int arr[]={1,2,3};
//                 System.out.println(arr[7]);
//             }
//             catch(ArithmeticException e){
//                 System.out.println("Arith excp");
//             }}
//             catch(ArithmeticException e){
//                 System.out.println("A excep");
//             }} catch(ArrayIndexOutOfBoundsException e){
//                 System.out.println("ERROR FOUND");
//                 System.out.println(e);
//             ;
//             } catch(Exception e){
//                 System.out.println("Exception");
//             }
//         }
//             }

// //             }
// //         }
// //     }
// // }
// // }

//import java.io.*;

// class a {
//     static void ageverify(int age) throws IOException{
//         if(age<18){
//             throw new IOException();
//         }
//     }
// }
// public class practice{
//     public static void main(String[] args) {
//         int age=16;
//         try{
//             a.ageverify(age);
//         } catch(IOException e){
//             System.out.println(e);
//         }
//         System.out.println("rest code");
//     }
// }

// class notAllowed extends Exception{
//     public notAllowed(String xyz){
//         super(xyz);
//     }
// }
// public class practice{
//     static void ageverify(int age) throws notAllowed{
//         if (age<18){
//             throw new notAllowed("not allowed to vote");
//         }
//     }
//     public static void main(String[] args) {
//         int age=13;
//         try{
//             ageverify(age);
//         } catch(notAllowed e){
//             System.out.println(e);
//         }
//         System.out.println("rest code");
//         }
//     }


// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// public class practice{
//     public static void main(String[] args) {
//         try{
            //File f=new File("C:\\Users\\Saumy\\Downloads\\saumya1206.github.io-main\\saumya1206.github.io-main\\.java\\practice.txt");
            // Scanner sc=new Scanner(f);
            // while(sc.hasNextLine()){
            //     String xyz=sc.nextLine();
            //     System.out.println(xyz);
            // }
            // if(f.delete()){
            //     System.out.println("deleted succesfully");
            // } else{
            //     System.out.println("was not deleted");
            // }

        //     FileWriter f=new FileWriter("C:\\Users\\Saumy\\Downloads\\saumya1206.github.io-main\\saumya1206.github.io-main\\practice.txt");
        //     f.write("This is java class");
        //     f.close();
        //     System.out.println("everythimg worked");
        // }catch(Exception e){
        //     System.out.println("except handled  " + e);
        // }
//     }
// }

// class Book{
//     String title;
//     String author;
//     int price;

//     Book(String title, String author, int price){
//         this.title=title;
//         this.author=author;
//         this.price=price;

//     } void displayDetails(){
//         System.out.println("Title: " + this.title);
//         System.out.println("Author: "+ this.author);
//         System.out.println("price: " + price + "INR");
//     }
// }
//     public class practice{
//         public static void main(String[] args) {
//             Book Ncert=new Book("Everyday Science","Govt",50 );
//             Book pritiAggrwl=new Book("Python","Priti", 550);
//             Ncert.displayDetails();
//             pritiAggrwl.displayDetails();
//         }
//     }


// class Vehicle{
//     int speed;
//     int capacity;

//     Vehicle(int speed, int capacity){
//         this.speed=speed;
//         this.capacity=capacity;
//     }
//     void displayInfo(){
//         System.out.println("Speed: "+speed);
//         System.out.println("Capacity : " + capacity);

//     }
// }
// class Car extends Vehicle{
//     int doors;

//     Car(int speed, int capacity, int door){
//         super(speed, capacity);
//         this.doors=doors;
//     }
//     void displayInfo(){
//         super.displayInfo();
//         System.out.println("Doors: "+ doors);
//     }
// }
// public class practice{
//     public static void main(String[] args) {
//         Car Nexon=new Car(90,4,4);
//         Nexon.displayInfo();

//         Vehicle cycle= new Vehicle(30,2);
//         cycle.displayInfo();


//     }
// }

// class Animal{
//     String Name;
//     String sound = "sound";

//     Animal( String Name ){
//         this.Name=Name;
//         //this.sound=sound;
//     }
//     void makeSound(){
//         System.out.println("Name : "  + Name);
//         System.out.println("Sound: " + sound);
//     }
// }
// class dog extends Animal{
//    String sound ="woof";
//     dog(String Name){
//     super(  Name);
//     } 
//     void makeSound(){
//         System.out.println("Name: " + Name);
//         System.out.println("Sound: " + sound);
//     }
// }
// class cat  extends Animal{
//     String sound ="meow";
//     cat(String Name){
//         super(Name);
//     } 
//     void makeSound(){
//         System.out.println("Name: "+ Name);
//         System.out.println("Sound: " + sound);
//     }
// }
// public class practice{
//     public static void main(String[] args) {
//         Animal Cat=new Animal("toast");
//         Cat.makeSound();

//         dog obj1= new dog("Goofy");
//         obj1.makeSound();
       
//         cat obj2=new cat("cheese");
//         obj2.makeSound();
//     }
// }

// class Shape{
//     void calculateArea(){
//         System.out.println();

//     }
// }
// class Circle extends Shape{
//     final float pi=3.14f;
//     int radius;
//     Circle(int radius){
//         this.radius=radius;
//     }
//     void calculateArea(){
//         System.out.println(pi*radius);
//     }
// }
// class Rectangle extends Shape{
//     int length;
//     int breadth;
//     Rectangle(int length, int breadth){
//         this.length=length;
//         this.breadth=breadth;
//     }
//     void calculateArea(){
//         System.out.println(length*breadth);
//     }
// }
// public class practice{
//     public static void main(String[] args) {
//         Shape s;
//         s=new Rectangle(23,24);
//         s.calculateArea();
//         s=new Circle(23);
//         s.calculateArea();
//     }
// }


// abstract class Animal{
//     abstract void makeSound();
// }
// class dog extends Animal{
//     void makeSound(){
//         System.out.println("woof");
//     }
// }
// class cat extends Animal{
//     void makeSound(){
//         System.out.println("meow");
//     }
// }

// public class practice{
//     public static void main(String[] args) {
//         dog obj1= new dog();
//         obj1.makeSound();
//         cat obj2=new cat();
//         obj2.makeSound();
//     }
// }

// class Bank{
//     private int balance;
//     private int accountNumber;
//     Bank(int balance, int accountNumber){
//     this.balance=balance;
//     this.accountNumber=accountNumber;
// } 
// void withdrawl(int amount){
//     this.balance=this.balance-amount;
//     System.out.println("Available bal: " + this.balance);
// }
// void deposit(int amount){
//     this.balance= this.balance+ amount;
//     System.out.println("Available bal: " + this.balance);
// }

// }
// public class practice{
// public static void main(String[] args) {
//     Bank obj1 = new Bank(10000,167);
//     obj1.withdrawl(67);
// }
// }
//  import java.util.*;
// class Book{
//     String Title;
//     String Author;
//     int price;

//     Book(String Title, String Author, int price){
//         this.Title=Title;
//         this.Author=Author;
//         this.price=price;
//     } void displayInfo(){
//         System.out.println("Title: " + Title);
//         System.out.println("Author: "+ Author);
//         System.out.println("price: " + price + "INR");
//      } }
//     public class practice{
//         public static void main(String[] args) {
//             Book book1 = new Book("XYZ", "ABC", 900);
//             Book book2 = new Book("QWE","JKL", 800);
//             book1.displayInfo();
//             book2.displayInfo();
//         }
//     }

// class Animal{
//     String Name;
//      String sound = "sound";

//      Animal( String Name ){
//          this.Name=Name;
         
//      }
//      void makeSound(){
//         System.out.println("Name : "  + Name);
//          System.out.println("Sound: " + sound);
//      }
//  }
//  class dog extends Animal{
//     String sound ="woof";
//      dog(String Name){
//      super(  Name);
//      } 
//      void makeSound(){
//          System.out.println("Name: " + Name);
//          System.out.println("Sound: " + sound);
//      }
//  }
//  class cat  extends Animal{
//     String sound ="meow";
//      cat(String Name){
//          super(Name);
//      } 
//      void makeSound(){
//          System.out.println("Name: "+ Name);
//          System.out.println("Sound: " + sound);
//      }
//  }
// public class practice{
//      public static void main(String[] args) {
//         Animal Cat=new Animal("toast");
//          Cat.makeSound();

//          dog obj1= new dog("Goofy");
//          obj1.makeSound();
       
//         cat obj2=new cat("cheese");
//          obj2.makeSound();
//      }
//  }


// // Interface Drawable
// interface Drawable {
//     void draw();
// }

// // Class Circle implementing Drawable
// class Circle implements Drawable {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a Circle");
//     }
// }

// // Class Rectangle implementing Drawable
// class Rectangle implements Drawable {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a Rectangle");
//     }
// }

// // Main class to demonstrate polymorphic behavior
// public class practice {
//     public static void main(String[] args) {
//         // Creating instances of Circle and Rectangle
//         Drawable circle = new Circle();
//         Drawable rectangle = new Rectangle();

//         // Calling draw method polymorphically
//         circle.draw();
//         rectangle.draw();
//     }
// }

// class Shape{
//      void calculateArea(){
//          System.out.println();

//    }
//  }
//  class Circle extends Shape{
//      final float pi=3.14f;
//      int radius;
//      Circle(int radius){
//          this.radius=radius;
//      }
//      void calculateArea(){
//          System.out.println(pi*radius);
//      }
//  }
//  class Rectangle extends Shape{
//      int length;
//      int breadth;
//      Rectangle(int length, int breadth){
//         this.length=length;
//          this.breadth=breadth;
//     }
//      void calculateArea(){
//          System.out.println(length*breadth);
//      }
//  }
//  public class practice{
//      public static void main(String[] args) {
//          Shape s;
//          s=new Rectangle(23,24);
//          s.calculateArea();
//          s=new Circle(23);
//          s.calculateArea();
//      }
//  }


// class Emp{
//     String name;
//     int age;
//     int salary;

//     Emp(String name, int age, int salary){
//         this.name=name;
//         this.age=age;
//         this.salary=salary;
//     }
//     void displayInfo(){
//         System.out.println("Name: "+name);
//         System.out.println("Age : "+age);
//         System.out.println("Salary: "+ salary);
//     }
// }
// public class practice{
//     public static void main(String[] args) {
//         Emp obj1 = new Emp("Harry", 50, 10000);
//         Emp obj2 = new Emp("Larry", 29,30000);
//         obj1.displayInfo();
//         obj2.displayInfo();
    
//     }
// }

// class Vehicle {
//     // Method to start the vehicle
//     public void start() {
//         System.out.println("Starting the vehicle");
//     }
// }

// // Car class extending Vehicle
// class Car extends Vehicle {
//     // Override start method for Car
//     @Override
//     public void start() {
//         System.out.println("Starting the car by turning the ignition key");
//     }
// }

// // Bike class extending Vehicle
// class Bike extends Vehicle {
//     // Override start method for Bike
//     @Override
//     public void start() {
//         System.out.println("Starting the bike by kicking the kick start");
//     }
// }

// // Main class for testing
// public class practice {
//     public static void main(String[] args) {
//         // Creating instances of Car and Bike
//         Car car = new Car();
//         Bike bike = new Bike();

//         // Calling start method for Car and Bike
//         car.start();
//         bike.start();
//     }
// }

// public class practice {

//     public static final float PI = 3.14f;
//     public static final float E = 2.71f;

    

//     public static void main(String[] args) {

//         System.out.println("PI: " + practice.PI);
//         System.out.println("E: " + practice.E);
//     }
// }

// public class practice {
    
//     private String name;
//     private String email;

//     public practice(String name, String email) {
//         this.name = name;
//         this.email = email;
//     }

    
//     public String getName() {
//         return name;
//     }


//     public void setName(String name) {
//         this.name = name;
//     }

    
//     public String getEmail() {
//         return email;
//     }


//     public void setEmail(String email) {
//         this.email = email;
//     }

    
//     public static void main(String[] args) {
    
//         practice customer = new practice("John", "john@gmail.com");
//         System.out.println("Name: " + customer.getName());
//         System.out.println("Email: " + customer.getEmail());


//         customer.setName("sam");
//         customer.setEmail("sam@google.com");

    
//         System.out.println(" Name: " + customer.getName());
//         System.out.println(" Email: " + customer.getEmail());
//     }
// }
// public class Customer {
//     // Private attributes
//     private String name;
//     private String email;

//     // Constructor
//     public Customer(String name, String email) {
//         this.name = name;
//         this.email = email;
//     }

//     // Getter for name
//     public String getName() {
//         return name;
//     }

//     // Setter for name
//     public void setName(String name) {
//         this.name = name;
//     }

//     // Getter for email
//     public String getEmail() {
//         return email;
//     }

//     // Setter for email
//     public void setEmail(String email) {
//         this.email = email;
//     }

//     // Main method for testing
//     public static void main(String[] args) {
//         // Create a new customer
//         Customer customer = new Customer("John Doe", "john@example.com");

//         // Access and modify attributes
//         System.out.println("Original Name: " + customer.getName());
//         System.out.println("Original Email: " + customer.getEmail());

//         // Modify attributes
//         customer.setName("Jane Doe");
//         customer.setEmail("jane@example.com");

//         // Access modified attributes
//         System.out.println("Modified Name: " + customer.getName());
//         System.out.println("Modified Email: " + customer.getEmail());
//     }
// }

//public class practice{
    // public static void main(String args[]){
    //     String str="gelpen";
    //     String reverse ="";
    //     for(int i = str.length()-1; i>=0; i--){
    //         reverse += str.charAt(i);
    //     }
    //     System.out.println(reverse);
    // }


    //using reccursion

    // public static void main(String [] args){
    //     String str = "Hello";
    //     String reverse = reverseString(str);
    //     System.out.println(reverse);
    // } 
    
    // static String reverseString(String str){
    //     if(str.isEmpty()){
    //         return str;
    //     }
    //     return reverseString(str.substring(1))+str.charAt(0);
    //}

    import java.sql.*;
    public class practice{
        public static void main(String[] args) {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url ="jdbc:mysql://localhost:3306/mydatabase";
                String username ="root";
                String password ="root";
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt =conn.createStatement("SELECT * FROM employees");
                ResultSet rs = stmt.executeQuery(selectQuery);
                
                
                
                
                System.out.println("connected succesfully");
conn.close();







            } catch(SQLException e) {
                System.out.println("error"+ e.getMessage());
                
            }
            
        }
    }
    class vehicle{
        string model;
        int year;

        vehicle(string model, int year){
            this.year year;
            this.model model;
        }
        void displayInfo(){
            syso (" model "   model)
        }
    }
    class car extends vehicle{
        int numdoors;
        super.model;'
        
        car(string model, int year)
        suer(make , model, year)
        this.....
    }
    void oem truck()


