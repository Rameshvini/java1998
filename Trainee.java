class Trainee
{
public static void names(String []traineenames)
{
System.out.println("NAME OF THE TRAINEES");
System.out.println(" TRAINEES NAME:"+traineenames.length);
for(int a=0;a<traineenames.length;a++){
	System.out.println(traineenames[a]);
	if(traineenames[a]=="xyz")
	{
		System.out.println("TRAINEE NAME IS MATCHED:"+traineenames[a]);
}
}
}
}