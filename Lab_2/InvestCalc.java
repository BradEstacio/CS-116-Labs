import java.util.*;
import java.text.*;

public class InvestCalc 
{
	final NumberFormat DOLLAR_FORMAT = NumberFormat.getCurrencyInstance();
	DecimalFormat df = new DecimalFormat("##0.00%");
	private double interest, principal;
	private int SHORT_TERM = 5;
	private int MIDDLE_TERM = 10;
	private int LONG_TERM = 20;
	
	
	public InvestCalc()
	{
		interest = 0;
		principal = 0;
	}
	
	public InvestCalc(double i, double p)
	{
		interest = i;
		principal = p;
	}
	
	public void setRate(double i)
	{
		interest = i;
	}
	
	public double getRate()
	{
		return interest;
	}
	
	public void setPrincipal(double p)
	{
		principal = p;
	}
	
	public double getPrincipal()
	{
		return principal;
	}
	
	public String toString()
	{
		return "Principal: " + DOLLAR_FORMAT.format(getPrincipal()) + " Interest Rate: " + df.format(getRate());
	}
	
	public double futureValue(int year)
	{
		double value;
		value = getPrincipal() * Math.pow(((double)1 + getRate()), (double) year);
		
		return value;
	
	}
	public void displayTable()
	{
		System.out.println("YEAR \t INTREST RATE \t  PRINCIPAL \t FUTURE VALUE");
		System.out.println(SHORT_TERM + " \t    " + df.format(getRate()) + " \t    " + DOLLAR_FORMAT.format(getPrincipal()) + " \t " +  DOLLAR_FORMAT.format(futureValue(SHORT_TERM)));
		System.out.println(MIDDLE_TERM + " \t    " + df.format(getRate()) + " \t    " + DOLLAR_FORMAT.format(getPrincipal()) + " \t " + DOLLAR_FORMAT.format(futureValue(MIDDLE_TERM)));
		System.out.println(LONG_TERM + " \t    " + df.format(getRate()) + " \t    " + DOLLAR_FORMAT.format(getPrincipal()) + " \t " + DOLLAR_FORMAT.format(futureValue(LONG_TERM)));
		System.out.println();
	}
	}
	

