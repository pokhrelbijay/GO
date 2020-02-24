package com.example.myapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
//import android.support.v4.app.FragmentActivity;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SecondActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button ClaimAddress;
    private EditText StartLocation;
    private EditText EndLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Kathmandu, Nepal, and move the camera.
        LatLng Nepal = new LatLng(27.610504, 85.357820);
        mMap.addMarker(new MarkerOptions().position(Nepal).title("Marker in Kathmandu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nepal));
        mMap.setMinZoomPreference(14);
        mMap.setMapType(mMap.MAP_TYPE_HYBRID);
    }
}
