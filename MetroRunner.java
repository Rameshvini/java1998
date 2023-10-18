class MetroRunner
{
public static void main(String []args)
{
Metro.station();
Metro.numStation(25);
boolean avail=Metro.available();
System.out.println(avail);
if(avail==false)
{
	System.out.println("METRO NOT AVAIL");
}
else{
	System.out.println("METRO AVAIL");
}
}
}