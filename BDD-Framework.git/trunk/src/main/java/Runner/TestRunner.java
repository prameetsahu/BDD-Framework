package Runner;


	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;


		@RunWith(Cucumber.class)
		@CucumberOptions(
				//feature means path of the feature file
				features = "C:\\Users\\PRAMEET\\workspace\\CucumberPOM\\src\\main\\java\\qa\\com\\features\\FreeCRM.feature", //the path of the feature files
				//path of the step defination file
				glue={"stepDefination"} , format= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
			
				//cucumber.json is file name we can give any file name
				monochrome=true, //display console o/p in readable format
				strict=true,// it will check is any step definition is not defined in SDF, if missing fail the case and in o/P display below things:
				//1. Throw "pending exception" error
				//2. showing missing step snippets in console
				dryRun=true
				//tags={"~@SmokeTest"}
				)
				
			
				
		public class TestRunner {
		
}
		
		// "OR" is represented by ","  : tags={"@E2ETest , @SmokeTest"}
		// "AND" is represented east tage with double quote " " : tags={"@E2ETest" , "@SmokeTest"}
		//Want to ignore any case then use "~" spl character  : tags={"~@SmokeTest"}
		
		
		

		//druRun is used to check is use to map feature file with the step defination file, so we can find it if we miss to add any steps defination as compare with feature file steps
		//if true then only its do the mapping else we make it as dryRun=false