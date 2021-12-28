package com.pb.korchevskaja.hw12;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.stream.Stream;

public class PhoneBook {
    @FunctionalInterface
    interface AddPerson {
        Person personData(String name, LocalDate birthday, String typePhone, String numberPhone, String address);
    }



    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);
AddPerson add = (String name, LocalDate birthday, String typePhone, String numberPhone, String address) -> new Person(name, birthday, typePhone, numberPhone, address);

        List<Person> persons = new ArrayList<>();
        Person jack = add.personData("Jack", LocalDate.of(1993, 4, 15),"Work","123456789", "Dnipro");

        Person jackTwo = add.personData("Jack", LocalDate.of(2000, 5, 2),"Work","7643928371", "Kiev");
        Person oleg = add.personData("Oleg", LocalDate.of(2000, 5, 2), "Home","7643928371", "Zaporizzia");

        persons = Stream.of(jack, jackTwo, oleg)
                .collect(Collectors.toList());

        persons.set(0,new Person("Nick", LocalDate.of(1985, 7, 3), "Home", "1654164623", "Lviv"));


        persons.remove(0);


        List<Person> sortedPerson = persons.stream()
                .sorted((o1,o2) -> o1.getName().compareTo(o2.getName()))
                .sorted((o1,o2) -> o1.getAddress().compareTo(o2.getAddress()))
                .collect(Collectors.toList());

        String personsJson = mapper.writeValueAsString(persons);
        File file = Paths.get("files/persons.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(personsJson);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Person> personsForFile = (List<Person>) objectInputStream.readObject();


}
}
