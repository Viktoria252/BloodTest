package edu.rutmiit.demo.booksapicontract.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

/**
 * Проверяет, что строка является корректным номером заявки.
 */
public class NumberValidator implements ConstraintValidator<ValidNumber, String> {

    private static final Pattern NUMBER = Pattern.compile("^\\d{9}$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // null и пустую строку пропускаем — за них отвечает @NotBlank
        if (value == null || value.isBlank()) {
            return true;
        }
        // Убираем дефисы и пробелы перед проверкой
        String cleaned = value.replaceAll("[\\s\\-]", "");
        return NUMBER.matcher(cleaned).matches();
    }
}
