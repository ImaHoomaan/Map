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
    public Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        btn = findViewById(R.id.button1);
        btn2 = findViewById(R.id.btn2);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        NorthBound();

    }

    private void NorthBound() {
        PolylineOptions polylineOptions = new PolylineOptions();
        MarkerOptions markerOptions = new MarkerOptions();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(p1,15));

                mMap.addMarker(new MarkerOptions().position(p1).title("Nbound Route"));
                Polyline polyline = mMap.addPolyline(new PolylineOptions().add(p1,p2,p3,p4,p5,p6,p7,p8).width(5).color(Color.RED));

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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

                // Bata

                LatLng b1 = new LatLng(10.706290193245026,122.96232640743257);
                LatLng b2 = new LatLng(10.699396258083565,122.96212255954742);
                LatLng b3 = new LatLng(10.697626462192797,122.96180069446564);
                LatLng b4 = new LatLng(10.676467344517222,122.95316129922867);
                LatLng b5 = new LatLng(10.677342750764623,122.95094579458237);
                LatLng b6 = new LatLng(10.669620012395916,122.94739186763763);
                LatLng b7 = new LatLng(10.67164976453109,122.94250756502151);
                LatLng b8 = new LatLng(10.669372573135963,122.94154465198517);
                LatLng b9 = new LatLng(10.668424163934757,122.94368773698807);
                LatLng b10 = new LatLng(10.668097483478208,122.94445216655731);
                LatLng b11 = new LatLng(10.666721731522955,122.94353753328323);
                LatLng b12 = new LatLng(10.666131462670714,122.94473648071289);
                LatLng b13 = new LatLng(10.661397573786212,122.94226616621017);
                LatLng b14 = new LatLng(10.65968439362421,122.94610977172852);
                LatLng b15 = new LatLng(10.658672362386067,122.94829577207565);
                LatLng b16 = new LatLng(10.65807153417466,122.94961810112);
                LatLng b17 = new LatLng(10.658556710872954,122.95121937990189);
                LatLng b18 = new LatLng(10.659648149685484,122.9523378610611);
                LatLng b19 = new LatLng(10.660302022625649,122.95063465833664);
                LatLng b20 = new LatLng(10.661825743762,122.94714510440826);
                LatLng b21 = new LatLng(10.662417009429328,122.94593006372452);
                LatLng b22 = new LatLng(10.662417009429328,122.94593006372452);
                LatLng b23 = new LatLng(10.667831262534023,122.94816970825195);
                LatLng b24 = new LatLng(10.66830588027997,122.94703513383865);
                LatLng b25 = new LatLng(10.66954489104401,122.94745624065399);
                LatLng b26 = new LatLng(10.677320676193226,122.9509887099266);
                LatLng b27 = new LatLng(10.677320676193226,122.9509887099266);
                LatLng b28 = new LatLng(10.67645630719992,122.95322835445404);
                LatLng b29 = new LatLng(10.69761048390661,122.96185702085495);
                LatLng b30 = new LatLng(10.708962746062344,122.96229802667024);
                LatLng b31 = new LatLng(10.708940418381285,122.96215156840802);
                LatLng b32 = new LatLng(10.704753063089749,122.96223531876069);
                LatLng b33 = new LatLng(10.702367075065967,122.97424772802248);

                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(m1,15));

                mMap.addMarker(new MarkerOptions().position(m1).title("Mandalagan Route"));
                mMap.addMarker(new MarkerOptions().position(b1).title("Bata Route"));
                mMap.addMarker(new MarkerOptions().position(b33).title("End Route"));

                Polyline polylineManda = mMap.addPolyline(new PolylineOptions().add(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10).width(5).color(Color.BLUE));
                Polyline polylineBata = mMap.addPolyline(new PolylineOptions().add(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33).width(5).color(Color.BLACK));

            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.getUiSettings().setZoomControlsEnabled(true);

    }


}