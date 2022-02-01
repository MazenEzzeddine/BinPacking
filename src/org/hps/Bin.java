package org.hps;

import java.util.ArrayList;
import java.util.List;

public class Bin {
    private int memberid;
    private long capacity;
    private long actualSize;
    private List<Long> partitions;

    public Bin(int memberid, long capacity) {
        this.memberid = memberid;
        this.capacity = capacity;
        this.partitions = new ArrayList<Long>();
    }

    public boolean put (long partition){
        if (actualSize+ partition >capacity) {
            return false;
        }
        partitions.add(partition);
        actualSize += partition;
        return true;
    }

    @Override
    public String toString() {
       StringBuilder contentOfBin = new StringBuilder("The contents of the bin with id " + memberid + " is: ");

       for(Long l : partitions) {
           contentOfBin.append(l).append(" ");
       }
       return contentOfBin.toString();
    }
}
