package org.sopthapse.www.HapseProject.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class PaymentService {

    public String getDeliveryDate() {
        LocalDate deliveryDate = LocalDate.now().plusDays(3);
        return deliveryDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }
}