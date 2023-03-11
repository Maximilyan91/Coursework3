package com.socks.coursework3.controller;

import com.socks.coursework3.model.Color;
import com.socks.coursework3.model.Size;
import com.socks.coursework3.model.SocksBatch;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/socks")
@Tag(name = "API для учета носков", description = "Регистрация прихода, отпуск со склада, списание брака, подсчет количества")
public class SocksStoreController {
    @PostMapping
    @Operation(summary = "Регистрирует приход товара на склад")
    @ApiResponse(responseCode = "200", description = "Операция успешна")
    @ApiResponse(responseCode = "400", description = "Параметры запроса отсутствуют или имеют некорректный формат")
    @ApiResponse(responseCode = "500", description = "Произошла ошибка, не зависящая от вызывающей стороны")
    public ResponseEntity<Void> accept(@RequestBody SocksBatch socksBatch) {

    }

    @PutMapping
    @Operation(summary = "Регистрирует отпуск носков со склада")
    @ApiResponse(responseCode = "200", description = "Удалось произвести отпуск носков со склада")
    @ApiResponse(responseCode = "400", description = "товара нет на складе в нужном количестве или параметры запроса имеют некорректный формат")
    @ApiResponse(responseCode = "500", description = "Произошла ошибка, не зависящая от вызывающей стороны")
    public ResponseEntity<Void> issuence(@RequestBody SocksBatch socksBatch) {

    }
    @GetMapping
    @Operation(summary = "Возвращает общее количество носков на складе")
    @ApiResponse(responseCode = "200", description = "Запрос выполнен, результат в теле ответа в виде строкового представления целого числа")
    @ApiResponse(responseCode = "400", description = "Параметры запроса отсутствуют или имеют некорректный формат")
    @ApiResponse(responseCode = "500", description = "Произошла ошибка, не зависящая от вызывающей стороны")
    public ResponseEntity<Void> getCount(@RequestParam Color color,
                                         @RequestParam Size size,
                                         @RequestParam int cottonMin,
                                         @RequestParam int cottonMax) {

    }

    @DeleteMapping
    @Operation(summary = "Регистрирует списание испорченных (бракованных) носков")
    @ApiResponse(responseCode = "200", description = "Запрос выполнен, товар списан со склада")
    @ApiResponse(responseCode = "400", description = "Товара нет на складе в нужном количестве или параметры запроса имеют некорректный формат")
    @ApiResponse(responseCode = "500", description = "Произошла ошибка, не зависящая от вызывающей стороны")
    public ResponseEntity<Void> reject(@RequestBody SocksBatch socksBatch) {

    }

}
