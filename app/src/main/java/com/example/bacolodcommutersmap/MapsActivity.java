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

                //laSalle
                LatLng l1 = new LatLng(10.680635,122.962697);
                LatLng l2 = new LatLng(10.680648,122.962630);
                LatLng l3 = new LatLng(10.679101,122.959488);
                LatLng l4 = new LatLng(10.682392,122.957817);
                LatLng l5 = new LatLng(10.682140,122.957820);
                LatLng l6 = new LatLng(10.677535,122.960113);
                LatLng l7 = new LatLng(10.675664,122.961020);
                LatLng l8 = new LatLng(10.675346,122.961139);
                LatLng l9 = new LatLng(10.674998,122.961171);
                LatLng l10 = new LatLng(10.674250,122.961047);
                LatLng l11 = new LatLng(10.673401,122.960699);
                LatLng l12 = new LatLng(10.670265,122.959305);
                LatLng l13 = new LatLng(10.668265,122.958421);
                LatLng l14 = new LatLng(10.668494,122.957844);
                LatLng l15 = new LatLng(10.669390,122.955755);
                LatLng l16 = new LatLng(10.670452,122.953264);
                LatLng l17 = new LatLng(10.671414,122.951078);
                LatLng l18 = new LatLng(10.669807,122.950439);
                LatLng l19 = new LatLng(10.668489,122.949911);
                LatLng l20 = new LatLng(10.669015,122.948709);
                LatLng l21 = new LatLng(10.669561,122.947497);
                LatLng l22 = new LatLng(10.670194,122.946072);
                LatLng l23 = new LatLng(10.670568,122.945337);
                LatLng l24 = new LatLng(10.670838,122.944638);
                LatLng l25 = new LatLng(10.671523,122.942906);
                LatLng l26 = new LatLng(10.671654,122.942562);
                LatLng l27 = new LatLng(10.669380,122.941552);
                LatLng l28 = new LatLng(10.668600,122.943486);
                LatLng l29 = new LatLng(10.668446,122.943760);
                LatLng l30 = new LatLng(10.668079,122.944496);
                LatLng l31 = new LatLng(10.666735,122.943593);
                LatLng l32 = new LatLng(10.666169,122.944785);
                LatLng l33 = new LatLng(10.666927,122.945194);
                LatLng l34 = new LatLng(10.667634,122.945555);
                LatLng l35 = new LatLng(10.668735,122.946141);
                LatLng l36 = new LatLng(10.668393,122.946972);
                LatLng l37 = new LatLng(10.668261,122.947021);
                LatLng l38 = new LatLng(10.667207,122.946577);
                LatLng l39 = new LatLng(10.666412,122.946245);
                LatLng l40 = new LatLng(10.665579,122.945902);
                LatLng l41 = new LatLng(10.664238,122.945331);
                LatLng l42 = new LatLng(10.662946,122.944858);
                LatLng l43 = new LatLng(10.662418,122.945941);
                LatLng l44 = new LatLng(10.661786,122.947225);
                LatLng l45 = new LatLng(10.661786,122.947225);
                LatLng l46 = new LatLng(10.660815,122.949427);
                LatLng l47 = new LatLng(10.658624,122.948344);
                LatLng l48 = new LatLng(10.658151,122.949410);
                LatLng l49 = new LatLng(10.659439,122.950038);
                LatLng l50 = new LatLng(10.659381,122.950210);
                //this
                LatLng l51 = new LatLng(10.660348,122.950649);
                LatLng l52 = new LatLng(10.660530,122.950759);
                LatLng l53 = new LatLng(10.660682,122.950939);
                LatLng l54 = new LatLng(10.660741,122.951135);
                LatLng l55 = new LatLng(10.661065,122.952940);
                LatLng l56 = new LatLng(10.661065,122.952940);
                LatLng l57 = new LatLng(10.661178,122.953773);
                LatLng l58 = new LatLng(10.661356,122.954484);
                LatLng l59 = new LatLng(10.661608,122.955439);
                LatLng l60 = new LatLng(10.661747,122.955707);
                LatLng l61 = new LatLng(10.661938,122.955837);
                LatLng l62 = new LatLng(10.662151,122.955935);
                LatLng l63 = new LatLng(10.662151,122.955935);
                LatLng l64 = new LatLng(10.663161,122.956313);
                LatLng l65 = new LatLng(10.664301,122.956765);
                LatLng l66 = new LatLng(10.664764,122.957017);
                LatLng l67 = new LatLng(10.666994,122.957993);
                LatLng l68 = new LatLng(10.667978,122.958402);
                LatLng l69 = new LatLng(10.668192,122.958595);
                LatLng l70 = new LatLng(10.669681,122.959161);
                LatLng l71 = new LatLng(10.670211,122.959403);
                LatLng l72 = new LatLng(10.670720,122.959631);
                LatLng l73 = new LatLng(10.672262,122.960328);
                LatLng l74 = new LatLng(10.673598,122.960915);
                LatLng l75 = new LatLng(10.674178,122.961189);
                LatLng l76 = new LatLng(10.674478,122.961264);
                LatLng l77 = new LatLng(10.674976,122.961310);
                LatLng l78 = new LatLng(10.675367,122.961267);
                LatLng l79 = new LatLng(10.675680,122.961162);
                LatLng l80 = new LatLng(10.678619,122.959754);
                LatLng l81 = new LatLng(10.679087,122.959507);
                LatLng l82 = new LatLng(10.680635,122.962697);

                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(m1,15));

                mMap.addMarker(new MarkerOptions().position(m1).title("Mandalagan Route"));
                mMap.addMarker(new MarkerOptions().position(b1).title("Bata Route"));
                mMap.addMarker(new MarkerOptions().position(l1).title("La Salle Route"));
                mMap.addMarker(new MarkerOptions().position(b33).title("End Route"));

                Polyline polylineManda = mMap.addPolyline(new PolylineOptions().add(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10).width(5).color(Color.BLUE));
                Polyline polylineBata = mMap.addPolyline(new PolylineOptions().add(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33).width(5).color(Color.BLACK));
                Polyline polylineLasalle = mMap.addPolyline(new PolylineOptions().add(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,
                        l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,l51,l52,l53,l54,l55,
                        l56,l57,l58,l59,l60,l61,l62,l63,l64,l65,l66,l67,l68,l69,l70,l71,l72,l73,l74,l75,l76,l77,l78,l79,l80,l81,l82).width(5).color(Color.GREEN));

            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.getUiSettings().setZoomControlsEnabled(true);

    }


}