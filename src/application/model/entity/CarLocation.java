package application.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "CAR_LOCATION")
public class CarLocation extends Base {
    @Column(name="COUNTRY", nullable = false)
    private String country;
    @Column(name="CITY", nullable = false)
    private String city;
    @Column(name="STREET", nullable = false)
    private String street;
    @Column(name="REGION", nullable = false)
    private String region;
    @Column(name="ZIP", nullable = false)
    private String zip;

}
