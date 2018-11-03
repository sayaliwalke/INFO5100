package Question3;

public class Paper extends Tool {

	Paper(int Strength) {
		super(Strength);
		super.setType('p');

	}

	Paper(char type) {
		super(type);
	}

	public boolean fight(Tool tool) {
		int temp = this.getStrength();
		if (tool.getType() == 's') {
			temp = Math.round(temp / 2);

		} else if (tool.getType() == 'r') {
			temp = temp * 2;
			return true;

		}
		if (temp > tool.getStrength()) {
			//System.out.println("Paper won against " +tool.getClass().getSimpleName());
			return true;
		} else {
			//System.out.println("Paper lost against " +tool.getClass().getSimpleName());
			return false;
		}

	}

}
