package com.example.bacolodcommutersmap;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        btn = findViewById(R.id.button1);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        NorthBound();

    }

    private void NorthBound() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PolylineOptions polylineOptions = new PolylineOptions();
                MarkerOptions markerOptions = new MarkerOptions();

                LatLng p1 = new LatLng(10.706290193245026,122.96232640743257);
                LatLng p2 = new LatLng(10.698710348094735,122.96210110187532);
                LatLng p3 = new LatLng(10.68402451802426,122.95632362365724);
                LatLng p4 = new LatLng(10.675031336749706,122.961323261261);
                LatLng p5 = new LatLng(10.668157119573616,122.9585123062134);
                LatLng p6 = new LatLng(10.669410094734035,122.95567779775902);
                LatLng p7 = new LatLng(10.671227526278575,122.95653020071113);
                LatLng p8 = new LatLng(10.670237901133511,122.95939183919359);

                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(p1,15));

                mMap.addMarker(new MarkerOptions().position(p1).title("Location 1"));
                Polyline polyline = mMap.addPolyline(new PolylineOptions().add(p1,p2,p3,p4,p5,p6,p7,p8).width(5).color(Color.RED));
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

    }


}