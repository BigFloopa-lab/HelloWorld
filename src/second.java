public class second {
public static void main (String[] args){

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
}
}
