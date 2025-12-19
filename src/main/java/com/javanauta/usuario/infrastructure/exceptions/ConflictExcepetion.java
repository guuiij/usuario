package com.javanauta.usuario.infrastructure.exceptions;

public class ConflictExcepetion extends RuntimeException{
    public  ConflictExcepetion(String mensagem){
        super(mensagem);
    }

    public  ConflictExcepetion(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
