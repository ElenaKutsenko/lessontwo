public class Main {
    public static void main(String[] args) {
        System.out.println("exercise 1");

     byte box = 1;
     System.out.println(box);
     short apple = 200;
     System.out.println(apple);
     int SoundSpeed = 343;
     System.out.println(SoundSpeed);
     long SpeedOfLight = 299792458;
     System.out.println(SpeedOfLight);
     float orange = 2.5F;
     System.out.println(orange);
     double gold = 1.2345;
     System.out.println(gold);

     System.out.println("exercise 2");

        float BoxerOne = 78.2F;
        System.out.println("Вес первого боксера"+BoxerOne+ "кг");
        float BoxerTwo = 82.7F;
        System.out.println("Вес второго боксера"+BoxerTwo+ "кг");
        float TotalWeight = BoxerOne+ BoxerTwo;
        System.out.println("Общий вес боксеров" + TotalWeight+ "кг");
        float DifferenceTheWeight = BoxerTwo - BoxerOne;
        System.out.println("Раазница в весе боксеров" + DifferenceTheWeight + "кг");

        System.out.println("exercise 3");

        float banana = 80;
        banana = banana  * 3;
        System.out.println("бананы" + banana +"грамм");
        float milk = 2;
        milk = milk * 105;
        System.out.println("молоко" + milk + "грамм");
        float IceCream = 2;
        IceCream = IceCream * 100;
        System.out.println("мороженное" + IceCream + "грамм");
        float eggs = 4;
        eggs = eggs * 70;
        System.out.println("яйцо"+ eggs +"грамм");
        float breakfast = banana + milk + IceCream +eggs;
        System.out.println("Вес завтрака в граммах" + breakfast + "грамм");
        float AllBreakfast = breakfast /1000;
        System.out.println("Вес завтрака в килограммах" + AllBreakfast + "кг");

        System.out.println("exercise 4");

        float weight = 7000F;
        System.out.println("Нужно сбросить" + weight + "грамм");
        float DietOne = weight /250;
        System.out.println("В первом случае нужно" + DietOne+ "дней");
        float DietTwo = weight /500;
        System.out.println("В втором случае нужно" + DietTwo+ "дней");
        float mean = (DietOne + DietTwo) /2;
        System.out.println("В среднем потребуется" + mean + "дней");

        System.out.println("exercise 5");

        float MashaNow = 67760;
        System.out.println("Сейчас Маша получает" + MashaNow + "рублей");
        float MashaLater = MashaNow +  (MashaNow/10) ;
        System.out.println("В следующем году Маша получит" + MashaLater + "рублей");
        float MashaYear = (MashaLater - MashaNow) *12;
        System.out.println("Годовой доход Маши вырос на" + MashaYear + "рублей");

        float DenisNow = 83690;
        System.out.println("Сейчас Денис получает" + DenisNow + "рублей");
        float DenisLater = DenisNow +  (DenisNow/10) ;
        System.out.println("В следующем году Денис получит" + DenisLater + "рублей");
        float DenisYear = (DenisLater - DenisNow) *12;
        System.out.println("Годовой доход Дениса вырос на" + DenisYear + "рублей");

        float KristinaNow = 76230;
        System.out.println("Сейчас Кристина получает" + KristinaNow + "рублей");
        float KristinaLater = KristinaNow +  (KristinaNow/10) ;
        System.out.println("В следующем году Кристина получит" + KristinaLater + "рублей");
        float KristinaYear = (DenisLater - DenisNow) *12;
        System.out.println("Годовой доход Кристины вырос на" + KristinaYear + "рублей");













    }
}