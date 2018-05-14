package ru.geekbrains.java1.homework5;

public class Staff {
    private String fIO;
    private String function;
    private String email;
    private String phone;
    private int wage;
    private int age;

    public Staff(String fIO, String function, String email, String phone, int wage, int age) {
        this.fIO = fIO;
        this.function = function;
        this.email = email;
        this.phone = phone;
        this.wage = wage; //преподаватель рекомендовал слово salary для обозначения з/п (более распространённое понятие в анг.яз.)
        this.age = age;
    }

    public void info(){
        System.out.println(fIO + "\n" + age + " лет"+ "\nДолжность: " + function + "\nОклад: " + wage + " руб.");
        System.out.println("Тел. " + phone + "\ne-mail: " + email + "\n");
    }

    public int getAge() { //Геттер для возврата значения возраста
        return age;
    }

    public void setWage(int _wage){ //Сеттер для ввода изменений в з/п (сделал для закрепления материала с урока)
        if (_wage > 0){
            wage = _wage;
        } else {
            System.out.println("Введите корректное значение оклада");
        }
    }
}
