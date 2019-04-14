public class Person{
  public String firstName;      // public String 타입의 이름.
  public String lastName;     // public String 타입의 성.
  public Address address;     // public Address 타입의 주소.

  @Override         // 오버라이딩 해서.
  public String toString(){     // 객체가 가진 정보를 문자열로 반환하는 메소드.
    //TODO Auto-generated method stub
    return firstName+lastName+address.getStreet();      // firstName과 lastName과 address객체(?)의 getStreet를 이어 붙이는???
  }
  public String getFirstName(){     // firstName get
    return firstName;     // firstName을 리턴
  }
  public void setFirstName(String firstName){     // String타입 firstName을 파라미터로 받아 set.
    this.firstName = firstName;     // 이 객체의 firstName을 매개변수로 받은 firstName으로 대입.
  }
  public String getLastName(){      // lastName을 겟
    return lastName;      // lastName을 리턴.
  }
  public void setLastName(String lastName){     // String타입 lastName을 매개변수로 받아 set.
    this.lastName = lastName;     // 이 객체의 lastName을 매개변수로 받은 lastName으로 대입.
  }
  public Address getAddress(){      // Address객체의 address를 get
    return address;     // address를 리턴
  }
  public void setAddresss(Address address){     // Address타입의 address를 매개변수로 받아 address를 set.
    this.address = address;     // 이 객체의 address를 매개변수로 받은 address로 대입.
  }
}
