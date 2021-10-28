import java.util.ArrayList;
import java.util.Date;

public class ArrayListObject_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> obj = new ArrayList<>();
        obj.add(new Date());
        obj.add(new Circle2D());
        obj.add("this is a string.");
        for(Object temp: obj){
            System.out.println(temp.toString());
        }
    }
}
