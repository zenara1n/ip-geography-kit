package com.ra1n.example;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.ra1n.ipgeographykit.GeoLocationHelper;
import com.ra1n.ipgeographykit.model.GeoLocation;

public class MainActivity extends AppCompatActivity {
    TextView ipAddrTextView, countryNameTextView, cityTextView, postalCodeTextView, latitudeLongitudeTextView, continentTextView, timeZoneTextView, ispTextView, organizationTextView, connectionTypeTextView, autonomousSystemTextView, asOrganizationTextView, userTypeTextView, error;
    RelativeLayout rl;
    ProgressBar pcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        listeners();
    }

    private void initViews() {
        ipAddrTextView = findViewById(R.id.ipAddressTextView);
        countryNameTextView = findViewById(R.id.countryNameTextView);
        cityTextView = findViewById(R.id.cityTextView);
        postalCodeTextView = findViewById(R.id.postalCodeTextView);
        latitudeLongitudeTextView = findViewById(R.id.latitudeLongitudeTextView);
        continentTextView = findViewById(R.id.continentTextView);
        timeZoneTextView = findViewById(R.id.timeZoneTextView);
        ispTextView = findViewById(R.id.ispTextView);
        organizationTextView = findViewById(R.id.organizationTextView);
        connectionTypeTextView = findViewById(R.id.connectionTypeTextView);
        autonomousSystemTextView = findViewById(R.id.autonomousSystemTextView);
        asOrganizationTextView = findViewById(R.id.asOrganizationTextView);
        userTypeTextView = findViewById(R.id.userTypeTextView);
        rl = findViewById(R.id.rl);
        pcv = findViewById(R.id.pcv);
        error = findViewById(R.id.error);

        rl.setVisibility(RelativeLayout.GONE);
        pcv.setVisibility(LinearProgressIndicator.VISIBLE);
    }

    private void listeners() {
        // Initialize IP-Geography-Kit with your token
        GeoLocationHelper.initializeToken("ADD_YOUR_TOKEN_HERE");

        // Get GeoLocation object from IpGeographyKit
        GeoLocationHelper.getGeoLocation(this, new GeoLocationHelper.GeoLocationListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onGeoLocationReceived(String ip, GeoLocation geoLocation) {
                // Set all views with data
                if (ip == null) {
                    ipAddrTextView.setText("Error fetching IP address");
                }
                else {
                    ipAddrTextView.setText("IP Address: " + ip);
                }

                if (geoLocation == null) {
                    countryNameTextView.setText("Error fetching country name");
                }
                else {
                    countryNameTextView.setText("Country Name: " + geoLocation.getCountry().getNames().getEn());
                }

                if (geoLocation == null) {
                    cityTextView.setText("Error fetching city");
                }
                else {
                    cityTextView.setText("City: " + geoLocation.getCity().getNames().getEn());
                }

                if (geoLocation == null) {
                    postalCodeTextView.setText("Error fetching postal code");
                }
                else {
                    postalCodeTextView.setText("Postal Code: " + geoLocation.getPostal().getCode());
                }

                if (geoLocation == null) {
                    latitudeLongitudeTextView.setText("Error fetching latitude and longitude");
                }
                else {
                    latitudeLongitudeTextView.setText("Latitude: " + geoLocation.getLocation().getLatitude() + "\nLongitude: " + geoLocation.getLocation().getLongitude());
                }

                if (geoLocation == null) {
                    continentTextView.setText("Error fetching continent");
                }
                else {
                    continentTextView.setText("Continent: " + geoLocation.getContinent().getNames().getEn());
                }

                if (geoLocation == null) {
                    timeZoneTextView.setText("Error fetching time zone");
                }
                else {
                    timeZoneTextView.setText("Time Zone: " + geoLocation.getLocation().getTimeZone());
                }

                if (geoLocation == null) {
                    ispTextView.setText("Error fetching ISP");
                }
                else {
                    ispTextView.setText("ISP: " + geoLocation.getTraits().getIsp());
                }

                if (geoLocation == null) {
                    organizationTextView.setText("Error fetching organization");
                }
                else {
                    organizationTextView.setText("Organization: " + geoLocation.getTraits().getOrganization());
                }

                if (geoLocation == null) {
                    connectionTypeTextView.setText("Error fetching connection type");
                }
                else {
                    connectionTypeTextView.setText("Connection Type: " + geoLocation.getTraits().getConnectionType());
                }

                if (geoLocation == null) {
                    autonomousSystemTextView.setText("Error fetching autonomous system");
                }
                else {
                    autonomousSystemTextView.setText("Autonomous System: " + geoLocation.getTraits().getAutonomousSystemNumber());
                }

                if (geoLocation == null) {
                    asOrganizationTextView.setText("Error fetching AS organization");
                }
                else {
                    asOrganizationTextView.setText("AS Organization: " + geoLocation.getTraits().getAutonomousSystemOrganization());
                }

                if (geoLocation == null) {
                    userTypeTextView.setText("Error fetching user type");
                }
                else {
                    userTypeTextView.setText("User Type: " + geoLocation.getTraits().getUserType());
                }

                rl.setVisibility(RelativeLayout.VISIBLE);
                pcv.setVisibility(LinearProgressIndicator.GONE);
            }

            @Override
            public void onGeoLocationError(String error) {
                Log.e("IP-Geography-Kit", error);
                MainActivity.this.error.setText("IP-Geography-Kit: " + error);
                pcv.setVisibility(LinearProgressIndicator.GONE);
            }
        });
    }
}