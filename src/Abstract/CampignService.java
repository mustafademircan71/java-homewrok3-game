package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public interface CampignService {
	public void campaignCalculation(Gamer gamer,Game game,Campaign campaign);
}
