import java.util.*;
interface detail {
	public void Details();
}
class car implements detail{
	private String name;
	private String model;
	private int weight;
	public car(String name , String model , int weight){
		this.name = name;
		this.model = model;
		this.weight = weight;
	}

	public void Details(){
		System.out.println("the name of the car is "+name);
		System.out.println("the model of car is "+model);
		System.out.println("the weight of the car is "+weight);
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
		System.out.println("the weight of the plane is "+name);
		System.out.println("the name of the company "+name);
		System.out.println("the name of the model is "+weight);
	}
}
class companies implements detail{
	private List<String> list;
	public companies(List list){
		this.list = list;
	}

	public void Details(){
		System.out.println("the companies are ");
		for(String ele : list){
			System.out.println(ele);
		}
	}
}

class company{
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("honda");
		all.add("AirIndia");
		detail[] allCompany = {
			new car("honda" , "B10" , 490),
			new Airplane("AirIndia"  , "A10" , 1124), 
			new companies(all)
		};
		
		for(detail ele:allCompany){
			ele.Details();
		}
	}
}

