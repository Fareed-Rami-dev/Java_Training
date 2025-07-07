
 abstract public class Car {
  private String carModel; 
  private int YearOfProduction;
  String brand;           
  int year;            
  String color;        
  int horsepower;
  Car()
  {
	  
  }
  Car(String model,int YOP,String brand,int year,String color,int horse)
  {
	  this.carModel=model;
	  this.YearOfProduction=YOP;
	  this.brand=brand;
	  this.year=year;
	  this.color=color;
	  this.horsepower=horse;
  }
  public String getCarModel() {
	return carModel;
  }
  public void setCarModel(String carModel) {
	this.carModel = carModel;
  }
  public int getYearOfProduction() {
	return YearOfProduction;
  }
  public void setYearOfProduction(int yearOfProduction) {
	YearOfProduction = yearOfProduction;
  }
  public String getBrand() {
	return brand;
  }
  public void setBrand(String brand) {
	this.brand = brand;
  }
  public int getYear() {
	return year;
  }
  public void setYear(int year) {
	this.year = year;
  }
  public String getColor() {
	return color;
  }
  public void setColor(String color) {
	this.color = color;
  }
  public int getHorsepower() {
	return horsepower;
  }
  public void setHorsepower(int horsepower) {
	this.horsepower = horsepower;
  }
  //abstract void speed();
  void fun2()
  {
	  System.out.println("CAR CAR\n");
  }
  abstract void speed();
}
