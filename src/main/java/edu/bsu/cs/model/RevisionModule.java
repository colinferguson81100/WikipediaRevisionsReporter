package edu.bsu.cs.model;

import com.google.inject.AbstractModule;
import edu.bsu.cs.view.NewRevisionFormatter;
import edu.bsu.cs.view.RevisionEngine;

import java.time.Duration;


public class RevisionModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(RevisionEngine.class).to(NewRevisionFormatter.class);
        bind(Duration.class).toInstance(Duration.ofSeconds(2));
    }
}
