package br.com.vamboraprogramar.liveunittest.exceptions;

public class InvalidFieldException extends RuntimeException{
    public InvalidFieldException(String message){
        super(message);
    }
}
