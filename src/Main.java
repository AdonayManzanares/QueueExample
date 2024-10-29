import java.util.Scanner;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Select one of the following options");
            System.out.println("1) Is Empty");
            System.out.println("2) Is Full");
            System.out.println("3) Add Element to the Queue");
            System.out.println("4) Remove Element from the Queue");
            System.out.println("5) Print the Queue content");
            System.out.println("0) Exit");
            System.out.println("Please enter your choice:");
            choice = scan.nextInt();

            switch(choice){
                case 0:
                    return;
                case 1:
                    if(queue.isEmpty())
                    {
                        System.out.println("Your Queue is empty");
                    }
                    break;
                case 2:
                    if(queue.isFull())
                    {
                        System.out.println("your Queue is full");
                    }
                    break;
                case 3:
                    System.out.println("Enter a value to store in the Queue:");
                    int val = scan.nextInt();
                    queue.enQueue(val);
                    break;
                case 4:
                    queue.deQueue();
                    break;
                case 5:
                    System.out.println(queue.toString());
                default:
                    System.out.println("Incorrect Choice!");
            }

        }
        while(choice != 0);
    }
}