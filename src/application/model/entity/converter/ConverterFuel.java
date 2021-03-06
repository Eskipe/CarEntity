package application.model.entity.converter;

import application.model.entity.Fuel;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ConverterFuel implements AttributeConverter<Fuel,Integer> {
    @Override
    public Integer convertToDatabaseColumn(Fuel fuel) {
        return fuel.getId();
    }

    @Override
    public Fuel convertToEntityAttribute(Integer integer) {
        return Fuel.getById(integer);
    }
}
