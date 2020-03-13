package SIMS.Entity;

public class Student {
	private int id;
	private String name;
	private String password;
	private String _class;
	private String grade ;
	private int age  ;
	private String email;
	
	
	public Student(String name, String password, String _class, String grade, int age, String email) {
		super();
		this.name = name;
		this.password = password;
		this._class = _class;
		this.grade = grade;
		this.age = age;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", _class=" + _class + ", grade="
				+ grade + ", age=" + age + ", email=" + email + "]";
	}
	 
	
	
	
	
	
	
}
