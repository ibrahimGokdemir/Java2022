package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
	 	@Id // @Id ile primary key olduğunu belirttik.
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // @GeneratedValue ile primary key'in otomatik artacağını belirttik.
	    @Column(name = "id") // @Column ile de kolonun adını belirttik.
	    private int id;
	 	
	 	@Column(name="plate")
	 	private String plate;
	 	
	 	@Column(name="modelYear")
	 	private int modelYear;
	 	
	 	@Column(name="dailyPrice")
	 	private double dailyPrice;
	 	
	 	@Column(name="state")
	 	private int state;
	 	
	 	@ManyToOne
	    @JoinColumn(name="model_id")
	    private Model model;
	 	
	 	

}
