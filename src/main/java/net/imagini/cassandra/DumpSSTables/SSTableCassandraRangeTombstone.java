package net.imagini.cassandra.DumpSSTables;

import java.io.Serializable;

public class SSTableCassandraRangeTombstone extends SSTableCassandraTombstone implements Serializable {

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 1L;
    private final String min;
    private final String max;

    public SSTableCassandraRangeTombstone(String min, String max, int localDeletionTime, long markedForDeleteAt) {
	super(localDeletionTime, markedForDeleteAt);
	this.min = min;
	this.max = max;
    }

    public String getMin() {
	return min;
    }

    public String getMax() {
	return max;
    }

}
