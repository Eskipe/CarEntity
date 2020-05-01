package application.model.entity;

import application.model.entity.converter.ConverterFuel;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "CAR")
public class CarEntity extends Base {

	@Column(name="MAKE", nullable = false)
	private String make;
	@Column(name="MODEL", nullable = false)
	private String model;
	@Column(name="YEARS", nullable = false)
	private Integer year;
	@Column(name="ENGINE", nullable = false)
	private Double engine;
	@Column(name="FUEL")
	@Convert(converter = ConverterFuel.class)
	private Fuel fuel;
	@Column(name="TRANSMISSION", nullable = false)
	private String transmission;
	@Column(name="WEEL_DRIVE", nullable = false)
	private String weelDrive;
	@Column(name="HORSE_POWER", nullable = false)
	private Integer horsePower;
	@Column(name="TORQUE", nullable = false)
	private Integer torque;
	@Column(name="DOORS", nullable = false)
	private Integer doors;
	@Column(name="SEATS", nullable = false)
	private Integer seats;
	@Column(name="CAR_BODY_TYPE", nullable = false)
	private String carBodyType;
	@Column(name="FUEL_CONSUMPTION", nullable = false)
	private String fuelConsumption;
	


}
