package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	
	@Before
	public void before(Scenario sc) {
		
		startResult();
		startTestModule(sc.getId(), sc.getName());
		test = startTestCase(sc.getName());
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp("chrome");
	}

	@After
	public void after(Scenario sc) {
		System.out.println(sc.getName());
		endResult();
		System.out.println(sc.getStatus());
		closeAllBrowsers();		
	}
}
