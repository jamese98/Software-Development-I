package edu.marist.foxfind;

import android.app.Fragment;
import android.content.Context;
import android.content.res.AssetManager;
import android.location.Location;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.NullPointerException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.util.regex.Pattern;

import com.google.android.gms.maps.OnMapReadyCallback;


public class Locator {


    /** Parse config file and search for current coordinates */
    public static String searchConfig (LatLng coords)  {
        String returnString = null;
        boolean foundLocation = false;

        // COORDINATE BOUNDS FOR EACH LOCATION
        //Marian
        if(41.721246 >= coords.latitude &&
                -73.934547 <= coords.longitude &&
                41.721214 >= coords.latitude &&
                -73.934011 >= coords.longitude &&
                41.720930 <= coords.latitude &&
                -73.934042 <= coords.longitude &&
                41.720958 <= coords.latitude &&
                -73.934581 >= coords.longitude) {
            foundLocation = true;
            returnString = "Marian Hall";
        }

        //Student Center
        if(41.721032 >= coords.latitude &&
                -73.935890 <= coords.longitude &&
                41.721037 >= coords.latitude &&
                -73.935251 >= coords.longitude &&
                41.720571 <= coords.latitude &&
                -73.935900 <= coords.longitude &&
                41.720554 <= coords.latitude &&
                -73.935500 >= coords.longitude) {
            foundLocation = true;
            returnString = "Student Center";
        }

        // Hancock
        if(41.723201 >= coords.latitude &&
                -73.935049 <= coords.longitude &&
                41.723226 >= coords.latitude &&
                -73.934164 >= coords.longitude &&
                41.722462 <= coords.latitude &&
                -73.934704 <= coords.longitude &&
                41.722419 <= coords.latitude &&
                -73.934367 >= coords.longitude) {
            foundLocation = true;
            returnString = "Hancock";
        }

            // Return NO LOCATION if location is not found
            if (!foundLocation) {
                returnString = "NO LOCATION";
            }

        return returnString;

        }


}


