package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        grandFather = new Person("Henry", "van Bergen", 'm', 52);
        grandMother = new Person("Anja", "van Bergen", 'v', 52);
        father = new Person("Damon", "Anton Henk", "van Bergen", 'm', 27);
        mother = new Person("Esmee", "van Bergen", 'v', 29);
        sister = new Person("Indy", "van Bergen", 'v', 25);
        brother = new Person("Gary", "Ketchum", 'm', 22);
        child = new Person("Ash", "Agricola", 'm', 12);
        dog = new Pet("Olly", 3, "Jack-Russel", father);
        bird = new Pet("Nero", 2, "Valkparkiet", father);
    }

    @Test
    void addParents() {
        // Arrange

        // Act
        child.addParents(child, mother, father);
        // Assert
        assertEquals("Damon", child.getFather().getName());
        assertEquals("Esmee", child.getMother().getName());
    }

    @Test
    void addPet() {
        // Arrange // staat in before-each

        // Act
        father.addPet(father, dog);
        // Assert
        assertEquals("Olly", father.getPets().get(0).getName());
    }

    @Test
    void addSibling() {
        // Arrange // staat in before-each

        // Act --- hier moet er getest worden of er een broer of zus is van een persoon.
        father.addSibling(father, sister);
        // Assert
        assertEquals("Indy", father.getSiblings().get(0).getName());
    }

    @Test
    void AddChildToChilderen() {
        // Arrange

        // Act
        father.addParents(child, mother, father);
        // Assert
        assertEquals("Ash", father.getChilderen().get(0).getName());
    }

    @Test
    void getGrandChilderen() {
        // Arrange

        // Act
        father.addParents(father, grandMother, grandFather);
        child.addParents(child, father, mother);
        grandMother.getGrandChilderen();
        // Assert
        assertEquals("Ash", grandMother.getGrandChilderen().get(0).getName());
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
        // Arrange

        // Act
        father.setName("Demon");
        // Assert
        assertEquals("Demon", father.getName());
    }

    @Test
    void getMiddleName() {
        // Arrange

        // Act
        String middleName = father.getMiddleName();
        // Assert
        assertEquals("Anton Henk", middleName);
    }

    @Test
    void setMiddleName() {
        // Arrange

        // Act
        father.setMiddleName("Maria Petronella");
        // Assert
        assertEquals("Maria Petronella", father.getMiddleName());
    }

    @Test
    void getLastName() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void setLastName() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void getSex() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void setSex() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void getAge() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void setAge() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void getMother() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void setMother() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void getFather() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void setFather() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void getSiblings() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void setSiblings() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void getChilderen() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void setChilderen() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void getPets() {
        // Arrange

        // Act

        // Assert
    }

    @Test
    void setPets() {
        // Arrange

        // Act

        // Assert
    }
}