package ro.teamnet.hello2;

import ro.teamnet.hello.HelloWorld;

/**
 * Created by Taranu on 22/04/15.
 */
public class HelloWorldExtend {

    public HelloWorldExtend() {
    }

    public static void main(String[] args) {
        new HelloWorldExtend().extendSayHello();
    }
    public void extendSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
        System.out.println("The new Hello World");
    }

}