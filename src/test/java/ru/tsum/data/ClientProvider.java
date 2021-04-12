package ru.tsum.data;

import java.util.Random;

public abstract class ClientProvider {

    public static ClientData registeredClient() {
        return new ClientData("tsum@mail.com", "qwerty123");
    }

    public static ClientData generateClient() {
        Random rand = new Random();
        return new ClientData("test" + rand.nextInt(10000) + "@mail.com", "qwerty123");
    }

}
