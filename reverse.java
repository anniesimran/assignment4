class reverse
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int reverse=0;
int rem=0;
while(n>0)
{
rem=n%10;
reverse=rem+reverse*10;
n=n/10;
}
System.out.println("reversed number is:"+reverse);
}
}

