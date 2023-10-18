class Hostel{
	
	public String name;
	public int fees;
	public boolean hasRagging;
	
	Hostel(){
		
		System.out.println("this is default constructor");
	}
	
	Hostel(String name){
		System.out.println("this is p constructor");
		this.name=name;
		System.out.println("name is :"+this.name);
	}
}
	
