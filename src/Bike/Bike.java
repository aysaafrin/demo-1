package Bike;

public class Bike {
	 private String name;
	  private String model;
	  private String type;
	  private String Engine;
	  private Long price;
	  
	  
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bike(String name, String model, String type, String engine, Long price) {
		super();
		this.name = name;
		this.model = model;
		this.type = type;
		Engine = engine;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getEngine() {
		return Engine;
	}


	public void setEngine(String engine) {
		Engine = engine;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}
	  
	  
}
