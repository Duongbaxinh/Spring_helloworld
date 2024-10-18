package controller;

public class Greeting {
    private String text;
    public Greeting(String text){
        this.text = text;
    }
    public void greeting(){
        System.out.println(text);
    }
    public  void welcome(String yourName){
        System.out.println("Welcome "+yourName);
    }
}
