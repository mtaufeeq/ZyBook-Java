import java.util.Scanner;
import java.util.ArrayList;

            public class DataVisualizer {
                public static void main(String[] args) {
                    /* Type your code here. */
                    Scanner scan = new Scanner(System.in);

                    System.out.print("Enter a title for the data:\n");
                    String title = scan.nextLine();
                    System.out.print("You entered: " + title);
                    System.out.println();

                    System.out.print("\nEnter the column 1 header:\n");
                    String column1 = scan.nextLine();
                    System.out.print("You entered: " + column1);
                    System.out.println();

                    System.out.print("\nEnter the column 2 header:\n");
                    String column2 = scan.nextLine();
                    System.out.print("You entered: " + column2);
                    System.out.println();

                    ArrayList<Integer> data = new ArrayList<Integer>();
                    ArrayList<String> strings = new ArrayList<String>();

                    while(true)  {

                        System.out.print("Enter a data point (-1 to stop input):\n");
                        String line = scan.nextLine();


                        if (line.equals("-1"))   {
                            break;
                        }

                        String str[] = line.split(",");

                        if (!line.contains(","))   {
                            System.out.println("Error: No comma in string.");

                        }

                        else if (str.length > 2)   {

                            System.out.println("Error: Too many commas in input.");

                        }

                        else if(!str[1].matches(".*\\d.*"))   {

                            System.out.println("Error: Comma not followed by an integer.");

                        }

                        else   {

                            int point = Integer.parseInt(str[1].trim());

                            strings.add(str[0]);
                            data.add(point);

                            System.out.println("Data string: " + str[0]);
                            System.out.println("Data integer: " + point);
                            System.out.println();
                        }
                    }

                    // Output

                    System.out.printf("\n%33s\n", title);
                    System.out.printf("%-20s|%23s\n", column1 , column2);
                    System.out.println("--------------------------------------------");

                    for (int i = 0; i < strings.size(); i++)

                    {

                        System.out.printf("%-20s|%23d\n", strings.get(i), data.get(i));

                    }

                    System.out.println();

                    for (int i = 0; i < strings.size(); i++)

                    {

                        // Histogram Each name is right justified with a minimum of 20 characters.

                        System.out.printf("%20s", strings.get(i));

                        System.out.print(" ");

                        for (int j = 0; j < data.get(i); j++)

                        {

                            System.out.print("*");

                        }

                        System.out.println();

                    }

                }
            }