package edu.rutmiit.demo.booksapicontract.dto;

import edu.rutmiit.demo.booksapicontract.validation.ValidNumber;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "Частичное обновление анализа (PATCH). Передайте только те поля, которые нужно изменить.")
public record PatchBloodTestRequest(
        @Schema(description = "ФИО пациента", example = "Иванов Иван Иванович")
        @NotBlank(message = "ФИО не может быть пустым")
        @Size(max = 70, message = "Название не может превышать 70 символов")
        String fullName,

        @Schema(description = "Номер заявки", example = "100023456")
        @NotBlank(message = "Номер заявки не может быть пустым")
        @ValidNumber
        String number,

        @Schema(description = "Пол пациента", example = "М")
        @NotBlank(message = "Пол пациента не может быть пустым")
        String gender,

        @Schema(description = "Гемоглобин", example = "140")
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
) {}