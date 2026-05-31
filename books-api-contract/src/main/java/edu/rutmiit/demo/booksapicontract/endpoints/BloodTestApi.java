package edu.rutmiit.demo.booksapicontract.endpoints;

import edu.rutmiit.demo.booksapicontract.config.BloodTestApiContractConfig;
import edu.rutmiit.demo.booksapicontract.dto.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Tag(name = "BloodTest", description = "Управление анализами крови")
@RequestMapping(
        value = "/api/bloodtests",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public interface BloodTestApi {
    @Operation(
            summary = "Получить анализ по ID",
            security = @SecurityRequirement(name = BloodTestApiContractConfig.SECURITY_SCHEME_BEARER)
    )
    @ApiResponse(responseCode = "200", description = "Анализ найден")
    @ApiResponse(responseCode = "404", description = "Анализ не найден",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    @GetMapping("/{id}")
    EntityModel<BloodTestResponse> getBloodTestById(
            @Parameter(description = "ID анализа", required = true, example = "1") @PathVariable Long id
    );

    @Operation(
            summary = "Список анализов",
            description = """
                    Возвращает постраничный список анализов с HATEOAS-ссылками.
                    Поддерживает комбинирование фильтров: authorId, genre, publishedYear и titleSearch
                    можно передавать одновременно.
                    """,
            security = @SecurityRequirement(name = BloodTestApiContractConfig.SECURITY_SCHEME_BEARER)
    )
    @ApiResponse(responseCode = "200", description = "Постраничный список анализов")
    @GetMapping
    PagedModel<EntityModel<BloodTestResponse>> getAllBloodTests(
            @Parameter(description = "Фильтр по ФИО", example = "Иванов Иван Иванович") @RequestParam(required = false)
            String fullName,
            @Parameter(description = "Фильтр по полу", example = "М") @RequestParam(required = false) String gender,
            @Parameter(description = "Номер страницы (0..N)", example = "0") @RequestParam(defaultValue = "0") int page,
            @Parameter(description = "Размер страницы", example = "20") @RequestParam(defaultValue = "20") int size
    );

    @Operation(
            summary = "Создать анализ",
            security = @SecurityRequirement(name = BloodTestApiContractConfig.SECURITY_SCHEME_BEARER)
    )
    @ApiResponse(responseCode = "201", description = "Анализ создан. Location header содержит URI нового ресурса.")
    @ApiResponse(responseCode = "400", description = "Ошибка валидации",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    @ApiResponse(responseCode = "409", description = "Анализ с таким номером уже существует",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<EntityModel<BloodTestResponse>> createBloodTest(@Valid @RequestBody BloodTestRequest request);

    @Operation(
            summary = "Полное обновление анализа (PUT)",
            description = "Заменяет все поля книги. Автора изменить нельзя. "
                    + "Для обновления отдельных полей используйте PATCH.",
            security = @SecurityRequirement(name = BloodTestApiContractConfig.SECURITY_SCHEME_BEARER)
    )
    @ApiResponse(responseCode = "200", description = "Анализ обновлен")
    @ApiResponse(responseCode = "400", description = "Ошибка валидации",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    @ApiResponse(responseCode = "404", description = "Анализ не найден",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    @ApiResponse(responseCode = "409", description = "Анализ с таким номером уже существует",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    EntityModel<BloodTestResponse> updateBloodTest(
            @Parameter(description = "ID анализа", required = true, example = "1") @PathVariable Long id,
            @Valid @RequestBody UpdateBloodTestRequest request
    );

    @Operation(
            summary = "Частичное обновление анализа (PATCH)",
            description = """
                    Обновляет только переданные поля (семантика JSON Merge Patch, RFC 7396).
                    Непереданные поля остаются без изменений. Автора книги изменить нельзя.
                    """,
            security = @SecurityRequirement(name = BloodTestApiContractConfig.SECURITY_SCHEME_BEARER)
    )
    @ApiResponse(responseCode = "200", description = "Анализ обновлен")
    @ApiResponse(responseCode = "400", description = "Ошибка валидации",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    @ApiResponse(responseCode = "404", description = "Анализ не найден",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    @ApiResponse(responseCode = "409", description = "Анализ с таким номером уже существует",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    @PatchMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    EntityModel<BloodTestResponse> patchBloodTest(
            @Parameter(description = "ID анализа", required = true, example = "1") @PathVariable Long id,
            @Valid @RequestBody PatchBloodTestRequest request
    );

    @Operation(
            summary = "Удалить анализ",
            security = @SecurityRequirement(name = BloodTestApiContractConfig.SECURITY_SCHEME_BEARER)
    )
    @ApiResponse(responseCode = "204", description = "Анализ удален")
    @ApiResponse(responseCode = "404", description = "Анализ не найден",
            content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    BloodTestResponse deleteBloodTest(
            @Parameter(description = "ID анализа", required = true, example = "1") @PathVariable Long id
    );
}
