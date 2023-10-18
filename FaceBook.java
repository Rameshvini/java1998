public class FaceBook {
	String userName;
	String password;
	String email;
	long contactNumber;
	String address;
	String accountCreateDate;
	String gender;

	public FaceBook() {
		System.out.println("This is Default constractor");
	}

	public FaceBook(String userName) {
		System.out.println("This is a Parametrized constractor with 1-Arguments");

		System.out.println("Facebook user name:" + this.userName);
	}

	public FaceBook(String userName, String password) {
		System.out.println("This is a Parametrized constractor with 2-Arguments");
		this.userName = userName;
		this.password = password;
		System.out.println("Facebook user name:" + this.userName + " " + "Password:" + this.password);
	}

	public FaceBook(String userName, String passWord, String email) {
		System.out.println("This is a Parametrized constractor with 3-Arguments");
		this.userName = userName;
		this.password = password;
		this.email = email;
		System.out.println("Facebook user name:" + this.userName + " " + "Password:" + this.password + " "
				+ "Linked email id to FaceBook:" + this.email);
		;
	}

	public FaceBook(String userName, String password, String email, long contactNumber) {
		System.out.println("This is a Parametrized constractor with 4-Arguments");
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.contactNumber = contactNumber;
		System.out.println("Facebook user name:" + this.userName + " " + "Password:" + this.password + " "
				+ "Linked email id to FaceBook:" + this.email + " " + "number linked to FB:"
				+ this.contactNumber);
	}
	public FaceBook(String userName, String passWord, String email, long contactNumber,String address)
	{
		System.out.println("This is a Parametrized constractor with 5-Arguments");
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address=address;
		System.out.println("Facebook user name:" + this.userName + " " + "Password:" + this.password + " "
				+ "Linked email id to FaceBook:" + this.email + " " + "number linked to FB:"
				+ this.contactNumber+" "+"User addres:"+this.address);
	}

	public FaceBook(String userName, String password, String email, long contactNumber,String address,String accountCreateDate,String gender)
	{
		System.out.println("This is a Parametrized constractor with 6-Arguments");
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address=address;
		this.accountCreateDate=accountCreateDate ;
		this.gender=gender;
		System.out.println("Facebook user name:" + this.userName + " " + "Password:" + this.password + " "
				+ "Linked email id to FaceBook:" + this.email + " " + "number linked to FB:"
				+ this.contactNumber+" "+"User addres:"+this.address+" "+"User Gender:"+this.gender);
	}
	
}
