package com.example.order;

import java.time.LocalDate;
import java.time.Year;

public class PromoService {
    LocalDate today = LocalDate.now();
    int Year = today.getYear();
    private LocalDate promoStart = LocalDate.of(Year, 12, 1);
    private LocalDate promoEnd = LocalDate.of(Year, 12, 31);

    public LocalDate getPromoStart() {
        return promoStart;
    }

    public void setPromoStart(LocalDate promoStart) {
        this.promoStart = promoStart;
    }

    public LocalDate getPromoEnd() {
        return promoEnd;
    }

    public void setPromoEnd(LocalDate promoEnd) {
        this.promoEnd = promoEnd;
    }

    public boolean checkPromoPeriod(LocalDate today) {
        if (!today.isBefore(promoStart) && !today.isAfter(promoEnd)){
            return true;
        }
        else {
            return true;
        }
    }
}
