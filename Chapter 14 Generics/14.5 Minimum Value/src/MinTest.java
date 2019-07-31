import java.util.ArrayList;

public class MinTest {

    static <T extends Comparable> T FindSmallest(ArrayList<T> list) {
        T smallest = list.get(0);
        for(int i = 1; i < list.size(); ++i) {
            if(smallest.compareTo(list.get(i)) > 0) {
                smallest = list.get(i);
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        ArrayList<Double> one = new ArrayList<Double>();
        one.add(4.5);
        one.add(45.2);
        one.add(14.5);
        one.add(3.14);
        one.add(4.5);
        one.add(450.0);

        System.out.println("The smallest value in: "+one+" is: "+ FindSmallest(one));
    }

}