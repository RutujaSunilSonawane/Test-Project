
public class Laptop
{
	private int noOfOSBPort,processorSpeed;
	
	public void setNOOfOSBPort(int n)
	{
		noOfOSBPort=n;
	}
	public int getNOOfOSBPort()
	{
		return noOfOSBPort;
	}
	public void setProcessorSpeed(int p)
	{
		processorSpeed=p;
	}
	public int getProcessorSpeed()
	{
		return processorSpeed;
	}
	public String toString()
	{
		return noOfOSBPort+" "+processorSpeed;
	}
	public static void main(String[] args)
	{
		Laptop obj=new Laptop();
		obj.setNOOfOSBPort(1234);
		obj.setProcessorSpeed(10);
		System.out.println("noOfOSBPort:"+obj.getNOOfOSBPort());
		System.out.println("processorSpeed:"+obj.getProcessorSpeed());

	}

}
