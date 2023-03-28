package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    private Person mother;
    private Person father; // niet alleen een String, maar een class omdat hij ook een leeftijd enz heeft.
    private ArrayList<Person> siblings;
    private ArrayList<Person> childeren; // dit is omdat de kinderen kunnen veranderen. dus geen class maar een list met classes.
    private ArrayList<Pet> pets;

    // ----------- Constructor
    // Verschillende constructors zijn een goede manier van werken, dit om verschillende casussen op te vangen.
    public Person(String name, String lastName, char sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, char sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    // ----------- Methodes
    public void addParents(Person child, Person mother, Person father) {
        child.setMother(mother);
        child.setFather(father);
        mother.addChildToChilderen(child, mother);
        father.addChildToChilderen(child, father);
    }

    private void addChildToChilderen(Person child, Person parent) {
        ArrayList<Person> kids = new ArrayList<>();
        if (parent.getChilderen() != null) {
            kids.addAll(parent.getChilderen());
        }
        kids.add(child);
        parent.setChilderen(kids);
    }

    public void addPet(Person person, Pet pet) {
        ArrayList<Pet> pets = new ArrayList<>();
        if (person.getPets() != null) {
            pets.addAll(person.getPets());
        }
        pets.add(pet);
        person.setPets(pets);
    }

    public void addSibling(Person person, Person sibling) {
        ArrayList<Person> family = new ArrayList<>();
        if (person.getSiblings() != null) {
            family.addAll(person.getSiblings());
        }
        family.add(sibling);
        person.setSiblings(family);
    }

    public List<Person> getGrandChilderen() {
        List<Person> grandChildren = new ArrayList<>();
        for (Person c : childeren) {
            for (Person child : c.getChilderen()) {
                grandChildren.add(child);
            }
        }
        return grandChildren;
    }

    // Poging op een andere mogelijkheid dit te implementeren. Geen succes.
    public void getGrandChildren(Person person, Person child) {
        ArrayList<Person> grandChildren = new ArrayList<>();
        if (person.getChilderen() != null) {

        }

    }

    // ----------- Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public ArrayList<Person> getChilderen() {
        return childeren;
    }

    public void setChilderen(ArrayList<Person> childeren) {
        this.childeren = childeren;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
}
