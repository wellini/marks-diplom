package org.example.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Category {
    SHOES("Тяги", -100, 100),
    JACKET("Курточка", -10, 15),
    T_SHIRT("Футболочка", 15, 100),
    SHIRT("рубашечька", -30, 100),
    SWEATER("Свитр", 12, 23),
    TROUSERS("Штанули", -14, 5),
    JEANS("Жинцы", -10, 20),
    SOCK("Носочки", -100, 100);


    private final String nameRU_ru;
    private final int minTemperature;
    private final int maxTemperature;

    public boolean matchesTemperature(int t) {
        return t < maxTemperature && t > minTemperature;
    }
}
