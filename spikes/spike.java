import java.util.*;
interface detail {
	public void Details();
}
class car implements detail{
	private String name;
	private String model;
	private int weight;
	public car(String name , String model){
		this.name = name;
		this.model = model;
	}

	public void Details(){
		System.out.println("the name of the car is "+name);
		System.out.println("the model of car is "+model);
	}

}

class Airplane implements detail{
	private String name;
	private String model;
	private int weight;
	public Airplane(String name , String model , int weight){
		this.name= name;
		this.model = model;
		this.weight = weight;
	} 
	public void Details(){
		System.out.println("the weight of the plane is "+weight);
		System.out.println("the name of the company "+name);
		System.out.println("the name of the model is "+weight);
	}
}

class company{
	public static void main(String[] args) {
		detail honda =  new car("honda" , "B10");
		detail AirIndia = new Airplane("AirIndia" , "A10" , 1124);
		honda.Details();
		AirIndia.Details();
	}
}



