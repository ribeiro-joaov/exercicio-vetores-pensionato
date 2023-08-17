import java.util.Arrays;
import java.util.Scanner;

import entities.Rooms;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rooms[] room = new Rooms[10];

        System.out.print(" \nHow many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(" \n\nRent #" + i + ": ");
            System.out.print("Student name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Student e-mail: ");
            String email = sc.next();
            System.out.print("which room will be rented? ");
            int roomNumber = sc.nextInt();

            room[roomNumber] = new Rooms(name, email);

        }
        System.out.println(" \nBusy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (room[i] != null) {

                System.out.println(i + ": " + room[i]);
            }
        }
    }


}
