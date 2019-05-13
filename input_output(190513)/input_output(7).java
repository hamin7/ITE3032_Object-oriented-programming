import java.io.*;

public class Welcome {
  public static void main(String[] args){
    try{
      DataOutputStream in = new DataOutputStream(new FileOutputstream("out.bin"), 4096);
      out.writeDouble(5.0);
      out.writeInt(34);
      out.writeByte(6);
      out.close();

      DataInputStream in = new DataInputStream(new FileInputStream("out.bin"));
      System.out.println(in.readDouble());
      System.out.println(in.readInt());
      System.out.println(in.readByte());
      in.close();
    }
    catch( IOException e){
      System.out.println("Something went wrong with I/O ...");
    }
  }
}
