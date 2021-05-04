package Concrete;

import Abstract.CampignService;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class CampaignManager implements CampignService {

	@Override
	public void campaignCalculation(Gamer gamer, Game game, Campaign campaign) {
		double amount=0;
		amount=game.getPrice()-((game.getPrice()*campaign.getCampaignRate())/100);
		
		System.out.println(gamer.getFirstName()+" adl� oyuncu "+game.getName()+" adl� oyunu indidirmli olarak "+
		amount +"Tl'ye Sat�n Ald�");
		
	}

}
