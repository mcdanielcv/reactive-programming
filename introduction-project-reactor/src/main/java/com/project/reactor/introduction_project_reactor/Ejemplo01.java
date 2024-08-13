package com.project.reactor.introduction_project_reactor;

import java.util.ArrayList;
import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Ejemplo01 {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        List<Integer> elementFromMono = new ArrayList<>();
        List<Integer> elementFromFlux = new ArrayList<>();
        //crear mono
        Mono<Integer> mono = Mono.just(121);


        //crear flux
        Flux<Integer> flux = Flux.just(121,25,84,36,8);

        //nos suscribimos mono
        mono.subscribe(elementFromMono::add);

        //nos suscribimos flux
        flux.subscribe(elementFromFlux::add);

        //imprimir resultado
        System.out.println(elementFromMono);
        System.out.println(elementFromFlux);
        
    }
}
