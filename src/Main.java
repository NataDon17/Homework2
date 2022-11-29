public class Main {
    public static void main(String[] args) {
        task1();// Метод task1
    }
    public static void task1 () {
        //Пишем коды задач
        System.out.println("Задача 1");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend=19;
        System.out.println(friend);
        friend=friend*2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        System.out.println("Задача 6 и 7");
        var boxer1Weigth=78.2;
        var boxer2Weigth=82.7;
        var totalBoxersWeigth=boxer1Weigth+boxer2Weigth;
        System.out.println("Общий вес боксерев составляет "+totalBoxersWeigth+" кг.");
        var differentialBoxersWeigth=boxer2Weigth-boxer1Weigth;
        System.out.println("Разница в весах боксеров составляет "+differentialBoxersWeigth+" кг.");
        var overload=(boxer2Weigth)%boxer1Weigth;
        System.out.println("Разница в весах, вычисленная с помощь функции остаток от деления "+overload+" кг.");

        System.out.println("Задача 8");
        var hoursWork=640;
        var dayHoursWork=8;
        var workers=hoursWork/dayHoursWork;
        System.out.println("Всего работников в компании "+workers+" человек.");
        workers=workers+94;
        hoursWork=workers*dayHoursWork;
        System.out.println("Если в компании работает "+workers+" человек, то всего "+hoursWork+" часа(ов) работы может быть поделено между сотрудниками.");


    }
}