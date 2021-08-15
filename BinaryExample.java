package review;

import IOPractice.Stonk;

import java.io.*;
import java.util.Arrays;

public class BinaryExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
        dos.writeInt(10);
        dos.writeShort(15);
        dos.writeLong(42);
        dos.writeUTF("ab");
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"));
        int a = dis.readInt();
        short b = dis.readShort();
        long c = dis.readLong();
        String d = dis.readUTF();
        dis.close();
        System.out.println(a + " " + b + " " + c + " " + d);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stonks.dat"));
        Stonk[] stonks = new Stonk[3];
        Stonk nok = new Stonk("NOK", 1000, 100 );
        Stonk gme = new Stonk("GME", 1, 5000);
        Stonk bb = new Stonk("BB", 1000, 100);
        stonks[0] = nok;
        stonks[1] = gme;
        stonks[2] = bb;
        oos.writeObject(stonks);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stonks.dat"));
        Stonk[] s = (Stonk[]) ois.readObject();
        System.out.println(Arrays.toString(s));
    }
}
