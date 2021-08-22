package com.greetinAppModel;

public class GreetingModel {
	private final long id;
    private final String message;

    public GreetingModel(long id, String message) {
        this.id = id;
        this.message = message;
}
    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}