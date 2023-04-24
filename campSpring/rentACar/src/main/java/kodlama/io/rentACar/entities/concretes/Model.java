package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "models")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Model {
	
	@Id // @Id ile primary key olduğunu belirttik.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @GeneratedValue ile primary key'in otomatik artacağını belirttik.
    @Column(name = "id") // @Column ile de kolonun adını belirttik.
    private int id;

    @Column(name = "name")
    private String name;
    
    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;
    
    @OneToMany(mappedBy = "model")
 	private List<Car> cars;

}
