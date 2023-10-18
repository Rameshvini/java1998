class Metro
{
public static void station()
{
System.out.println(" station information:");
}
public static void numStation(int station)
{
System.out.println("NUMBER OF STATION "+station);
if (station==25)
{
	System.out.println(" NUM OS STATION IS MATCHED");
}
	else{
		System.out.println(" NUMOF STATION IS NOT MATCHED");
}
}
public static boolean available()
{

	
// System.out.println("METRO AVAILABLE:");
return false;
}
}