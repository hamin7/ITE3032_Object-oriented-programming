public class Address{
  private String street;      // private String 타입의 street.
  public String city;     // public String 타입의 city.
  public String zipCode;      // public String 타입의 zipCode.
  public void printAddress(){     // 주소를 출력해 주는 함수 printAddress.
    System.out.println(this.street);      // 객체 자신의 street변수 값을 출력.
  }
  public void setStreet(String street){     // street를 설정하는 setStreet함수, String타입 street를 파라미터로 받는다.
    this.street = street;     // 이 객체의 street를 파라미터로 받은 street값으로 대입.
  }
  public String getStreet(){      // get 매소드.
    return this.street;     // 이 객체의 street 값을 리턴한다.
  }
}
