import java.util.Scanner;
public class Calculator {

	public static final double PRECISION = 0.000001;
	
	private double result;
	
	Scanner key = new Scanner(System.in);
	
	public Calculator()
	{
		this.result = 0;
	}
	
	public Calculator(double xResult)
	{
		
	}
	
	public double getResult()
	{
		return this.result;
	}
	
	public void setResult(double xResult)
	{
		this.result = xResult;
	}
	
	public void calculate()
	{
		System.out.println("Calculator is ON! Enter an operator followed by a number or enter 'Exit' to quit:");
		
		boolean done = false;
		
		while(done == false)
		{
			System.out.println("result: " + this.result);
			char op = key.next().charAt(0);
			
			if(op == 'e' || op == 'E')
			{
				System.out.println("Calculator is turned OFF!");
				done = true;
			}
			else
			{
				double num = key.nextDouble();
				try
				{
					this.result = evaluate(op, this.result, num);
				}
				catch(DivisionByZeroException e)
				{
					
					System.out.println(e.getMessage());
				}
				catch(UnknownOperatorException e)
				{
					System.out.println(e.getMessage());
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				finally
				{
					//code to be executed
				}
			}
		}
	}
	
	public double evaluate(char op, double num1, double num2) throws DivisionByZeroException, UnknownOperatorException
	{
		double answer = 0;
		
		switch(op)
		{
		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		case'*':
			answer = num1 * num2;
			break;
		case '/':
			if((num2< -PRECISION)||(num2>PRECISION))
			{
				answer = num1/num2;
			}
			else
			{
				throw new DivisionByZeroException();
			}
			break;
		default:
			throw new UnknownOperatorException();
		}
		return answer;
	}
	
	
}
