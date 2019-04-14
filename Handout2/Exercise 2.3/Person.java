public class Person{
  public String firstName;      // public String 타입의 이름.
  public String lastName;     // public String 타입의 성.
  public Address address;     // public Address 타입의 주소.

  @Override         // 오버라이딩 해서.
  public String toString(){     // 객체가 가진 정보를 문자열로 반환하는 메소드.
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
