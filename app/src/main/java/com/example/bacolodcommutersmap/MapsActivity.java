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

//                ang mga points dili pa sure gyud katama
//                iya ka nbound
                LatLng p1 = new LatLng(10.706290193245026,122.96232640743257);
                LatLng p2 = new LatLng(10.698710348094735,122.96210110187532);
                LatLng p3 = new LatLng(10.68402451802426,122.95632362365724);
                LatLng p4 = new LatLng(10.675031336749706,122.961323261261);
                LatLng p5 = new LatLng(10.668157119573616,122.9585123062134);
                LatLng p6 = new LatLng(10.669410094734035,122.95567779775902);
                LatLng p7 = new LatLng(10.671227526278575,122.95653020071113);
                LatLng p8 = new LatLng(10.670237901133511,122.95939183919359);

//                Mandalagan
                LatLng m1 = new LatLng(10.706290193245026,122.96232640743257);
                LatLng m2 = new LatLng(10.698710348094735,122.96210110187532);
                LatLng m3 = new LatLng(10.668431220980896,122.94987363086624);
                LatLng m4 = new LatLng(10.671660528122693,122.94249621497077);
                LatLng m5 = new LatLng(10.669356896050708,122.94155878292007);
                LatLng m6 = new LatLng(10.668060390045909,122.94449043737335);
                LatLng m7 = new LatLng(10.665350806444952,122.94259813891334);
                LatLng m8 = new LatLng(10.666081024921004,122.94087481962127);
                LatLng m9 = new LatLng(10.663111747157647,122.93904220031185);
                LatLng m10 = new LatLng(10.658488685252758,122.94867267177982);

                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(p1,15));

                mMap.addMarker(new MarkerOptions().position(p1).title("Location 1"));
                Polyline polyline = mMap.addPolyline(new PolylineOptions().add(p1,p2,p3,p4,p5,p6,p7,p8).width(5).color(Color.RED));
                Polyline polyline2 = mMap.addPolyline(new PolylineOptions().add(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10).width(5).color(Color.BLUE));
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.getUiSettings().setZoomControlsEnabled(true);

    }


}