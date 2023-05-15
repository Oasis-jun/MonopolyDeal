package card;

public  class ActionCard extends Card implements Namable{
	private String name;
	public ActionCard(String path, int worth, String name) {
		super(path,worth);
		this.setName(name);
	}
	@Override
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
