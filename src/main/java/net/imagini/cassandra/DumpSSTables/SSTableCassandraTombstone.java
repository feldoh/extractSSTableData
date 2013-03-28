package net.imagini.cassandra.DumpSSTables;

import java.io.Serializable;

public class SSTableCassandraTombstone implements Serializable {
    /**
     * Serialization Version
     */
    private static final long serialVersionUID = 1L;

    private final int localDeletionTime;
    private final long markedForDeleteAt;

    public SSTableCassandraTombstone(int localDeletionTime, long markedForDeleteAt) {
	this.localDeletionTime = localDeletionTime;
	this.markedForDeleteAt = markedForDeleteAt;
    }

    public int getLocalDeletionTime() {
	return localDeletionTime;
    }

    public long getMarkedForDeleteAt() {
	return markedForDeleteAt;
    }
}
