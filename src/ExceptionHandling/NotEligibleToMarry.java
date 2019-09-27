package ExceptionHandling;

public class NotEligibleToMarry extends Exception
{

@Override
public String getMessage() {
	
	return "Not Eligible for Marriage, please wait";
}
}
