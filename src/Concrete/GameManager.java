package Concrete;

import Abstract.GameService;
import Abstract.Logger;
import Entity.Game;

public class GameManager implements GameService{
	private Logger logger;
	
	public GameManager(Logger logger) {
		this.logger=logger;
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ " adlý oyun "+game.getPrice()+ " Tl fiyatla listeye eklendi.");
		logger.log(game.getName());
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ " adlý oyun bilgileri güncellendi");
		logger.log(game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ " adlý oyun silindi");
		logger.log(game.getName());
	}

}
