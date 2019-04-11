public class Person{
  public String firstName;
  public String lastName;
  public Address address;

  @Override
  public String toString(){
    //TODO Auto-generated method stub
    return firstName+lastName+address.getStreet();
  }
  public String getFirstName(){
    return firstName;
  }
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public Address getAddress(){
    return address;
  }
  public void setAddresss(Address address){
    this.address = address;
  }
}
