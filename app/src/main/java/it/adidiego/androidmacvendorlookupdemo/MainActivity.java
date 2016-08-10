package it.adidiego.androidmacvendorlookupdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import it.adidiego.macaddresstools.MACAddressVendorLookup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MACAddressVendorLookup macAddressVendorLookup = new MACAddressVendorLookup(this);
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                Log.d("DBG", "VENDOR2:" + macAddressVendorLookup.getVendor("00:90:00:aa:bb:cc"));
            }
        };
        macAddressVendorLookup.initializeAsync(this, true, callback);
    }
}
