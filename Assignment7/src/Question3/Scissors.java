package Question3;

public class Scissors extends Tool{

	Scissors(int Strength) {
		super(Strength);
		super.setType('s');
		
	}
	
	public boolean fight(Tool tool)
	{   int temp=this.getStrength();
		if(tool.getType()=='r')
		{
			temp=Math.round(temp/2);
			
		}
		else if(tool.getType()=='p')
		{
			temp=temp*2;
			
		}
		if(temp>tool.getStrength())
		{   //System.out.println("Scissor won against " +tool.getClass().getSimpleName());
			return true;}
	   else 
	   {    //System.out.println("Scissor lost against " +tool.getClass().getSimpleName());
		   return false;}
	}


}
