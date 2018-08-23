
class armstrong1
{
public static void main(String[] args)
{
int n;
int a=0;
int c=0;
System.out.println("enter the value n:");
for(int i=1;i<=1000;i++)
{
n=i;
while(n >0)
{
a=n%10;
c=c+(a*a*a);
n=n/10;
}
if(c==i)
{
System.out.println(c);
}
c=0;
}
}
}
