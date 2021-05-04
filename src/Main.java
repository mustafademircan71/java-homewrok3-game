import Concrete.GameManager;
import Concrete.GamerManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;
import Concrete.CampaignManager;
import Concrete.DatabaseLogger;

public class Main {

	public static void main(String[] args) {
		
		DatabaseLogger logger= new DatabaseLogger();
		
		Gamer gamer=new Gamer(1,"Mustafa","Demircan","30/05/1994","12345678");
		Game game=new Game(1,"The Division",150);
		Campaign campaign=new Campaign(1,10);
		
		GamerManager gamerManager=new GamerManager(logger);
		gamerManager.add(gamer);
		
		System.out.println("*********************************");
		
		GameManager gameManager=new GameManager(logger);
		gameManager.add(game);
		
		System.out.println("*********************************");
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.campaignCalculation(gamer, game, campaign);
		

	}

}

