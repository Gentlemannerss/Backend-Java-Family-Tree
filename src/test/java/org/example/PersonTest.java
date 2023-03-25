package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person grandFather;
    Person grandMother;
    Person sister;
    Person brother;
    Person father;
    Person mother;
    Person child;
    Pet dog;
    Pet bird;

    @BeforeEach
    void beforeAllTests() {
        father = new Person("Damon", "Antonius Hendrikus", "van Bergen", 'm', 27);
        child = new Person("Jelmer", "Agricola", 'm', 12);
        mother = new Person("Nisha", "Lamichhane", 'v', 29);
        dog = new Pet("olly", 3, "Jack-Russel", father);
    }

    @Test
    void addParents() {
        // Arrange

        // Act
        child.addParents(child, mother, father);
        // Assert
        assertEquals("Damon", child.getFather().getName());
        assertEquals("Nisha", child.getMother().getName());
    }

    @Test
    void addPet() {
        // Arrange

        // Act
        father.addPet(father, dog);
        // Assert
        assertEquals("olly", father.getPets().get(0).getName());
    }

    @Test
    void addSibling() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void AddChildToChilderen() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void getGrandChilderen() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void getName() { // Je getters & Setters hoef je vaak niet te testen, je methods & classes wel.
        // Arrange (klaarzetten van informatie)
        Person person = new Person("Nick", "de Kok", 'm', 32);
        // Act (uitvoeren van de actie)
        String name = person.getName();
        // Assert (testen of er gebeurt met de daadwerkelijke uitkomst)
        assertEquals("Nick", name);
    }

    @Test
    void setName() {
    }

    @Test
    void getMiddleName() {
    }

    @Test
    void setMiddleName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void getSex() {
    }

    @Test
    void setSex() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getMother() {
    }

    @Test
    void setMother() {
    }

    @Test
    void getFather() {
    }

    @Test
    void setFather() {
    }

    @Test
    void getSiblings() {
    }

    @Test
    void setSiblings() {
    }

    @Test
    void getChilderen() {
    }

    @Test
    void setChilderen() {
    }

    @Test
    void getPets() {
    }

    @Test
    void setPets() {
    }
}