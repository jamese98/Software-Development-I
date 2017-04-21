package edu.marist.foxfind;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class Locator extends MapsActivity {

    /** Parse config file */
    private String place searchConfig(String place) {
        Scanner input = null;
        try {
            input = new Scanner(new File("locationConfig.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(input.hasNext()) {
            while(input.next() != place)
        }
    }

    private double[] parseConfig() {
        // Load file
        Scanner input = null;
        try {
            input = new Scanner(new File("locationConfig.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Create each coordinate
        while(input.hasNext()) {

            while(input.next() != ";") {
                String place = input.next();
                double latitude = input.nextDouble();
                double longitude = input.nextDouble();
                LatLng cord = new LatLng(latitude, longitude);

            }

        }
    }

}


