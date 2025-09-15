//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1 задание
int ammo = 134;
byte bullet = 5;
short landArea = 32750;
long planet = 232341254;
float procent = 21.23f;
double boble = 212.12121244;

//2 задание
float a = 27.12f;
long b = 987678965549L;
double c = 2.786;
short d = 569;
short e = -159;
short f = 27897;
int g = 67;

//3 задание
System.out.println("---3 задание---");
int lp = 23;
int as = 27;
int ea = 30;
short paper = 480;
var paperPerChild = 480/(lp + as + ea);
System.out.println("На каждого ученика рассчитано " + paperPerChild + " листов бумаги");

//4 задание
System.out.println("---4 задание---");
int wokrForTwoMinute = 16;
int workForOneMinute = wokrForTwoMinute / 2;
int workForOneDay = workForOneMinute * (24 * 60);
int workForThreDay = workForOneDay * 3;
int workForOneMonth = workForOneDay * 30;
System.out.println("За 1 минуту машина произвела " + workForOneMinute + " штук бутылок");
System.out.println("За сутки машина произвела " + workForOneDay + " штук бутылок");
System.out.println("За 3 дня машина произвела " + workForThreDay + " штук бутылок");
System.out.println("За 1 месяц машина произвела " + workForOneMonth + " штук бутылок");

//5 задание
System.out.println("---5 задание---");
byte total = 120;
byte whiteForOne = 2;
byte brownForOne = 4;
int forOneClass = whiteForOne + brownForOne;
int classValue = total / forOneClass;
int totalWhite = classValue * whiteForOne;
int totalBrown =classValue * brownForOne;
System.out.println("В школе, где " + classValue + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

//6 задание
System.out.println("---6 задание---");
float totalWeight = 7.000f;
float chet = 0.250f;
float half = 0.500f;
float first = totalWeight / chet;
float second = totalWeight / half;
float middle = (first + second) /2;
System.out.println("Вариант похудения с четвертью - " + first);
System.out.println("Вариант похудения с половиной - " + second);
System.out.println("Средний вариант похудения по дням - " + middle);

//7 задание
System.out.println("---7 задание---");
int mashasSalary = 67760;
int denisSalary = 83690;
int kristinaSalary = 76230;
float mashasNewSalary = mashasSalary * 1.10f;
float denisNewSalary = denisSalary * 1.10f;
float kristinaNewSalary = kristinaSalary * 1.10f;
int mashasAnnual = mashasSalary * 12;
int denisAnnual = denisSalary * 12;
int kristinaAnnual = kristinaSalary * 12;
float mashasNewAnnual = mashasNewSalary * 12;
float denisNewAnnual = denisNewSalary * 12;
float kristinaNewAnnual = kristinaNewSalary * 12;
float mashasDifference = mashasNewAnnual - mashasAnnual;
float denisDifference = denisNewAnnual - denisAnnual;
float kristinaDifference = kristinaNewAnnual - kristinaAnnual;
System.out.println("Маша теперь получает " + mashasNewSalary + " рублей. Годовой доход вырос на " + mashasDifference + " рублей");
System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");
    }
}






