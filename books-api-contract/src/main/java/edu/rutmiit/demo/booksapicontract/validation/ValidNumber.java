package edu.rutmiit.demo.booksapicontract.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * Аннотация для валидации номера заявки.
 */
@Documented
@Constraint(validatedBy = NumberValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidNumber {

    String message() default "Некорректный номер заявки. Допустимые форматы: номер заявки (9 цифр)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
