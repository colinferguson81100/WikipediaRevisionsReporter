package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.format.DateTimeFormatter;

public class NewRevisionFormatter implements RevisionEngine {

    @Override
    public String format(Revision revision) {
        return String.format("At %s a change by %s",
                DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss"));
    }
}
