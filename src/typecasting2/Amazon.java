package typecasting2;

public class Amazon
{

	public void takerequest(Amazon a)
	{
		
		if(a instanceof AmazonClothing)
		{
			AmazonClothing a1=(AmazonClothing)a;
			a1.clothingSection();
			
		}
	}
	
}
