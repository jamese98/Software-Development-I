package edu.marist.foxfind;

import android.location.Location;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * Created by James on 4/7/2017.
 */

public class Locator extends MapsActivity {
    public static void locatorInit() {

    }

    /** Load configuration file */
    private void loadConfig() {

        try {
            Scanner input = new Scanner(new File("locationConfig.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

   // private double[] parseConfig(File file) {

   // }

}
