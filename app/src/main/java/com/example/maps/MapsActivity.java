package com.example.maps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sdn1 = new LatLng(-7.627063,112.509063);
        googleMap.addMarker(new MarkerOptions().position(sdn1).title("SDN PADI"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sdn1));

        LatLng sdn2 = new LatLng(-7.6139947,112.4877313);
        googleMap.addMarker(new MarkerOptions().position(sdn2).title("SDN GONDANG"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sdn2));

        LatLng smp1 = new LatLng(-7.6082395,112.4650323);
        googleMap.addMarker(new MarkerOptions().position(smp1).title("SMP GONDANG"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(smp1));

        LatLng smp2 = new LatLng(-7.6469402,112.4970893);
        googleMap.addMarker(new MarkerOptions().position(smp2).title("SMP PACET"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(smp2));

        LatLng sma1 = new LatLng(-7.6367894,112.5264706);
        googleMap.addMarker(new MarkerOptions().position(sma1).title("SMA PACET"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sma1));

        LatLng sma2 = new LatLng(-7.6119025,112.4809024);
        googleMap.addMarker(new MarkerOptions().position(sma2).title("SMA GONDANG"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sma2));
    }
}
