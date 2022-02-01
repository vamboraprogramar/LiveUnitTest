package br.com.vamboraprogramar.liveunittest.exceptions;

public class RequiredFieldException extends RuntimeException {

    public RequiredFieldException(String message){
        super(message);
    }
}
