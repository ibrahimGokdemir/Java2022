package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	boolean existsByName(String name); //jpa keywords
}


/**
 * Data Access katmanı, veritabanı ile ilgili işlemleri yapar.
 * Abstracts klasörü altında interface oluştururuz.
 * Repository ile veritabanı ile ilgili işlemleri yaparız.
 * Dao ile Repository arasında bir fark yoktur.
 */