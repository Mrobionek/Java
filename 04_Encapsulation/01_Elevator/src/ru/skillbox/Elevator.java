package ru.skillbox;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        currentFloor = getCurrentFloor();

        if (floor <= maxFloor && floor >= minFloor) {
            if (floor > currentFloor) {
                while (currentFloor != floor) {
                    moveUp();
                    System.out.println("Лифт перемещен на этаж " + currentFloor);
                }
            } else if (floor < currentFloor){
                while (currentFloor != floor) {
                    moveDown();
                    System.out.println("Лифт перемещен на этаж " + currentFloor);
                }
            }
        } else {
            System.out.println("Задан неверный этаж");
        }
    }
}
