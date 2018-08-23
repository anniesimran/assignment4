import java.util.Scanner;
 class Search
 {
  public static void main (String [] args)
 {
   int [] array = {1,4,6,7,8,9,10};
   int i,flag=0;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number to be searched");
   int n = sc.nextInt();
   for ( i = 1; i < array.length; i++) {
      if(array[i]==n){
          flag=1;
            break;      
        }
   }
     if(flag==1){
        System.out.println("Element found at position " +i);}
     else{
        System.out.println("Element not found"); }
  }
}