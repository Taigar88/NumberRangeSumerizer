package numberRangeSummarizer.Test;

import java.io.PrintWriter;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import static org.junit.platform.engine.discovery.DiscoverySelectors.*;
import static org.junit.platform.engine.discovery.ClassNameFilter.*;

public class TestRun {
	SummaryGeneratingListener listener = new SummaryGeneratingListener();
// Single test
	public void runOne() {
		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request().selectors(selectClass(Test2.class))
				.build();
		Launcher launcher = LauncherFactory.create();
		TestPlan testPlan = launcher.discover(request);
		launcher.registerTestExecutionListeners(listener);
		launcher.execute(request);
	}

//	multiple test
	public void runAll() {
		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
				.selectors(selectPackage("numberRangeSummarizerTest")).filters(includeClassNamePatterns("^(Test.*|.+[.$]Test.*|.*Tests?)$"))
				.build();
		Launcher launcher = LauncherFactory.create();
		TestPlan testPlan = launcher.discover(request);
		launcher.registerTestExecutionListeners(listener);
		launcher.execute(request);
	}

	public static void main(String[] args) {
		TestRun runner = new TestRun();

		/*
		 * This is to run specific test
		 */
//		runner.runOne();
		/*
		 * This is to run all test in the numberRangeSumerizerTest package
		 */
		runner.runAll();

		TestExecutionSummary summary = runner.listener.getSummary();
		summary.printTo(new PrintWriter(System.out));
	}

}
