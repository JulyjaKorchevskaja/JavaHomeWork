package com.pb.korchevskaja.hw8;


public class Auth {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void signUp(String login, String password, String confirmPassword) {
//        try {
//            if (!login.matches("^[A-Za-z0-9]+$") || login.length() > 20 || login.length() < 5)
//                throw new WrongLoginException("Login is not right");
//            this.setLogin(login);
//        } catch (WrongLoginException e) {
//            e.printStackTrace();
//        }
//        try {
//            if (!password.matches("^[A-Za-z0-9_]+$") || password.length() < 5 || !password.equals(confirmPassword))
//                throw new WrongPasswordException("Password is not right");
//            this.setPassword(password);
//        } catch (WrongPasswordException e) {
//            e.printStackTrace();
//        }
//    }
    public int signUp(String login, String password, String confirmPassword){
        if(!login.matches("^[A-Za-z0-9]+$") || login.length()>20 || login.length()<5){
            return 1;
        } else if(!password.matches("^[A-Za-z0-9_]+$") || password.length()<5 || !password.equals(confirmPassword)){
            return 2;
        }else{
            this.setLogin(login);
            this.setPassword(password);
            return 3;
        }
    }

//    public void signIn(String login, String password) {
//        try {
//            if (!login.equals(this.getLogin()))
//                throw new WrongLoginException("Login is not right");
//        } catch (WrongLoginException e) {
//            e.printStackTrace();
//        }
//        try {
//            if (!password.equals(this.getPassword()))
//                throw new WrongPasswordException("Password is not right");
//            this.setPassword(password);
//        } catch (WrongPasswordException e) {
//            e.printStackTrace();
//        }
//    }
    public int signIn(String login, String password){
        if (!login.equals(this.getLogin())) {
            return 1;
        } else if (!password.equals(this.getPassword())) {
            return 2;
        } else {
            return 3;
        }
    }
}
