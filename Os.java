class Os
{
public static void getOsInfo()
{
	System.out.println("INFORMATION ABOUT OS");
}
public static void getOsInfo(int version,String osname)
{
	String nameOfOS="windows";
System.out.println("UPDATED VERSION:"+version+":NAME OF THE OS VERSIOM:"+osname);

//if(condition)
//{}
if (osname==nameOfOS)
    {
     System.out.println("os is matched with windows");
	}
	else
	{
		System.out.println("os is not matched with windows");
	}
}
}
		
