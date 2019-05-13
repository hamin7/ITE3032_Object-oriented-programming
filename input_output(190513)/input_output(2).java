import java.io.*;

public class Welcome {
  public static void main(String[] args){
    try{
      Fileoutputstream out = new Fileoutputstream("out.bin");
      try{
        out.write(65);
      }
      finally{
        out.close();
      }
    }
    catch( IOException e){
      System.out.println("Something went wrong with I/O ...");
    }
  }
}
