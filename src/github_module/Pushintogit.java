package github_module;

import org.testng.annotations.Test;

public class Pushintogit {
	@Test
	public void smoketest()
	{
		System.out.println("Hi storing into git");
	}
	@Test
	public void regression()
	{
		int i=0;
		int j=10/i;
		System.out.println(j);
	}

}
