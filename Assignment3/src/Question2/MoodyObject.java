package Question2;

public abstract class MoodyObject {
	protected abstract String getMood();

	protected abstract void expressFeelings();

	public void queryMood() {
		String mood = getMood();
		System.out.println("I feel " + mood + " today \n");
	}

}
