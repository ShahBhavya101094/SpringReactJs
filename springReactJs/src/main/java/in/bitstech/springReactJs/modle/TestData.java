package in.bitstech.springReactJs.modle;

public class TestData {

	private Long Id;
	private  String Name;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public TestData(Long id, String name) {
		super();
		Id = id;
		Name = name;
	}
	
	
}
