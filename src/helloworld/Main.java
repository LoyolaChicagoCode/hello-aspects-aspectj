package helloworld;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Hello bean = new HelloWorld();
    bean.setMessage("Hola Mundo");
    System.out.println(bean.getMessage());
    System.out.println(bean.getOne());
    ArrayList<String> l = new ArrayList<String>();
    l.add("hello");
    l.add("world");
    System.out.println(l.get(0));
  }
}
