package com.karan.messaging_ser.configuration;

import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

@Configuration
public class WebFunctions {

    public Consumer<Integer> fun1(){
        return new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        };
    }

    public Function<List<Object>,Integer> fun2(){
        return new Function<List<Object>, Integer>() {
            @Override
            public Integer apply(List<Object> objects) {
                return 0;
            }
        };
    }

}
