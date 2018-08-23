import java.util.Scanner;
class even1
{
public static void main(String[] args)
{

int i=0,n=0;
Scanner x=new Scanner(System.in);
System.out.println("enter the value of n: ");
n=x.nextInt();
for(i=1;i<n;i++)
{
if(i%2==0)
{
System.out.println(i);
}
System.out.println("");

}
}
}