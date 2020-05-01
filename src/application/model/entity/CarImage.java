package application.model.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "CarImage")
public class CarImage extends Base {
    @ManyToOne
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID", nullable = false)
private CarEntity carEntity;
    @Column(name = "IMAGE", nullable = false)
    private byte[] image;


}
