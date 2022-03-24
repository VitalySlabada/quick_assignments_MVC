package com.vs.riderregistration.bootstrap;

import com.vs.riderregistration.model.Rider;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    private static List<Rider> riderList = new ArrayList<>();

    public static void saveRider (Rider rider){
        riderList.add(rider);
    }


    public static List<Rider> getRiderList() {
        return riderList;
    }

}
