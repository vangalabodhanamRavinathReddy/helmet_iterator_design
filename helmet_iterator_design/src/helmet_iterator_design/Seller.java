package helmet_iterator_design;

class Seller
{
	HelmetCollection helmet;

public Seller(HelmetCollection helmet)
{
   this.helmet = helmet;
}

public void printHelmetCollection()
{
   Iterator iterator = helmet.createIterator();
   System.out.println("-------Helmet types from seller------------");
   while (iterator.hasNext())
   {
       Helmet h = (Helmet)iterator.next();
       System.out.println(h.getHelmet());
   }
}
}
