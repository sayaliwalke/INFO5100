package Question2;

//score 5/5
public class Psychiatrist {
	public void examine(MoodyObject moodyObject) {
		System.out.println("How are you feeling today ");
		moodyObject.queryMood();
		moodyObject.expressFeelings();

	}
	public void observe(MoodyObject moodyObject)
{
	System.out.println("Observation: " + moodyObject.toString() + "\n");
}
}
