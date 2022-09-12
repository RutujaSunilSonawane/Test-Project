
public class Job
{
	private int jobid;
	private String profile;
	private Joiningdate jObj;
	
	public void setJobid(int i)
	{
		jobid=i;
	}
	public int getJobid()
	{
		return jobid;
	}
	public void setProfile(String p)
	{
		profile=p;
	}
	public String getProfile()
	{
		return profile;
	}
	public void setJObj(Joiningdate jd)
	{
		jObj=jd;
	}
	public Joiningdate getJObj()
	{
		return jObj;
	}
	/*Job(int i,String p,Joiningdate j)
	  {
	    jobid=i;
	    profile=p;
	    jObj=j;
	 */
		public String toString()
		{
			return jobid+" "+profile+" "+jObj;
		}
}
