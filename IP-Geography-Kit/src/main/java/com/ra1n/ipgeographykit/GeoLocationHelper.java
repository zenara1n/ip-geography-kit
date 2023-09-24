package com.ra1n.ipgeographykit;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.ra1n.ipgeographykit.model.GeoLocation;

import org.json.JSONException;

import java.nio.charset.StandardCharsets;

public class GeoLocationHelper {
    private static final String IP_INFO_URL = "https://api.ipify.org/?format=json";
    private static final String GEO_LOCATION_URL = "https://api.findip.net/";
    private static String TOKEN_END_POINT = "/?token=";

    public interface GeoLocationListener {
        void onGeoLocationReceived(String ip, GeoLocation geoLocation);

        void onGeoLocationError(String error);
    }

    public static void initializeToken(String token) {
        TOKEN_END_POINT = "/?token=" + token;
    }

    public static void getGeoLocation(Context context, final GeoLocationListener listener) {
        RequestQueue requestQueue = Volley.newRequestQueue(context);

        JsonObjectRequest ipRequest = new JsonObjectRequest(
                Request.Method.GET,
                IP_INFO_URL,
                null,
                response -> {
                    try {
                        String ip = response.getString("ip");
                        fetchGeoLocationDetails(context, ip, listener);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        listener.onGeoLocationError("Error parsing IP response " + e.getMessage());
                    }
                },
                error -> listener.onGeoLocationError("Error fetching IP address " + error.getMessage())
        );

        requestQueue.add(ipRequest);
    }

    private static void fetchGeoLocationDetails(Context context, final String ip, final GeoLocationListener listener) {
        RequestQueue requestQueue = Volley.newRequestQueue(context);

        String geoLocationUrl = GEO_LOCATION_URL + ip + TOKEN_END_POINT;
        JsonObjectRequest geoLocationRequest = new JsonObjectRequest(
                Request.Method.GET,
                geoLocationUrl,
                null,
                response -> {
                    Gson gson = new Gson();
                    GeoLocation geoLocation = gson.fromJson(response.toString(), GeoLocation.class);

                    listener.onGeoLocationReceived(ip, geoLocation);
                },
                error -> {
                    if (error == null || error.networkResponse == null) {
                        return;
                    }

                    String body;
                    final String statusCode = String.valueOf(error.networkResponse.statusCode);
                    body = new String(error.networkResponse.data, StandardCharsets.UTF_8);


                    listener.onGeoLocationError("Error fetching geo-location details " + body);
                });

        requestQueue.add(geoLocationRequest);
    }
}

