package Entity;

public class Campaign {
	private int id;
	private double campaignRate;
	
	
	public Campaign () {
		
	}

	public Campaign(int id, double campaignRate) {
		this();
		this.id = id;
		this.campaignRate = campaignRate;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(double campaignRate) {
		this.campaignRate = campaignRate;
	}
}
