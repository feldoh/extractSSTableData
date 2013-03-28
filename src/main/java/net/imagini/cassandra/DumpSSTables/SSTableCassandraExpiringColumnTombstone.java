package net.imagini.cassandra.DumpSSTables;

public class SSTableCassandraExpiringColumnTombstone extends SSTableCassandraColumnTombstone {

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 1L;

    private final int ttl;
    private final int localDeletionTime;

    public SSTableCassandraExpiringColumnTombstone(long timestamp, int ttl, int localDeletionTime) {
	super(timestamp);
	this.ttl = ttl;
	this.localDeletionTime = localDeletionTime;
    }

    public int getLocalDeletionTime() {
	return localDeletionTime;
    }

    public int getTtl() {
	return ttl;
    }
}
