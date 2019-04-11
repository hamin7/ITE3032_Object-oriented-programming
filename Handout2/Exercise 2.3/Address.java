public class Address{
  private String street;
  public String city;
  public String zipCode;
  public void printAddress(){
    System.out.println(this.street);
  }
  public void setStreet(String street){
    this.street = street;
  }
  public String getStreet(){
    return this.street;
  }
}
