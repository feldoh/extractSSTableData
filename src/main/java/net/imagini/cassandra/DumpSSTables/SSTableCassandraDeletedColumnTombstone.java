package net.imagini.cassandra.DumpSSTables;

public class SSTableCassandraDeletedColumnTombstone extends SSTableCassandraColumnTombstone {

    /**
     * Serialization Version
     */
    private static final long serialVersionUID = 1L;

    public SSTableCassandraDeletedColumnTombstone(long timestamp) {
	super(timestamp);
    }

}
