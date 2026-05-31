package edu.rutmiit.demo.booksapicontract.exception;

public class NumberAlreadyExistsException extends RuntimeException {
    public NumberAlreadyExistsException(String number) {
        super("Blood test with number=" + number + " already exists");
    }
}