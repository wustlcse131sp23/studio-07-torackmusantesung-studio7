package studio7;

public class Fraction {
	
	private int num;
	private int dom;
	
	public Fraction(int n, int d)
	{
		this.num = n;
		this.dom = d;
	}
	
	public Fraction add(Fraction frack)
	{
		int newDom = frack.dom * this.dom;
		int newNumOne = frack.num * this.dom;
		int newNumTwo = frack.dom * this.num;
		return new Fraction((newNumOne + newNumTwo), newDom); 
		
	}
	
	public Fraction mult(Fraction f)
	{
		int dDom = f.dom * this.dom;
		int nNum = f.num * this.num;
		return new Fraction(nNum, dDom);
	}
	
	public Fraction recip()
	{
		return new Fraction(this.dom, this.num);
	}
	
	public Fraction simplify()
	{
		if ()
	}
}

