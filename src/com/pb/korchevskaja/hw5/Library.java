package com.pb.korchevskaja.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Приключения", "Иванов И.И.", 2000);
        books[1] = new Book("Словарь", "Сидоров А.В.", 1980);
        books[2] = new Book("Энциклопедия", "Гусев К.В.", 2010);

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Иванов И.И.", 1, "Биология", "1 февраля 1993г.", "0675466413");
        readers[1] = new Reader("Петров П.П", 2, "Физика", "1 марта 1993г.", "0675466414");
        readers[2] = new Reader("Сидоров С.С.", 3, "Математика", "1 апреля 1993г.", "0675466415");

        for (Book book : books) {
            System.out.println(book.getInfo());
        }

        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
        readers[0].takeBook(3);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].takeBook(books[0], books[1], books[2]);

        readers[0].returnBook(books[0], books[1], books[2]);
        readers[1].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].returnBook(3);
    }
}
