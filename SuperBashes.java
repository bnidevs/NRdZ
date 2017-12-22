public class SuperBashes extends PowerUp{
	public SuperBashes(){
		this("SuperBashes");
		multiplier = 10;
		refreshTime = 60;
		timer = 20;
	}

	public void activate(){
		bashValue *= multiplier;
		for(int i = 0; i <= timer; i++){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				Thread.currentThread().interrupt();
			}
		}
		bashValue /= multiplier;
	}
}