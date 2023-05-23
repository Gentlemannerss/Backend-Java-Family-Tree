package org.example;

public class Main {
    public static void main(String[] args) {
        Person paul = new Person("Paul", "Dijxhoorn", 'm', 27);
        Person vader = new Person("Damon", "Antonius Hendrikus", "van Bergen", 'm', 27);
        Person kind = new Person("Jelmer", "Agricola", 'm', 12);
        Person moeder = new Person("Nisha", "Lamichhane", 'v', 29);

        kind.addParents(kind, moeder, vader);

        System.out.println(kind.getMother().getName());
        System.out.println(kind.getFather().getName());
        System.out.println(moeder.getChilderen().get(0).getName());
        System.out.println(vader.getChilderen().get(0).getName());
    }
}