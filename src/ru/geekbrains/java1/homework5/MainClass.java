package ru.geekbrains.java1.homework5;

public class MainClass {

    public static void main(String[] args) {
        // 1-й способ заполнения массива экземплярами класса:
//        Staff[] arrPerson = new Staff[5];
//        arrPerson[0] = new Staff("Гришин Дмитрий Владимирович","программист Java","grishin@geek.org","+7 916 2979765", 150000, 30);
//        arrPerson[1] = new Staff("Колодина Анна Сергеевна", "экономист", "kolodina@geek.org", "+7 916 5678756", 90000, 27);
//        arrPerson[2] = new Staff("Сотников Артём Алексеевич", "генеральный директор", "sotnikov@geek.org", "+7 916 4879898", 450000, 41);
//        arrPersons3] = new Staff("Цуп Михаил Сергеевич", "менеджер проектов", "tsup@geek.org", "+7 916 4565656", 130000, 45);
//        arrPerson[4] = new Staff("Сорокин Виктор Антонович", "главный бухгалтер", "sorokin@geek.org", "+7 916 1252525", 100000, 35);

        // 2-й способ заполнения массива объектами:
        Staff[] arrPerson = {new Staff("Гришин Дмитрий Владимирович","программист Java","grishin@geek.org","+7 916 2979765", 150000, 30),
                new Staff("Колодина Анна Сергеевна", "экономист", "kolodina@geek.org", "+7 916 5678756", 90000, 27),
                new Staff("Сотников Артём Алексеевич", "генеральный директор", "sotnikov@geek.org", "+7 916 4879898", 450000, 41),
                new Staff("Цуп Михаил Сергеевич", "менеджер проектов", "tsup@geek.org", "+7 916 4565656", 130000, 45),
                new Staff("Сорокин Виктор Антонович", "главный бухгалтер", "sorokin@geek.org", "+7 916 1252525", 100000, 35)};

        for (int i = 0; i < arrPerson.length; i++) {
            if (arrPerson[i].getAge() > 40) arrPerson[i].info();
        }
    }
}
