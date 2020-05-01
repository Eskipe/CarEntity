package application.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Fuel {
    BENZIN(1),
    ELECTRO_CAR(2),
    DIZEL(3);
    private Integer id;

    public static Fuel getById(Integer id) {
        return Arrays.stream(values())
                .filter(fuel -> fuel.getId().equals(id))
                .findFirst().get();
    }
}
