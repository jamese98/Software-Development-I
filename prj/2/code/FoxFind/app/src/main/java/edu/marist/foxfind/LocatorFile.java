package edu.marist.foxfind;

import com.google.android.gms.maps.model.LatLng;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


class LocatorFile {


    /** Parse config file and search for current coordinates */
    static String searchConfig(LatLng coords, InputStream inputStream)  {
        // Initialize scanner
        Scanner input = new Scanner(inputStream);
        String returnString = "";

        // Initialize search variables
        LatLng[] searchCoords = new LatLng[4]; // Initialize array to store location coordinates
        boolean foundLocation = false; // Initialize variable to track if location has been found


        try {

            while (!foundLocation && input.hasNext()) { // runs while location is not found and file still has data to be read

                // Read four area coordinates from file into searchCoords array
                for (int i = 0; i < 4; i++) {
                    double latitude = 0;
                    double longitude = 0;

                    // Search for latitude
                    boolean latIsDouble = false;
                    while(!latIsDouble && input.hasNext()) {
                        if(input.hasNextDouble()) {
                            latitude = input.nextDouble();
                            latIsDouble = true;
                        } else {
                            latIsDouble = false;
                            input.next();
                        }
                    }

                    // Search for longitude
                    boolean longIsDouble = false;
                    while(!longIsDouble && input.hasNext()) {
                        if(input.hasNextDouble()) {
                            longitude = input.nextDouble();
                            longIsDouble = true;
                        } else {
                            longIsDouble = false;
                            input.next();
                        }
                    }

                    // Combine into LatLng object and add to array
                    LatLng tempCoord = new LatLng(latitude, longitude);
                    searchCoords[i] = tempCoord;
                }

                // Check if current coordinates are within bounds of searchCoords[] area
                if (searchCoords[0].latitude >= coords.latitude &&
                        searchCoords[0].longitude <= coords.longitude &&
                        searchCoords[1].latitude >= coords.latitude &&
                        searchCoords[1].longitude >= coords.longitude &&
                        searchCoords[2].latitude <= coords.latitude &&
                        searchCoords[2].longitude >= coords.longitude &&
                        searchCoords[3].latitude <= coords.latitude &&
                        searchCoords[3].longitude <= coords.longitude) {
                    foundLocation = true; // coordinates are within bounds of area
                } else {
                    // Coordinates are not within bounds of area
                    foundLocation = false;
                    Arrays.fill(searchCoords, null); // empty searchCoords[]
                }
            }


            if (foundLocation) {
                // Location found, return location name as string
                String regex = "([\"'])(?:(?=(\\\\?))\\2.)*?\\1"; // regular expression
                returnString = input.findInLine(regex); // search current line for string matching regex
                returnString = returnString.replace("\"", ""); // remove " characters from string
            } else {
                // Return NO LOCATION if location is not found
                returnString = "NO LOCATION";
            }

            // Catch errors if necessary
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        // Return result
        return returnString;

        }


}