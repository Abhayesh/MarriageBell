package com.example.apoorvesh.marriagebell;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Venues extends android.app.Fragment{

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){

        View v=inflater.inflate(R.layout.fragment_venues,container,false);

        return v;
    }
}