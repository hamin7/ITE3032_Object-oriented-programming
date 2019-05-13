import java.io.*;

public class main {
  public static void main(String[] args){
    try{
      Fileoutputstream out = new Fileoutputstream("out.bin");
      out.write(65);
      // throw exception ...
      out.close();
    }
    catch( IOException e){
      System.out.println("Something went wrong with I/O ...");
    }
    finally{
      out.close();
    }
  }
}
