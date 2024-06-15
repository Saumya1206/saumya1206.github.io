// class ABC{
//     String evenOdd (int x){
//         if(x%2==0){
//             return "Even";
//         } else {
//             return "odd";
//         }

//     }
// }

// public class polypharism {
//     public static void main(String[] args) {
//         ABC obj= new ABC();
//         System.out.println(obj.evenOdd(18));
        
//     }

// }

// public class polypharism{
//     static int miniAdd(int x, int y){
//         return x+y;
//     }
//     public static void main(String[] args) {
//         System.out.println(miniAdd(18,22));
//     }
// } 

// class ABC{
//     void printHelloWorld(){
//         System.out.println("Hllo world");

    
//     }
// }
// public class polypharism{
//     public static void main(String[] args) {
//         ABC obj1 = new ABC();
//         obj1.printHelloWorld();
//     }
    

// }

// class Rectangle{
//     double calculateArea(double length, double width){
//         return(length*width);

//     }

// }
// public class polypharism{
//     public static void main(String[] args) {
//         Rectangle rectangle = new Rectangle();
//         double length=24.56;
//         double width=34.67;
//         double area= rectangle.calculateArea(length, width);
//         System.out.println(area);
//     }
// }

//  public class polypharism{
//     public static void main(String[] args) {
//         int num1=90;
//         int num2=89;
//         int max=findMaximum(num1, num2);
//         System.out.println(max);
//     }
// }




//     public static int findMaximum (int num1, int num2){
//         return(num1>num2)?num1:num2;

//     } /////doubttttttttttttttttttttttt

// public class polypharism
// {
//     public static void main(String[] args) {
        
//         printEvenNumber();


//     }
//     public static void printEvenNumber(){
//         int count =0;
//         int num=1;
//         while(count<10){
//             if(num%2==0){
//                 System.out.println(num);
//                 count++;
//             }
//             num++;
//         }
//     }
// }

//public class polypharism{
//     public static double calculatePeri(double length, double breadth){
//         return 2*length+breadth;
//     }

//     public static void main(String[] args) {
//         double length=10.98;
//         double breadth=78.90;
//         double perimeter=calculatePeri(length, breadth);
//         System.out.println(perimeter);
//     }
// }

//  public static void main(String[] args) {
//     int number=5;
//     checkNumber(number);

    
//  }

//  public static void checkNumber( int num){
//     if(num>0){
//         System.out.println("positive");
//     } else if (num<0){
//         System.out.println("negative");
//     } else{
//         System.out.println("0");
//     }
//  }


// public static void main(String[] args) {
//     int x=9;
//     int y=89;
//     int sum=calculateSum(x, y);
//     System.out.println(sum);
// }


//   public static int calculateSum(int x, int y){
//     return x+y;
//   }
//}
// class A{
//     A(){
//         System.out.println("parent class");
//     }



// }
// public class polypharism extends A{
//     polypharism(){
//     super();
//     System.out.println("child class ");
//     }

//     polypharism(int a){
//         super();
//         System.out.println("child class"+a);
//     }
//     { System.out.println("instance intializer block");}

//     public static void main(String[] args) {
//         polypharism abc=new polypharism();
//         polypharism xyz=new polypharism(18);
        
//     }
// }

// class Bank{
//     float getRateOfInterest(){return 0;}
// }

// class SBI extends Bank{
//     float getRateOfInterest(){return 4.5f;}
// }
// class Axis extends Bank{
//     float getRateOfInterest(){return 6.7f;}
// }
// public class polypharism{
//     public static void main(String[] args) {
//         Bank a;
//         a=new SBI();
//         System.out.println(a.getRateOfInterest());
//         a=new Axis();
//         System.out.println(a.getRateOfInterest()65  4);
//     }
// }


// class A{
//     void run(){
//         System.out.println("A run");
//     }
// }

// class B extends A{
//     void run(){
//         System.out.println("B run");
//     }
//     void eat(){
//         System.out.println("B eat");
//     }
// }

// public class polypharism{
//     public static void main(String[] args) {
//         A obj1=new B();
//         obj1.run();
//         //obj1.eat();// it will throw error because of dynamic method dispatch. 
//     }
// }

// abstract class Bank{
//     abstract int getRateOfInterest();
// }
// class SBI extends Bank{
//     int getRateOfInterest(){
//         return 5;
//     }
// }
// class PNB extends Bank{
//     int getRateOfInterest(){
//         return 7;
//     }
// }
// public class polypharism{
//     public static void main(String[] args) {
//         Bank obj1;
//         obj1=new SBI();
//         System.out.println("ROI IS " + obj1.getRateOfInterest());
//         obj1=new PNB();
//         System.out.println("ROI IS" + obj1.getRateOfInterest());
//     }
// }

interface Printable{
    void print();
}
interface showable{
    void show();
}

public class polypharism implements Printable,showable{
    public void print(){
        System.out.println("printing");
    }
    public void show(){
        System.out.println("showing");
    }
    public static void main(String[] args) {
        polypharism obj1=new polypharism();
        obj1.print();
        obj1.show();
    }
}