package com.project.reactor.introduction_project_reactor;

import reactor.core.publisher.Mono;

public class Ejemplo03 {
    public static void main(String[] args) {

        /*Mono.fromSupplier:::
        Supplier<T> es una interfaz funcional de Java que no recibe argumentos pero devuelve un valor de tipo T
        Para diferir la ejecución de cálculos o tareas ligeras 
        hasta que realmente se necesiten mediante el subscribe. */
        Mono<String> mono = Mono.fromSupplier(
            ()-> {
                throw new RuntimeException("Excepcion invocada");
            });

        mono.subscribe(
               data-> System.out.println(data), //onNext
               err-> System.out.println(err),   //onError
               () -> System.out.println("Completo!!") //oncomplet
        );
    }
}
