// class Pen{
//     String color;
//     String type; //ballpoint or gel

//     //public void write(){
//         System.out.println("write something");
//     }
//     public void printColor(){
//         System.out.println(this.color); //this is a keyword that tells is fnc ko kisne call kiya
//     }
// }
 // public class oops {
    //  public static void main(String[] args) {
      //     Pen pen1= new Pen();
      //     pen1.color="blue";
      //     pen1.type="ballpen";
  
      //    // pen1.write();
      //    Pen pen2= new Pen();
      //    pen2.color="red";
      //    pen2.type="gel";
         
         
      //    pen1.printColor();
      //     pen2.printColor();

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    } 
   
    //constructor type 1 non parimitrized
    // Student(){
    //     System.out.println("constructor called"); // if we dont mention any cons then java take its default constructor.
    // }

    //type 2 parimitrized
    // Student(String name, int age){
    //     this.name=name; //we can initialise here only
    //     this.age=age;
    // }

    // type 3 copy constructor/ default c++ one ek obj ko copy krke dusre m dalna
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
       Student(){
        
       }

}



public class oops {
    public static void main(String[] args) {
    // Student s1= new Student(); type 1
    // s1.name="aman";
    // s1.age=21;
     

   // Student s1= new Student("aman",23) ; type 2
     Student s1= new Student();
     s1.name="aman";
     s1.age=23;

     Student s2= new Student(s1);

   
   s2.printInfo();
    }
    
}
