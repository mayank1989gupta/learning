package com.supplier.consumer.sample;

import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LocalDatePasswordExpiration {

    public static void main(String args[]) {
        LocalDate passwordSetOnDate = LocalDate.of(2019,10,1);
        long passwordExpirationDays = 30; //Password Expiration Days
        LocalDate currentDate = LocalDate.now(); // cuurent date

        Supplier<LocalDate> passwordExpirationDateSupplier = () -> {
          return passwordSetOnDate.plusDays(passwordExpirationDays);
        };

        if(currentDate.isAfter(passwordExpirationDateSupplier.get())) System.out.println("Password Expired");
        else System.out.println("Password is valid");
    }
}
