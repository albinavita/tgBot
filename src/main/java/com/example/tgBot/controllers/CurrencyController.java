package com.example.tgBot.controllers;

import com.example.tgBot.dto.ValuteCursOnDate;
import com.example.tgBot.service.CentralRussianBankService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyController {
    private final CentralRussianBankService centralRussianBankService;
    @Operation(
            summary = "Получение курса валют",
            description = "Запрашивает курсы валют у центрального банка и возвращает список")
    @PostMapping("/getCurrencies")
    //@ApiOperation(value = "Получение курса всех валют на текущий день")
    public List<ValuteCursOnDate> getValuteCursOnDate() throws Exception {
        return centralRussianBankService.getCurrenciesFromCbr();
    }
    @PostMapping("/getCurrency/{code}")
    //@ApiOperation(value = "Получение курса определенно валюты на текущий день")
    @Operation(summary = "Получение курса определенно валюты на текущий день")
    public ValuteCursOnDate getCourseForCurrency(@PathVariable String code) throws Exception {
        return centralRussianBankService.getCourseForCurrency(code);
    }
}
