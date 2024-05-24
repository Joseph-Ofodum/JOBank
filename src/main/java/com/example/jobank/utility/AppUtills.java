package com.example.jobank.utility;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;


@Component
@RequiredArgsConstructor
@Slf4j
public class AppUtills {

    public String generateUuid(){
        return UUID.randomUUID().toString();
    }

    public static Long generateOtp(){
        Random rnd = new Random();
        Long number =(long)(rnd.nextInt(900000) + 100000);
        return number;
    }

    public String getReference() {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Africa/Lagos")); // Set to Nigeria's time zone
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return now.format(formatter);
    }

}
