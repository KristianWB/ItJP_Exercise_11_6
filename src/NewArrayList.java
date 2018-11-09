import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Date;

public class NewArrayList {
    public static void main(String[] args)   {

        Circle circle1 = new Circle();
        String string1 = "Hello Class";
        Date date1 = new Date();
        Loan loan1 = new Loan();

        ArrayList<Object> list = new ArrayList<>();
        list.add(circle1);
        list.add(string1);
        list.add(date1);
        list.add(loan1);

        list.forEach(System.out::println);
        System.out.println(circle1.toString());
    }
}
