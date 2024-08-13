package com.project.reactor.introduction_project_reactor;

import reactor.core.publisher.Mono;

public class Ejemplo02 {

    public static void main(String[] args) {
        
           /* Mono.just:::El valor que se va a emitir ya está disponible 
           en el momento en que se crea el Mono. No hay ninguna lógica diferida; */
           Mono<String> mono = Mono.just("Hola");
           mono.subscribe(
                data-> System.out.println(data), //onNext
                err-> System.out.println(err),   //onError
                () -> System.out.println("Completo!!") //oncomplet
           );
    }
}
