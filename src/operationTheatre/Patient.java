package operationTheatre;

public class Patient {
	private String id;
	private String name;
	private String phone;
	private DateTime admissionDate;
	private DateTime releaseDate;
	private String disease;
	private int age;
	private char gender;
	private String Address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAdmissionDate() {
		return admissionDate.getTime();
	}
	public void setAdmissionDate(DateTime admissionDate) {
		this.admissionDate = admissionDate;
	}
	public DateTime getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(DateTime releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) throws Exception {
		if(gender!='M' && gender!='F') throw new Exception("You are not suitable for this hospital");
		this.gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
