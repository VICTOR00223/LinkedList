import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList mylist = new LinkedList();

        System.out.println("Enter I to insert, D to delete, P to print, E to exit.");
        String choice = sc.nextLine();
        while(!choice.equals("E"))
        {
            switch (choice)
            {
                case "I":
                {
                    System.out.print("Enter key = ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    if (!mylist.exist(key))
                    {
                        mylist.Insert(key);
                    }
                    else
                    {
                        System.out.println("This key already exists.");
                    }
                    break;
                }
                case "D":
                {
                    System.out.print("Enter key = ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    if(mylist.exist(key))
                    {
                        mylist.Delete(key);
                    }
                    else
                    {
                        System.out.println("This key doesn't exist.");
                    }
                    break;
                }
                case "P":
                {
                    mylist.Print();
                    break;
                }
                case "E":
                {
                    break;
                }
            }
            System.out.println("Enter I to insert, D to delete, P to print, E to exit.");
            choice = sc.nextLine();
        }
        System.out.println("End of program.");
    }

}
