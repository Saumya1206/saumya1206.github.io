import java.util.*;

public class Arrays {
    public static void main(String[] args) {
 //how to define arrays

        //type[]arrayName = new type[size];
// for ex-
        //int []marks=new int[20];
        //  int marks[]=new int[3];// can be written in both way
        // //int [] marks = new int[3];
        // marks[0]=98;//chem
        // marks[1]=78;//phy
        // marks[2]=68;//maths
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

//Another way of writing this code in short is-
        //int marks[]={98,78,68};

// if we want to print 100 entities we will not write like this.
        // we can use different logics for that 

        // by using loop
        // for (int i=0; i<3; i++){
        //     System.out.println(marks[i]);

 //if we want input from users then create arrays-
    //     Scanner sc= new Scanner(System.in);
    //     int size=sc.nextInt();
    //     int numbers[]=new int [size];

    //   //for input
    //   for (int i=0;i<size;i++){
    //     numbers[i]=sc.nextInt();
    //   }
      
    //    //for output
    //     for (int i=0; i<size; i++){
    //         System.out.println(numbers[i]);
    //     }


//PPPPRRRAACTTICCCEEEE QQQUUUEEESSTTTIIIOOOONNNN----
//Take an array as input from user. Search for a given number X. and print the index at which it occurs
    //  Scanner sc=new Scanner(System.in);
    //  int size=sc.nextInt();
    //  int number[]=new int [size];

    //  //input
    //  for(int i=0;i<size;i++){
    //     number[i]=sc.nextInt();
    //  }
    //     int x=sc.nextInt();

    // //output
    // for(int i=0; i<number.length;i++){
    //     if(number[i]==x){
    //         System.out.println("X is found at index: " + i);
    //     }
    

    //  }







// twooooooooooooooooo-ddddddd arrrayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy.
//2D-Array
      
       // type[][]arrayname=new type[rows][column];
        //int[][]numbers=new int [3][5];

//         Scanner sc= new Scanner(System.in);
//         int rows=sc.nextInt();
//         int column=sc.nextInt();

//         int[][] numbers= new int[rows][column];

//         //input for rows
//         for (int i=0; i<rows; i++){
//             //for column
//             for(int j=0; j<column;j++){
//                 numbers[i][j]=sc.nextInt();
//             }
//         }

//         //output
//         for(int i=0;i<rows;i++){
//             for (int j=0;j<column;j++){
//             System.out.println(numbers[i][j] + " ");

//         }
//         System.out.println();
//  }



////Questionnnnnnnnnnnnnnnnn
//Take a matrix as input from the user.Search for the given number X and pprint the indecis at which it occurs.
//     Scanner sc =new Scanner(System.in);
//     int rows=sc.nextInt();
//     int column=sc.nextInt();

//     int number[][]=new int[rows][column];

// //input (rows)
// for(int i=0;i<rows;i++){
//     //column
//     for(int j=0;j<column;j++){
//         number[i][j]=sc.nextInt();
//     }
// }
//     int x=sc.nextInt();
//      for(int i=0;i<rows;i++){
//         for(int j=0;j<column;j++){
     
//         //compare with x
//        if(number[i][j]== x){
       
//         System.out.println("x found at location(" + i + "," + j + ")");
//        }
//         }

//     }

//  char arr[]= new char[4];
//  arr[0]='B';
//  arr[1]=67;
//  arr[2]=69;
//  arr[3]='c';
//  for(char i:arr){
//     System.out.println(i);
//  }

// int [][] arr=new int[3][2];
// arr[0][0]=10;
// arr[0][1]=11;
// arr[1][0]=12;
// arr[1][1]=13;
// arr[2][0]=14;
// arr[2][1]=15;
// for (int i=0;i<arr.length;i++){
//     for(int j=0;j<arr[0].length;j++){
//         System.out.print(arr[i][j] + " ");
//     }
//     System.out.println();
//}
      int [][]arr= new int [3][];
      arr[0]=new int[3];
      arr[1]=new int[2];
      arr[2]=new int[2];

      arr[0][0]=10;
      arr[0][1]=11;
      arr[0][2]=12;
      arr[1][0]=13;
      arr[1][1]=14;
      arr[2][0]=15;
      arr[2][1]=16;

      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
      }


}
}

    





    

