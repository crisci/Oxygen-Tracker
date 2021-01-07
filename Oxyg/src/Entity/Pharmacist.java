package Entity;

public class Pharmacist {
	
	
	public Pharmacist() {
		super();
	}

	
	/*Singleton*/
	public Pharmacist(Integer id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public static Pharmacist getInstance() {
		if(instance == null) {
			instance = new Pharmacist();
		}
		return instance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	

	@Override
	public String toString() {
		return "Pharmacist [Id: " + id + "| Name: " + name + "| Surname: " + surname;
	}




	private static Pharmacist instance = null;
	private Integer id;
	private String name;
	private String surname;


}
