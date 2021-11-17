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

    public void signUp(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("^[A-Za-z0-9]+$") || login.length() > 20 || login.length() < 5)
                throw new WrongLoginException("Login is not right");
            this.setLogin(login);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }
        try {
            if (!password.matches("^[A-Za-z0-9_]+$") || password.length() < 5 || !password.equals(confirmPassword))
                throw new WrongPasswordException("Password is not right");
            this.setPassword(password);
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }
//    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
//        if(!login.matches("^[A-Za-z0-9]+$") || login.length()>20 || login.length()<5){
//            throw new WrongLoginException("Login is not right");
//        } else{
//            this.setLogin(login);
//        }
//        if(!password.matches("^[A-Za-z0-9_]+$") || password.length()<5 || !password.equals(confirmPassword)){
//            throw new WrongPasswordException("Password is not right");
//        } else{
//            this.setPassword(password);
//        }
//    }

    public void signIn(String login, String password) {
        try {
            if (!login.equals(this.getLogin()))
                throw new WrongLoginException("Login is not right");
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }
        try {
            if (!password.equals(this.getPassword()))
                throw new WrongPasswordException("Password is not right");
            this.setPassword(password);
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }
//    public void signIn(String login, String password) throws WrongLoginException, WrongPasswordException {
//        if (!login.equals(this.getLogin())) {
//            throw new WrongLoginException("Login is not right");
//        } else if (!password.equals(this.getPassword())) {
//            throw new WrongPasswordException("Password is not right");
//        } else {
//            System.out.println("All user data is right");
//        }
//    }
}
