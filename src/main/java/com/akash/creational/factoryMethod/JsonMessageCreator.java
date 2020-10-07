package com.akash.creational.factoryMethod;

public class JsonMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
