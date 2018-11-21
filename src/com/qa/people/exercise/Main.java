package com.qa.people.exercise;

public class Main {

    public static void main(String[] args){
        Room room = new Room();
        Person john = new Person("John Smith", 33, "Plumber");
        Person paul = new Person("Paul Smith", 23, "Accountant");
        Person phil = new Person("Phil Smith", 13, "Student");

        room.addPerson(john);
        room.addPerson(paul);
        room.addPerson(phil);

        room.searchByName("John Smith");
    }


}
