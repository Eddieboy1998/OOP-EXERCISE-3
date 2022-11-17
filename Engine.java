public class Engine
{
	private String brand;
	
	public Engine() {
		brand = "Unknown";
	}
	public String getBrand() {
		return brand;
	}
	public String startEngine() {
		return"The car engine has Started.";
	}
    public String stopEngine() {
	return "The car engine has Stopped";
}
}
