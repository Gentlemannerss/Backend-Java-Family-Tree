package org.example;

public class Pet {
    String name;
    int age;
    String species;
    Person owner;

    // ------------- Constructor
    public Pet(String name, int age, String species, Person owner) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.owner = owner;
    }

    // --------------- Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
