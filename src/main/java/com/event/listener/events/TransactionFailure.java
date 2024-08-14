package com.event.listener.events;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionFailure {
    private String name;
    private Double amount;
    private long accountNumber;
}
