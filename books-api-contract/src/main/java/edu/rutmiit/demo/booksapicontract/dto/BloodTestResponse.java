package edu.rutmiit.demo.booksapicontract.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.time.LocalDateTime;

@Getter
@Builder
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(collectionRelation = "bloodtest", itemRelation = "bloodtest")
@Schema(description = "Информация об анализе")
public class BloodTestResponse extends RepresentationModel<BloodTestResponse>{
    @Schema(description = "Уникальный идентификатор анализа", example = "1")
    private final Long id;

    @Schema(description = "ФИО пациента", example = "Иванов Иван Иванович")
    private final String fullName;

    @Schema(description = "Номер заявки", example = "100-023-4567")
    private final String number;

    @Schema(description = "Пол")
    private final String gender;

    @Schema(description = "Гемоглобин", example = "140")
    private final Integer gemoglobin;

    @Schema(description = "Эритроциты", example = "5.0")
    private final Integer eritrozit;

    @Schema(description = "Тромбоциты", example = "180")
    private final Integer trombozit;

    @Schema(description = "Лейкоциты", example = "4.0")
    private final Integer leikozit;

    @Schema(description = "Палочкоядерные", example = "4.0")
    private final Integer palochloyader;

    @Schema(description = "Сегментоядерные", example = "4.0")
    private final Integer segmentoyader;

    @Schema(description = "Базофилы", example = "4.0")
    private final Integer bazophil;

    @Schema(description = "Лимфоциты", example = "4.0")
    private final Integer limphozit;

    @Schema(description = "Момент создания записи")
    private final LocalDateTime createdAt;

    @Schema(description = "Момент последнего обновления записи")
    private final LocalDateTime updatedAt;
}
