package dataAccess.trainerDal;

import dataAccess.TrainerDal;
import entities.Category;
import entities.Trainer;

public class JdbcTrainerDal implements TrainerDal{

	@Override
	public void add(Trainer trainer) {
		System.out.println("JDBC ile database'e eklendi.");
		
	}

	@Override
	public void delete(Trainer trainer) {
		System.out.println("JDBC ile databaseden silindi.");
		
	}

	@Override
	public void update(Trainer trainer) {
		System.out.println("JDBC ile databaseden güncellendi.");
		
	}


}
