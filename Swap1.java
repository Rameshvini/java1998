class Swap1
{
public static void main(String args[])
{
int karthik=100;
int ramesh=90;
System.out.println("Before swap Karthik:"+karthik);
System.out.println("Before swap ramesh:"+ramesh);
karthik=karthik+ramesh;
ramesh=karthik-ramesh;
karthik=karthik-ramesh;
System.out.println("After swap Karthik:"+karthik);
System.out.println("After swap ramesh:"+ramesh);
}
}