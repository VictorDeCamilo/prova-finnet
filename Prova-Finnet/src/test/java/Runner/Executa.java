package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "src/test/resources/Features",
		
		glue = "Steps",
				
		tags = "@cadastro or @login", 
		
		dryRun = false,
		
		plugin = {"pretty","html:target/report.html"},
		
		monochrome = true
		
		)


public class Executa {
	
	@AfterClass
	public static void testeFinalizado () {
	
		System.out.println("------------- Teste Finalizado ---------------");
		
	}
	
}
