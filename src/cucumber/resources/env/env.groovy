import org.openqa.selenium.OutputType
import org.openqa.selenium.WebDriverException

import static cucumber.api.groovy.Hooks.*

import geb.Browser
import geb.binding.BindingUpdater

After() { scenario ->
	// embed screenshot into cucumber report
	if(scenario.failed) {
		try {
			scenario.embed(theBrowser.driver.getScreenshotAs(OutputType.BYTES), "image/png")
		} catch(WebDriverException e) {
			// sometime firefox runs out of memory trying to take a screenshot, not a big deal so ignore
		} catch(MissingMethodException e) {
			// HTMLUnit doesn't support screenshots
		}
	}

}