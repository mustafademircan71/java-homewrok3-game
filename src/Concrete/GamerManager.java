package Concrete;

import Abstract.GamerService;
import Abstract.Logger;
import Entity.Gamer;


public class GamerManager implements GamerService {
	private Logger logger;
	
	public GamerManager(Logger logger) {
		this.logger=logger;
	}
	
	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adlý oyuncu kayýt yaptý.");
		logger.log(gamer.getFirstName()+" "+gamer.getLastName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adlý oyuncu silindi");
		logger.log(gamer.getFirstName()+" "+gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adlý oyuncu güncellendi");
		logger.log(gamer.getFirstName()+" "+gamer.getLastName());
	}

}
