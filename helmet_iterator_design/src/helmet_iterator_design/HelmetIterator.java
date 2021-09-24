package helmet_iterator_design;

class HelmetIterator implements Iterator
{
Helmet[] helmetList;

int pos = 0;

public  HelmetIterator (Helmet[] helmetList)
{
   this.helmetList = helmetList;
}

public Object next()
{
   Helmet helmet =  helmetList[pos];
   pos += 1;
   return helmet;
}

public boolean hasNext()
{
   if (pos >= helmetList.length ||
		   helmetList[pos] == null)
       return false;
   else
       return true;
}
}
