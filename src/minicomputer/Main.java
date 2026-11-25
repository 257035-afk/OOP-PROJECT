
package minicomputer;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  CPU cpu = new CPU("Intel i5", 4, 3.5);

       
  RAM ram = new RAM(8000);

   Storage storage = new Storage("Samsung SSD", 500);

         Computer computer = new Computer("My Computer", cpu, ram, storage);

    int choice = -1;

   while (choice != 0) {

            System.out.println("\n===== MiniComputer Menu =====");
            System.out.println("1. Turn ON Computer");
            System.out.println("2. Shut Down Computer");
            System.out.println("3. Display Computer Specifications");
            System.out.println("4. Allocate RAM");
            System.out.println("5. Release RAM");
            System.out.println("6. Store Data");
            System.out.println("7. Remove Data");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

    switch (choice) {

                case 1:
                    computer.powerOn();
                    break;

                case 2:
                    computer.shutDown();
                    break;

                case 3:
                    computer.displaySpecifications();
                    break;

                case 4:
                    System.out.print("Enter RAM amount: ");
                    int ramAmount = input.nextInt();

                    if (computer.getRAM().allocateMemory(ramAmount)) {
                        System.out.println("RAM allocated successfully");
                    } else {
                        System.out.println("Invalid RAM amount");
                    }
                    break;

                case 5:
                    System.out.print("Enter RAM amount: ");
                    int releaseAmount = input.nextInt();

                    if (computer.getRAM().releaseMemory(releaseAmount)) {
                        System.out.println("RAM released successfully");
                    } else {
                        System.out.println("Invalid RAM amount");
                    }
                    break;

                case 6:
                    System.out.print("Enter storage amount: ");
                    int storageAmount = input.nextInt();

                    if (computer.getStorage().storeData(storageAmount)) {
                        System.out.println("Data stored successfully");
                    } else {
                        System.out.println("Not enough storage space");
                    }
                    break;

                case 7:
                    System.out.print("Enter storage amount: ");
                    int removeAmount = input.nextInt();

                    if (computer.getStorage().removeData(removeAmount)) {
                        System.out.println("Data removed successfully");
                    } else {
                        System.out.println("Invalid storage amount");
                    }
                    break;

                case 0:
                    System.out.println("Program ended");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        input.close();
    }
}
