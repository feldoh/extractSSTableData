package net.imagini.cassandra.DumpSSTables;

public class SSTableCassandraCounterColumnTombstone extends SSTableCassandraColumnTombstone {
    /**
     * Serialization version
     */
    private static final long serialVersionUID = 1L;

    private final long timestampOfLastDelete;

    public SSTableCassandraCounterColumnTombstone(long timestamp, long timestampOfLastDelete) {
	super(timestamp);
	this.timestampOfLastDelete = timestampOfLastDelete;
    }

    public long getTimestampOfLastDelete() {
	return timestampOfLastDelete;
    }
}
