package com.pb.korchevskaja.hw11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class PhoneBook {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

        Map<String, String > phone = new HashMap<>();
        phone.put("Work","123456789");

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jack", LocalDate.of(1993, 4, 15), phone, "Dnipro"));
        persons.add(new Person("Jack", LocalDate.of(2000, 5, 2), phone, "Kiev"));
        persons.add(new Person("Oleg", LocalDate.of(2000, 5, 2), phone, "Zaporizzia"));

        persons.set(0,new Person("Nick", LocalDate.of(1985, 7, 3), phone, "Lviv"));

        persons.remove(0);

        Person oleg = persons.stream()
                .filter(person -> "Oleg".equals(person.getName()))
                .findAny()
                .orElse(null);

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
