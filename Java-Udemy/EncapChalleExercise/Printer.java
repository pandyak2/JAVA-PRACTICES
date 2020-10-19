package EncapChalleExercise;

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	public Printer(int tonerLevel,  boolean duplex) {
		if(tonerLevel > -1 && tonerLevel <= 100)
		{
			this.tonerLevel = tonerLevel; 
		}
		else
		{
			this.tonerLevel = -1;
		}
		this.tonerLevel = tonerLevel;
		this.pagesPrinted = 0;
		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount)
	{
		if(tonerAmount > 0 && tonerAmount <= 100 )
		{
			if(this.tonerLevel + tonerAmount > 100 )
			{
				return -1;
			}
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
		}
		else {
			return -1;
		}
	}
	 public int printPages(int pages)
	 {
		 int pagesToPrint = pages;
		 if(this.duplex)
		 {
			 pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
			 System.out.println("Duplex Mode");
		 }
		 this.pagesPrinted += pagesToPrint;
		 return pagesToPrint;
	 }

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	public void setPagesPrinted(int pagesPrinted) {
		this.pagesPrinted = pagesPrinted;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public boolean isDuplex() {
		return duplex;
	}
	 
}
