public class second {
public static void main (String[] args){

    //4 задание
    byte childAge = 5;
    if (childAge >= 2 && childAge <= 6) {
        System.out.println("Если возраст человека равен " + childAge + " то ему нужно ходить в детский сад.");
    } else if (childAge >= 7 && childAge <= 17) {
        System.out.println("Если возраст человека равен " + childAge + " то ему нужно ходить в детский школу.");
    } else if (childAge >= 18 && childAge <= 24) {
        System.out.println("Если возраст человека равен " + childAge + " то ему нужно ходить в университет.");
    } else {
        System.out.println("Если возраст человека равен " + childAge + " то ему нужно ходить на работу.");
    }

    //6 задание
    System.out.println("---6 задание---");
    byte allPositions = 120;
    byte seatingPositions = 60;
    int standingPositions = allPositions - seatingPositions;
    int reqiredPositions = 34;

    if (reqiredPositions < seatingPositions) {
        System.out.println("В вагоне есть сидячие места");
    } else if (reqiredPositions < seatingPositions + standingPositions) {
        System.out.println("В вагоне есть только стоячие места");
    } else {
        System.out.println("Вагон полностью заполнен");
    }
}
}
