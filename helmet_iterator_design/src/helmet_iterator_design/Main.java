package helmet_iterator_design;

class Main
{
public static void main(String args[])
{
	HelmetCollection c = new HelmetCollection();
	 Seller s = new Seller(c);
   s.printHelmetCollection();
}
}
