//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1 задание
        System.out.println("---1 задание---");
byte age = 17;
if (age < 18){
    System.out.println("Если возраст человека равен "+ age + " то он не достиг совершеннолетия, нужно немного подождать");
}else {
    System.out.println("Если возраст человека равен "+ age + " то он совершеннолетний");
}
        //2 задание
        System.out.println("---2 задание---");
byte airTemperature = 6;
if (airTemperature < 5){
    System.out.println("На улице " + airTemperature + " гардусов, нужно надеть шапку ");
} else {
    System.out.println("На улице " + airTemperature + " гардусов, можно идти без шапки");
}
        //3 задание
        System.out.println("---3 задание---");
byte carSpeed = 75 ;
if ( carSpeed > 60){
    System.out.println("Если скорость," + carSpeed + " то придется заплатить штраф");
}else{
    System.out.println("Если скорость," + carSpeed + " можно ездить спокойно");
}

        //4 задание
        System.out.println("---4 задание---");
byte childAge = 5;
if (childAge >=2 && childAge <=6){
    System.out.println("Если возраст человека равен "+childAge+ " то ему нужно ходить в детский сад.");
} else if (childAge >=7 && childAge <=17) {
    System.out.println("Если возраст человека равен "+childAge+ " то ему нужно ходить в детский школу.");
}else {
    System.out.println("Если возраст человека равен "+childAge+ " то ему нужно ходить на работу.");
}
        //5 задание
        System.out.println("---5 задание---");
        byte AgeOfTheAttraction = 34;
        if (AgeOfTheAttraction < 5 ){
            System.out.println("Если возраст ребенка равен "+AgeOfTheAttraction+ " то ему нельзя кататься на аттракционе");
        } else if (AgeOfTheAttraction >=5 && AgeOfTheAttraction <=14) {
            System.out.println("Если возраст ребенка равен "+AgeOfTheAttraction+ " то ему можно кататься на аттракционе в сопровождении взрослого");
        }else {
            System.out.println("Если возраст ребенка равен "+AgeOfTheAttraction+ " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        //6 задание
        System.out.println("---6 задание---");
        byte allPositions = 120;
        byte seatingPositions = 60;
        int standingPositions = allPositions - seatingPositions;
        int reqiredPositions = 34;
        int occupiedSeating = 0;
        int occupiedStanding = 0;
        int totalOccupied = 0;
        if (reqiredPositions <= seatingPositions) {

            occupiedSeating = reqiredPositions;
            totalOccupied = occupiedSeating;
        } else {

            occupiedSeating = seatingPositions;
            occupiedStanding = reqiredPositions - seatingPositions;
            totalOccupied = occupiedSeating + occupiedStanding;
        }if (reqiredPositions < seatingPositions && reqiredPositions < standingPositions) {
            System.out.println("в вагоне еще есть места");
            System.out.println("Занято сидячих мест: " + occupiedSeating + " из " + seatingPositions);
            System.out.println("Занято стоячих мест: " + occupiedStanding + " из " + standingPositions);
            System.out.println("Всего занято: " + totalOccupied + " из " + allPositions);
        } else if (totalOccupied < allPositions) {
            System.out.println("в вагоне еще есть места");
            System.out.println("Занято сидячих мест: " + occupiedSeating + " из " + seatingPositions);
            System.out.println("Занято стоячих мест: " + occupiedStanding + " из " + standingPositions);
            System.out.println("Всего занято: " + totalOccupied + " из " + allPositions);
        } else {
            System.out.println("Вагон полностью заполнен!");
            System.out.println("Занято сидячих мест: " + occupiedSeating);
            System.out.println("Занято стоячих мест: " + occupiedStanding);
        }

        //7 задание
        System.out.println("---7 задание---");
        int one = 21;
        int two = 221;
        int three = 222212;
        if(one > two && one > three){
            System.out.println("большее число это - " + one + " а именно первое число");
        } else if (two > one && two > three) {
            System.out.println("большее число это - " + two + " а именно второе число");
        } else {
            System.out.println("большее число это - " + three + " а именно третье число");
        }
    }

    }
















