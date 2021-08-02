package de.odav.restexample;

/**
 * This class represents a simple resource with
 * an id and a random number.
 */
public class Resource {
    private final long id;
    private final long rndNr;

    public Resource(long id, long rndNr) {
        this.id = id;
        this.rndNr = rndNr;
    }

    public long getId() {
        return id;
    }

    public long getRndNr() {
        return rndNr;
    }
}
