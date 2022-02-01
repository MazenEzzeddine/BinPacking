package org.hps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstFitDecreasing {

    private List<Bin> bins;
    private List<Long> partitions;
    private long binCapacity;
    private int binCounter;

    public FirstFitDecreasing(List<Long> partitions, long binCapacity) {
        this.partitions = partitions;
        this.binCapacity = binCapacity;
        this.bins = new ArrayList<Bin>();
    }


    public void solve(){
        Collections.sort(partitions, Collections.reverseOrder());
        if(partitions.get(0)>binCapacity){
            return ;
        }

        bins.add(new Bin(binCounter, binCapacity));
        for(long partition : partitions){
            boolean isOk= false;
            int currBin=0;

            while(!isOk){
                if(currBin == bins.size()){
                    Bin newBin = new Bin(++binCounter, binCapacity);
                    newBin.put(partition);
                    bins.add(newBin);
                    isOk = true;
                } else if (bins.get(currBin).put(partition)){
                    isOk=true;
                } else {
                    currBin++;
                }
            }
        }
    }


    public void showResults(){
        for (Bin bin: bins) {
            System.out.println(bin);
        }
    }

}
