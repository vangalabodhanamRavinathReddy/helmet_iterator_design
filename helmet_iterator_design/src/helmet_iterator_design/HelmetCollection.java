package helmet_iterator_design;

class HelmetCollection implements Collection
{
static final int MAX_ITEMS = 10;
int numberOfItems = 0;
Helmet[] helmetList;

public HelmetCollection()
{
	helmetList = new Helmet[MAX_ITEMS];

   addItem("Full face helmet");
   addItem("Modular helmet");
   addItem("Off-road helmet");
}

public void addItem(String str)
{
   Helmet helmet = new Helmet(str);
   if (numberOfItems >= MAX_ITEMS)
       System.err.println("Full");
   else
   {
	   helmetList[numberOfItems] = helmet;
       numberOfItems = numberOfItems + 1;
   }
}

public Iterator createIterator()
{
   return new HelmetIterator(helmetList);
}
}
