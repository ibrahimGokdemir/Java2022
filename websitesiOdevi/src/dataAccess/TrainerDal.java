package dataAccess;

import entities.Trainer;

public interface TrainerDal {
	void add(Trainer trainer);
	void delete(Trainer trainer);
	void update(Trainer trainer);

}
