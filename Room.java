class Room
{
public static void name()
{
System.out.println("Name of the House");
}
public static void rent(int roomrent)
{
System.out.println("ROOM RENT PRICE:"+roomrent);

if(roomrent==500)
{
System.out.println("OCCUPY");
}
else 
{
System.out.println("NOT OCCUPY");
}
}
public static int room(int numofrooms)
{
System.out.println("Number of rooms:"+numofrooms);
return 25;
}
}