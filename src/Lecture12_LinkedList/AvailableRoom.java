package Lecture12_LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class AvailableRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Room> roomList = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String roomCode = sc.next();
            int rentalPrice = sc.nextInt();
            int roomStatus = sc.nextInt();

            Room room = new Room(roomCode, rentalPrice, roomStatus);
            roomList.add(room);
        }

        for (Room room : roomList) {
            if (room.getRoomStatus() == 0) {
                System.out.println(room.getRoomCode() + " " + room.getRentalPrice());
            }
        }
        sc.close();
    }

    private static class Room {
        private String roomCode;
        private int rentalPrice;
        private int roomStatus;

        public Room(String roomCode, int rentalPrice, int roomStatus) {
            this.roomCode = roomCode;
            this.rentalPrice = rentalPrice;
            this.roomStatus = roomStatus;
        }

        public String getRoomCode() {
            return roomCode;
        }

        public int getRentalPrice() {
            return rentalPrice;
        }

        public int getRoomStatus() {
            return roomStatus;
        }
    }
}
