package net.imagini.cassandra.DumpSSTables;

import java.io.Serializable;

public abstract class SSTableCassandraColumnTombstone implements Serializable {

    /**
     * Serialization Version
     */
    private static final long serialVersionUID = 1L;
    private final long timestamp;

    public SSTableCassandraColumnTombstone(long timestamp) {
	this.timestamp = timestamp;
    }

    public long getTimestamp() {
	return timestamp;
    }
}