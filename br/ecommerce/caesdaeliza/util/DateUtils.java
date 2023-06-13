package br.ecommerce.caesdaeliza.util;

import java.time.LocalDate;
import java.time.Period;

public class DateUtils {

    public static LocalDate CreateDateToNextDays(int amount) {
        assert (amount >= 0);
        return LocalDate.now().plusDays(amount);
    }

    public static boolean HasExpiredDate(LocalDate date) {
        if(Period.between(LocalDate.now(), date).isZero() || Period.between(LocalDate.now(), date).isNegative()){
            return true;
        } else {
            return false;
        }
    }
}
