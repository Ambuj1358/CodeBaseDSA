package basics;

public class Man {
	
	 private String name ="ambuj";
	 private int age=32;
	 private String gender;
	 
	 

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public static void main(String[] args) {
		Man m=new Man();
		m.setName("abhay");
		
		System.out.println(m.getAge()); 
		System.out.println(m.getName());

	}

}
