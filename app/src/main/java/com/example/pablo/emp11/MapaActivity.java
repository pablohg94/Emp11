package com.example.pablo.emp11;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaActivity extends AppCompatActivity implements OnMapReadyCallback{

    //Conjunto de variables necesarias para la ejecucion del programa
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.mapa_activity);

            //cargamos el contenedor del mapa
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }
    }

    //metodo necesario para el funcionamiento del mapa
    @Override
    public void onMapReady(GoogleMap googleMap) {

        //Establecemos el mapa y los valores maximos y minimos de zoom
        mMap = googleMap;
        mMap.setMaxZoomPreference(19);
        mMap.setMinZoomPreference(13);

        //Creamos unas cuantas posiciones a pelo para poder ubicarlas en el mapa
        LatLng pos1 = new LatLng(40.7118852,-4.1900024);
        LatLng pos2 = new LatLng(40.7118952,-4.1900224);
        LatLng pos3 = new LatLng(40.7119152,-4.1900424);
        LatLng pos4 = new LatLng(40.7119252,-4.1900624);
        LatLng pos5 = new LatLng(40.7119352,-4.1900824);
        LatLng pos6 = new LatLng(40.7119452,-4.1901024);
        LatLng pos7 = new LatLng(40.7119552,-4.1901224);
        LatLng pos8 = new LatLng(40.7119662,-4.1901424);

        //Añadimos las posiciones con marcadores al mapa
        googleMap.addMarker(new MarkerOptions().position(pos1).title("marcador1"));
        googleMap.addMarker(new MarkerOptions().position(pos2).title("marcador2"));
        googleMap.addMarker(new MarkerOptions().position(pos3).title("marcador3"));
        googleMap.addMarker(new MarkerOptions().position(pos4).title("marcador4"));
        googleMap.addMarker(new MarkerOptions().position(pos5).title("marcador5"));
        googleMap.addMarker(new MarkerOptions().position(pos6).title("marcador6"));
        googleMap.addMarker(new MarkerOptions().position(pos7).title("marcador7"));
        googleMap.addMarker(new MarkerOptions().position(pos8).title("marcador8"));

        //ubicamos la camara en la posicion "pos1" del mapa
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(pos1));
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(pos1, 17);
        mMap.animateCamera(cameraUpdate);;

    }

    //metodo que establece la accion del boton atras
    public void onBackPressed() {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        this.finish();
    }
}
