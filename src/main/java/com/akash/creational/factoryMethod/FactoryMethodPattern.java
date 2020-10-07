package com.akash.creational.factoryMethod;

/**
 * Real time example of this is AbstractCollection class from rt.jar
 *  iterator() is the abstract method
 *  Pitfall - More complex to use and you might end up subclassing like for Json ..different Json classes
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());
    }
    public static void printMessage(MessageCreator messageCreator){
        messageCreator.getMessage();
    }
}
