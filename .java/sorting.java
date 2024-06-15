import java.util.*;
public class sorting {
    public static void printArray(int arr[]){
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,2,9,6};

//BUBBLE SORT
//time complexity =0(n^2)
    //      for (int i=0;i<arr.length-1; i++){ //n-1
    //         for ( int j=0; j<arr.length-i-1;j++){
    //             if (arr[j]>arr[j+1]){
    //                 //swap
    //                 int temp = arr[i];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp; //most basic way of swapping
    //             }
    //         }
    //    }


//SELECTION SORT
            //    for (int i=0; i<arr.length-1; i++){
            //     int smallest =i;
            //     for (int j=i+1; j<arr.length; j++){
            //         if (arr[smallest]>arr[j]){
            //             smallest= j;

            //         }
            //     }
            //     int temp=arr[smallest];
            //     arr[smallest]=arr[i];
            //     arr[i]=temp;
                

            //    }



//INSERTION SORT
            
                   
         for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current >arr[i]){
                arr[j+1]=arr[j];
                j--;
            }
        //placement
            arr[j+1]=current;
         }


     printArray(arr);
    }
}
