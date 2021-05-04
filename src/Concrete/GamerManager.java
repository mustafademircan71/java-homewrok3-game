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
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adl� oyuncu kay�t yapt�.");
		logger.log(gamer.getFirstName()+" "+gamer.getLastName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adl� oyuncu silindi");
		logger.log(gamer.getFirstName()+" "+gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adl� oyuncu g�ncellendi");
		logger.log(gamer.getFirstName()+" "+gamer.getLastName());
	}

}
