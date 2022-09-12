package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Actor
{
	int actor_id;
	String actor_name;
	Actor(){}
	Actor(int id,String a)
	{
		actor_id=id;
		actor_name=a;
	}
	public String toString()
	{
		return actor_id+" "+actor_name;
	}
}
class Movie
{
	int budget,role;
	String m_name,m_producer;
	Actor obj;
	Movie(){}
	Movie(String movieName,String producer,int budjet,int r,Actor a)
	{
		this.m_name = movieName;
		this.m_producer = producer;
		this.budget = budjet;
		role=r;
		this.obj=a;
	}
	public String toString()
	{
		return m_name+" "+m_producer+" "+budget+" "+role+" "+obj;
	}
}

public class ActorEx {
	
	ArrayList<Movie> al=new ArrayList<Movie>();
	ActorEx()
	{
	al.add(new Movie("M.S.Dhoni", "Raju", 700000,3,new Actor(323,"Madhavan")));
	al.add(new Movie("WANTED", "KARAN JOHAR", 533000,4,new Actor(134,"SALAMAN")));
	al.add(new Movie("RHTDM", "GANESH", 8768760,2,new Actor(323,"AAMIR")));
	System.out.println(al);
	}
	public void Createmap()
	{
		TreeMap<String, String> tm=new TreeMap<String, String>(Collections.reverseOrder());
		Iterator<Movie> itr=al.iterator();
		while(itr.hasNext())
		{
			Movie m=itr.next();
			tm.put(m.m_name,m.obj.actor_name);
		}
		System.out.println(tm);
	}
	public void createLinkedHashMap()
	{
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();
		Iterator< Movie> itr=al.iterator();
		while(itr.hasNext())
		{
			Movie m=itr.next();
			lh.put(m.obj.actor_name,m.role);
			
		}
		System.out.println(lh);
	}
	public void roleMax()
	{
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		Iterator< Movie> itr=al.iterator();
		Integer max=Integer.MIN_VALUE;
		while(itr.hasNext())
		{
			
			Movie m=itr.next();
			tm.put(m.obj.actor_name,m.role);
			Collection<Integer> s=tm.values();
			
		    for(Integer a:s)
		    {
		    	
		    	if(max<a)
		    
		    	max=a;	
		    }
		   
		}
		 Iterator< Movie> itr1=al.iterator();
			
			while(itr1.hasNext())
			{
				
				Movie m=itr1.next();
				if(m.role==max)
				{
					System.out.println(m.obj.actor_name+" Played maximum "+max+" Role");
				}
			}
	}
    
	public static void main(String[] args) {
		ActorEx x=new ActorEx();
		x.Createmap();
		x.createLinkedHashMap();
		x.roleMax();

	}

}