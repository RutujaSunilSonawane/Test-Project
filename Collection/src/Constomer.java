
public class Constomer implements Comparable<Constomer>
{
	int cid,cAge;
	String name;
	Constomer()
	{
		
	}
	Constomer(int i,int a,String n)
	{
		cid=i;
		cAge=a;
		name=n;
	}
	public String toString()
	{
		return cid+" "+cAge+" "+name;
	}
	public int compareTo(Constomer c)
	{
		if(this.cAge<c.cAge)
			return 1;
		else if(this.cAge>c.cAge)
			return -1;
		else
		{
			if(this.name.compareTo(c.name)<0)
				return 1;
			else if(this.name.compareTo(c.name)>0)
				return -1;
			else
				return 0;
			//return this.name.compareTo(name);
		}
		//else
		//{
		//	return this.cid-c.cid;
		//}
	}
	

	public static void main(String[] args) {
		

	}

}
