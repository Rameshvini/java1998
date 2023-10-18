class Swapping
{
public static void swap(int number1,int number2)
{
System.out.println("Before swapping:"+number1);
System.out.println("Before swapping:"+number2);
number1=number1+number2;//100,200=300(n1)
number2=number1-number2;//300-200=100(n2)
number1=number1-number2;//300-100=200
System.out.println("After swap:"+number1);
System.out.println("After swap:"+number2);
}
}