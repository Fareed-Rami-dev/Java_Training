
public class BMW extends Car {
	private boolean hasSportPackage;   // Does it have sport features?
    private String series;             // e.g., 3 Series, 5 Series, 7 Series
    private boolean isElectric;        // e.g., i8 is electric/hybrid
    BMW(String model,int YOP,String brand,int year,String color,int horse,
    		boolean hasSport,String series,boolean electric)
    {
    	   super(model,YOP,brand,year,color,horse);
    	   this.hasSportPackage=hasSport;
    	   this.series=series;
    	   this.isElectric=electric;
    }
    BMW()
    {
    	
    }
    void setSportPackage(boolean sport)
    {
    	   this.hasSportPackage=sport;
    }
    boolean getSportPackage()
    {
    	   return this.hasSportPackage;
    }
    void setSeries(String s)
    {
    	   this.series=s;
    }
    String getSeries()
    {
    	return this.series;
    }
    void setElectricStatus(boolean isElectric)
    {
    	   this.isElectric=isElectric;
    }
    void speed()
    {
    	  System.out.println("2000");
    }
    void fun2()
    {
    	   System.out.println("BMW BMW\n");
    }
    
}
