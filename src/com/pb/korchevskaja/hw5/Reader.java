package com.pb.korchevskaja.hw5;

public class Reader {
    //    String fullName;
//    int cardNumber;
//    String faculty;
//    int dateBirth;
//    int telephone;
    protected String user;
    protected int libraryCardNum;
    protected String faculty;
    protected String birthday;
    protected String phone;

    public Reader(String user, int libraryCardNum, String faculty, String birthday, String phone) {
        this.user = user;
        this.libraryCardNum = libraryCardNum;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String getUser() {
        return this.user;
    }

    public int getLibraryCardNum() {
        return this.libraryCardNum;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setLibraryCardNum(int libraryCardNum) {
        this.libraryCardNum = libraryCardNum;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    String getInfo() {
        return "ФИО: " + user +", номер читательского билета: "+ libraryCardNum +", факультет: "+ faculty +", дата рождения: "+ birthday +", телефон: "+ phone;
    }

    public void takeBook(int count) {
        System.out.println(user + " взял "+ count +" книги");
    }
    public void takeBook(String... bookName) {
        String allBook = "";
        for(String books: bookName){
            allBook += books+", ";
        }
        System.out.println(user + " взял "+" книги: " + allBook);
    }
    public void takeBook(Book... books){
        String allBooks = "";
        for(Book book: books){
            allBooks += book.getInfo()+", ";
        }
        System.out.println(user + " взял "+" книги: " + allBooks);
    }

    public void returnBook(int count) {
        System.out.println(user + " вернул "+ count +" книги");
    }
    public void returnBook(String... bookName) {
        String allBook = "";
        for(String books: bookName){
            allBook += books+", ";
        }
        System.out.println(user + " вернул "+" книги: " + allBook);
    }
    public void returnBook(Book... books){
        String allBooks = "";
        for(Book book: books){
            allBooks += book.getInfo()+", ";
        }
        System.out.println(user + " вернул "+" книги: " + allBooks);
    }

}
