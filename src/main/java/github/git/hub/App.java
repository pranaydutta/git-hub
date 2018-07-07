package github.git.hub;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void addData(String data)
	{
		System.out.println("data="+data);
		if(data.equals(Constant.DATA_MATCH))
		{
			System.out.println("welcome to"+data);
			
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
