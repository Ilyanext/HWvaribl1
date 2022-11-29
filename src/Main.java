public class Main {
    public static void main(String[] args) {
        //zadach1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        //zadacha2
        dog = dog + 4;
        cat = cat + 4;
        paper= paper + 4;

        System.out.println (dog);
        System.out.println ( cat);
        System.out.println ( paper);

        //zadacha3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println (dog);
        System.out.println ( cat);
        System.out.println ( paper);

        //zadacha4
        var friend = 19.0;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        //zadacha5
        var frong = 3.5;
        System.out.println(frong);
        frong = frong*10;
        System.out.println(frong);
        frong = frong/3.5;
        System.out.println(frong);
        frong = frong + 4;
        System.out.println(frong);

        //zadacha6
        var boxerWhait1 = 78.2;
        var boxerWait2 = 82.7;
        var obhiWait = boxerWhait1 + boxerWait2;
        System.out.println("Общий вес боксеров " + obhiWait + " кг!" );
        var raznicha = boxerWhait1 - boxerWait2;
        System.out.println("Разница в весе между боксерами " + raznicha + " кг!");

        //zadacha7
        var raznicha2 = boxerWait2 % boxerWhait1  ;
        System.out.println(raznicha2);

        //zadacha8
        var overTime = 640;
        var Htime = 8;
        var Humen = 0;
        Humen = overTime/Htime;
        System.out.println("Всего работников в компании " + Humen + " человек");
        Humen = Humen + 94;
        Htime = Humen / Htime;
        System.out.println("Если в компании работает " + Humen + " человек, то всего " + Htime + " часов работы может быть поделено между сотрудниками.");


    }
}