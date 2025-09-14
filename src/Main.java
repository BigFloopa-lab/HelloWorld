//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1 задание
System.out.println("---1 Задание---");
var dog =  8.0;
var cat = 3.6;
var paper = 763789;

System.out.println(dog + " ; " + cat + " ; "+ paper);

//2 задание
System.out.println("---2 Задание---");
 dog =  8.0 + 4;
 cat= 3.6  + 4 ;
 paper = 763789 + 4;
System.out.println(dog + " ; " + cat+ " ; "+ paper);

//3 задание
System.out.println("---3 Задание---");
 dog =  8.0 - 3.5;
 cat = 3.6 - 1.6;
 paper = 763789 - 7639;
System.out.println(dog + " ; " + cat+ " ; "+ paper);

//4 задание
System.out.println("---4 Задание---");
var friend = 19;
System.out.println(friend);
friend += 2;
System.out.println(friend);
friend /=7;
System.out.println(friend);

//5 задание
System.out.println("---5 Задание---");
var frog = 3.5;
System.out.println(frog);
frog += 10;
System.out.println(frog);
frog /= 3.5;
System.out.println(frog);
frog +=4;
System.out.println(frog);

//6 задание
System.out.println("---6 Задание---");
var FirstBoxer = 78.2;
var SecondBoxer = 82.7;
System.out.println("Total sum weight:" + "" +(FirstBoxer + SecondBoxer));
System.out.println("Weight difference:" + "" +(SecondBoxer - FirstBoxer  ));

//7 задание
System.out.println("---7 Задание---");
FirstBoxer = 78.2;
SecondBoxer = 82.7;
System.out.println("Remainder of division:" + "" + (SecondBoxer % FirstBoxer));

// 8 задание
System.out.println("---8 Задание---");
var TotalHour = 640;
var WorkHour = 8;
var Workers = TotalHour / WorkHour;
System.out.println("Всего работников в компании - " + Workers + " человек");

var addWorker = Workers + 94;
var TotalTime = addWorker * WorkHour;
System.out.println("Если в компании работает " + addWorker + " человек, то всего " + TotalTime + " часов работы может быть поделено между сотрудниками");
    }
}





