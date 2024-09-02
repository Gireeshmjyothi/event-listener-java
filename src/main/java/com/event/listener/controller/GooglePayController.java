package com.event.listener.controller;

import com.event.listener.model.request.GooglePayRequest;
import com.event.listener.publisher.GooglePay;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class GooglePayController {

    private final GooglePay googlePay;

    @PostMapping("/pay")
    public String sendMoney(@Valid @RequestBody GooglePayRequest googlePayRequest){
        return googlePay.sendMoney(googlePayRequest);
    }

}
