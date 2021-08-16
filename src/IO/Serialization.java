package IO;

import java.io.*;

class Person implements Externalizable {

    String name;
    transient String title;

    public Person() {
    }

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return name + '\t' + title;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}



public class Serialization {

    public static void main(String[] args) {

        Person p = new Person("Lee","매니저");

        try(FileOutputStream fos = new FileOutputStream("serial.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("serial.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();

            if(obj instanceof Person){
                Person p1 =(Person) obj;
                System.out.println(p1);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
