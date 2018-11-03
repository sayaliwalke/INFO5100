package Question3;

public class Rock extends Tool {

	Rock(int Strength) {

		super(Strength);
		super.setType('r');
	}

	Rock(char type) {
		super(type);
	}

	public boolean fight(Tool tool) {
		int temp = this.getStrength();
		if (tool.getType() == 'p') {

			temp = Math.round(temp / 2);

		} else if (tool.getType() == 's') {

			temp = temp * 2;

		}
		if (temp > tool.getStrength()) {
			
			//System.out.println("Rock won against " +tool.getClass().getSimpleName());
			return true;
		} else {
			//System.out.println("Rock lost against " +tool.getClass().getSimpleName());
			return false;
		}

	}

}
