package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	@Before
	public void setup()
	{
		System.out.println("++Browser got opened and maximise");
		System.out.println("++application Url got opened");
	}
	@After
	public void teardown()
	{
		System.out.println("--Browser got closed");
		System.out.println("--application Url got closed");
	}

}
