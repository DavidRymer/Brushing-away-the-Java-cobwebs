package com.qa.people.exercise;

import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void listPeople() {
        for (Person person: people) {
            System.out.println(person.toString());
        }
    }

    public void searchByName(String name) {

        for (Person person: people) {
            if (person.getName().equals(name)){
                System.out.println(person.toString());
            }
        }

    }

}

