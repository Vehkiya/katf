package app.kerrlab.runner

import io.cucumber.junit.platform.engine.Constants
import io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME
import org.junit.platform.suite.api.*

@Suite
@IncludeEngines("cucumber")
@SuiteDisplayName("Cucumber JUnit5 Demo")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "app.kerrlab.steps")
@ConfigurationParameter(key = Constants.JUNIT_PLATFORM_NAMING_STRATEGY_PROPERTY_NAME, value = "long")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@Run")
@ConfigurationParameter(
    key = Constants.PLUGIN_PROPERTY_NAME,
    value = "pretty, html:target/cucumber-report/cucumber.html"
)
@SelectPackages("app.kerrlab")
@SelectClasspathResource("features/Test.feature")
class TestRunner