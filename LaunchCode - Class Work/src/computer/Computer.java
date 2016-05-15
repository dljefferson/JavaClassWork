package computer;

public class Computer {
	
	//Fields (attributes):
	
	
	private int memory;
	protected double size;
	protected double processor;
    private String brand;
     //memory -int
    //size   -double
	//processor -double
	//brand  - string
	
	//Behaviors
	public Computer(int memory, double size, double processor, String brand)
	{
		this.memory = memory;
		this.size = size;
		this.processor = processor;
		this.brand = brand;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public double getSize()
	{
		return this.size;
	}
	
	public double getProcessor()
	{
		return this.processor;
	}
	
	public int getMemory()
	{
		return this.memory;
	}
	
	public void addMemory(int newMemory)
	{
		if(this.memory + newMemory > 8)
		{
			return;
		}
	    else
	    {
	    	this.memory = this.memory + newMemory;
	    }
	}
	
	public void setProcessor(double newProcessor)
	{
		this.processor = newProcessor;
	}
	
	public String toString()
	{
		return "Memory: " + this.memory + " GB " + "Processor: " + this.processor + " Ghz " + " Size: " + this.size + " Brand: " + this.brand;
		
	}
	
	public static void main(String args[])
	{
		Computer myComputer = new Computer(8, 2.4, 15.5, "Lenovo");
		System.out.println(myComputer.getBrand());
		Computer yourComputer = new Computer(8, 2.3, 15.6, "Dell");
		System.out.println(yourComputer.getBrand());
	    yourComputer.addMemory(7);
	    System.out.println(yourComputer.getMemory());
	    System.out.println(yourComputer.toString());
	}
	//Create a computer - constructor
	//Get brand name
	//Get size
	//Get Processor speed
	//Get memory
	//Add memory
	//Swap processor
	//Display information as a string
	
	
	
	
}



