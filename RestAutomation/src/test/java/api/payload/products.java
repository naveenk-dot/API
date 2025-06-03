package api.payload;

public class products {

	private String name;
	
	private Data data;

	public Data getData() {
		return data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
}
