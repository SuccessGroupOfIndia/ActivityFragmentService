package com.example.manoj.mysamples;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Manoj on 6/29/2018.
 */

public class ThirdFragment  extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragment","onAttach3");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Fragment","onCreate3");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.thirdfragment,container,false);
        Log.e("Fragment","onCreateView3");

        return view;
    }


    private void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Dialog").setTitle("Hiiiiiiiiii");
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Fragment","onActivityCreated3");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Fragment","onStart3");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragment","onResume3");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragment","onPause3");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragment","onStop3");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragment","onDestroyView3");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragment","onDestroy3");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragment","onDetach3");
    }
}

