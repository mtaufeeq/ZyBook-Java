import java.util.Scanner;

public class RectangleChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, width, height;
        System.out.println("Enter x coordinate: ");
        x = in.nextInt();
        System.out.println("Enter y coordinate: ");
        y = in.nextInt();
        System.out.println("Enter width: ");
        width = in.nextInt();
        System.out.println("Enter height: ");
        height = in.nextInt();

        BetterRectangle rectangle = new BetterRectangle(x, y, width, height);
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }

}