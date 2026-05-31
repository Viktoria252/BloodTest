package edu.rutmiit.demo.booksapicontract.dto;

import edu.rutmiit.demo.booksapicontract.validation.ValidNumber;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

@Schema(description = "Полное обновление записи анализа (PUT). Все обязательные поля должны присутствовать.")
public record UpdateBloodTestRequest (

        @Schema(description = "Номер заявки", example = "100-023-4567", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank(message = "Номер заявки не может быть пустым")
        @ValidNumber
        String number,

        @Schema(description = "Гемоглобин", example = "140", requiredMode = Schema.RequiredMode.REQUIRED)
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer gemoglobin,

        @Schema(description = "Эритроциты", example = "5.00")
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer eritrozit,

        @Schema(description = "Тромбоциты", example = "180")
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer trombozit,

        @Schema(description = "Лейкоциты", example = "4.0")
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer leikozit,

        @Schema(description = "Палочкоядерные", example = "4.0")
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer palochloyader,

        @Schema(description = "Сегментоядерные", example = "4.0")
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer segmentoyader,

        @Schema(description = "Базофилы", example = "4.0")
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer bazophil,

        @Schema(description = "Лимфоциты", example = "4.0")
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer limphozit
){
}
