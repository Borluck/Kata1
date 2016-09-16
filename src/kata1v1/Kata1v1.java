package kata1v1;

import java.util.Date;

public class Kata1v1 {

    public static void main(String[] args) {
        Person jonatan = new Person("Jonatan",new Date(93,1,6));
        System.out.println(jonatan.getName() + " tiene " + jonatan.getAge());
    }
}
