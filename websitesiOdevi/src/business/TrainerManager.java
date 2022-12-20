package business;

import java.util.List;
import dataAccess.TrainerDal;
import entities.Trainer;
import logging.Logger;

public class TrainerManager {
	
	private TrainerDal trainerDal;
	private Trainer trainer;
	List<Logger> loggers;
	
	public TrainerManager(TrainerDal trainerDal, Trainer trainer, List<Logger> loggers) {
		this.trainerDal = trainerDal;
		this.trainer = trainer;
		this.loggers = loggers;
	}
	
	
	public void add(Trainer trainer) {
		
		trainerDal.add(trainer);
		String trainerName=trainer.getFirstName()+" "+trainer.getLastName();
		for(Logger logger:loggers) {
			
			logger.getData(trainerName);
			
		}
		
	}
	
	
}
