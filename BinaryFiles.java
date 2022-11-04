import java.io.*;

public class BinaryFiles {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("test.dat");
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeUTF("Carlos");
        dout.close();
        FileInputStream fin = new FileInputStream("test.dat");
        DataInputStream din = new DataInputStream(fin);
        System.out.println(din.readUTF());
        din.close();
    }
}
