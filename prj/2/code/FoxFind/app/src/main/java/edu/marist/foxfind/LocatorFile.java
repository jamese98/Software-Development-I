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
import com.google.android.gms.maps.OnMapReadyCallback;


public class LocatorFile {


    /** Parse config file and search for current coordinates */
    public static String searchConfig (LatLng coords, InputStream inputStream)  {
        // Initialize scanner
        Scanner input = new Scanner(inputStream);
        String returnString = "";

        // Initialize search variables
        LatLng[] searchCoords = new LatLng[4]; // Initialize array to store location coordinates
        boolean foundLocation = false; // Initialize variable to track if location has been found


        try {

            while (!foundLocation || input.hasNextLine()) { // runs while location is not found or file still has data to be read
                // Put four area coordinates into searchCoords array
                for (int i = 0; i < 4; i++) {
                    double latitude = input.nextDouble();
                    double longitude = input.nextDouble();
                    LatLng tempCoord = new LatLng(latitude, longitude);
                    searchCoords[i] = tempCoord;
                }

                // Check if current coordinates are within bounds of area
                if (searchCoords[1].latitude >= coords.latitude &&
                        searchCoords[1].longitude <= coords.longitude &&
                        searchCoords[2].latitude >= coords.latitude &&
                        searchCoords[2].longitude >= coords.longitude &&
                        searchCoords[3].latitude <= coords.latitude &&
                        searchCoords[3].longitude <= coords.longitude &&
                        searchCoords[4].latitude <= coords.latitude &&
                        searchCoords[4].longitude >= coords.longitude) {
                    foundLocation = true; // coordinates are within bounds of area
                } else {
                    // Coordinates are not within bounds of area
                    foundLocation = false;
                    Arrays.fill(searchCoords, null);
                }
            }

            // Return NO LOCATION if location is not found
            if (!foundLocation) {
                returnString = "NO LOCATION";
            } else {
                // Return location name as string
                returnString = input.next(("\"([^\"]*)\""));
            }

       // } catch (NullPointerException e) {
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        return returnString;

        }


}


