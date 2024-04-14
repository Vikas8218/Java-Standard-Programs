public class ReverseNumber{
public static void main(String args[]){
int num=123;
 int sum =0;
for(int i=0;i<num;num=num/10)
 int rem =num%10;
sum=sum*10+rem;
}
System.out.println(sum);
}
}