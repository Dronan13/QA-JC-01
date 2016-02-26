public class HumanEntity {
	//параметры класса
	private String sex;
	private String surname;
	private String name;
	private String fathersname;
	private String birthday;
	//пустой коструктор
	HumanEntity(){
	}
	//параметризированный коструктор
	HumanEntity(String sex,String surname,String name,String fathersname,String birthday){
		this.sex = sex;
		this.surname = surname;
		this.name = name;
		this.fathersname = fathersname;
		this.birthday = birthday;
	}
	// Геттеры и сеттеры для параметров
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getFathersname() {
		return fathersname;
	}

	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}
}
