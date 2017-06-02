package com.itd.web.bdd.jbehave;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromURL;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.FilePrintStreamFactory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * JbehaveRunner: parse stories, run scenarios (ItdJbehaveSteps) and generate reports
 */
public class JbehaveRunner
	extends JUnitStories {

	// set classes containing steps
	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(
			configuration()
			, new ItdJbehaveSteps()
		);
	}

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration()
			.useStoryReporterBuilder(getReporter())
			.useStoryLoader(new LoadFromURL());
	}

	private StoryReporterBuilder getReporter() {
		return new StoryReporterBuilder()
			.withPathResolver(new FilePrintStreamFactory.ResolveToSimpleName())
			.withDefaultFormats()
			.withFormats(Format.CONSOLE, Format.HTML);
	}

	@Override
	protected List<String> storyPaths() {
		String path = "stories/*.story"; // apache ant syntax
		return new StoryFinder().findPaths(
			CodeLocations.codeLocationFromPath("").getFile()
			, Collections.singletonList(path)
			, new ArrayList<String>()
			, "file:"
		);
	}
}