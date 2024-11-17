package com.karan.messaging_ser.configuration;

@FunctionalInterface
public interface MyFunction <I , R>{
    R apply(I input);
}
