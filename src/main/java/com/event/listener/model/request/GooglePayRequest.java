package com.event.listener.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GooglePayRequest{

    @NotNull(message = "User name is mandatory.")
    private String name;
    private double amount;
    private boolean condition;
    private long accountNumber;
}
