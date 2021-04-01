
public class UnknownOperatorException extends Exception{
	
	public UnknownOperatorException()
	{
		super("EXCEPTION: Unknown Operator Entered!");
	}

	public UnknownOperatorException(String msg)
	{
		super(msg);
	}
}
