package app.kerrlab.runner

import io.cucumber.junit.platform.engine.Constants
import io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME
import org.junit.platform.suite.api.*

@Suite
// Specify to use cucumber engine for running tests
@IncludeEngines("cucumber")
// Optional
@SuiteDisplayName("Cucumber JUnit5 Demo")
@SelectPackages("app.kerrlab.steps")
// Specify package where Step Definitions (and hooks) are
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "app.kerrlab.steps,app.kerrlab.hooks")
@ConfigurationParameter(key = Constants.JUNIT_PLATFORM_NAMING_STRATEGY_PROPERTY_NAME, value = "long")
// Optional. Only run tests that have the specified tag (Feature, Scenario, Examples level)
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@Run")
// Optional. Generate cucumber.html report
@ConfigurationParameter(
    key = Constants.PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report/cucumber.html"
)
// Specify a specific feature or a folder of features
@SelectClasspathResource("features")
class TestRunner