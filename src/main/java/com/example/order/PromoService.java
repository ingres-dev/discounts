package com.example.order;

import java.time.LocalDate;

public class PromoService {
    private LocalDate promoStart = localDate.of( 12, 1);
    private LocalDate promoEnd = localDate.of( 12, 31);

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
