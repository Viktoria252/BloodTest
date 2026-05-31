package edu.rutmiit.demo.booksapicontract.dto;

import edu.rutmiit.demo.booksapicontract.validation.ValidNumber;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

@Schema(description = "Запрос на создание записи анализа")
public record BloodTestRequest(
        @Schema(description = "ФИО пациента", example = "Иванов Иван Иванович", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank(message = "ФИО не может быть пустым")
        @Size(max = 70, message = "Название не может превышать 70 символов")
        String fullName,

        @Schema(description = "Номер заявки", example = "100-023-4567", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank(message = "Номер заявки не может быть пустым")
        @ValidNumber
        String number,

        @Schema(description = "Пол", example = "М", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank(message = "Пол не может быть пустым")
        String gender,

        @Schema(description = "Гемоглобин", example = "140", requiredMode = Schema.RequiredMode.REQUIRED)
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer gemoglobin,

        @Schema(description = "Эритроциты", example = "5.00", requiredMode = Schema.RequiredMode.REQUIRED)
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer eritrozit,

        @Schema(description = "Тромбоциты", example = "180", requiredMode = Schema.RequiredMode.REQUIRED)
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer trombozit,

        @Schema(description = "Лейкоциты", example = "4.0", requiredMode = Schema.RequiredMode.REQUIRED)
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer leikozit,

        @Schema(description = "Палочкоядерные", example = "4.0", requiredMode = Schema.RequiredMode.REQUIRED)
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer palochloyader,

        @Schema(description = "Сегментоядерные", example = "4.0", requiredMode = Schema.RequiredMode.REQUIRED)
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer segmentoyader,

        @Schema(description = "Базофилы", example = "4.0", requiredMode = Schema.RequiredMode.REQUIRED)
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer bazophil,

        @Schema(description = "Лимфоциты", example = "4.0", requiredMode = Schema.RequiredMode.REQUIRED)
        @Min(value = 1, message = "Показатель должен быть положительным")
        @Max(value = 999, message = "Укажите корректный показатель")
        Integer limphozit
) {}