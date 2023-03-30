package activities;

public class Car {
    public String color;
    public String transmission;
    public int make;
    public int tyres;
    public int doors;

    public Car(){
         tyres = 4;
        doors = 4;
    }

    public void displayCharacteristics()
    {
       System.out.println("Color is "+ color + " transmission is " + transmission + "make is " + make +" tyres "+tyres+" doors "+doors);;

    }
  public void accelerate(){
      System.out.println("Car is moving forward.");
  }

    public void brake(){
        System.out.println("Car has stopped");
    }
}
