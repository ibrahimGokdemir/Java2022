package kodlama.io.rentACar.entities.concretes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;

@Table(name = "brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
    @Id // @Id ile primary key olduğunu belirttik.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @GeneratedValue ile primary key'in otomatik artacağını belirttik.
    @Column(name = "id") // @Column ile de kolonun adını belirttik.
    private int id;

    @Column(name = "name")
    private String name;
    
    @OneToMany(mappedBy = "brand")
    private List<Model> models;

}

// Entites klasörü altında concretes klasörü oluşturuldu.
// Entities bizim nesnelerimizdir. Bu nesnelerin özelliklerini tutar.