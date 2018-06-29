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
import android.widget.Button;

/**
 * Created by Manoj on 6/8/2018.
 */

public class SecondFragment  extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragment","onAttach2");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Fragment","onCreate2");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.second_fragment,container,false);
        Log.e("Fragment","onCreateView2");

        Button button=(Button)view.findViewById(R.id.pop_up);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // showDialog();

                Fragment fragment=new ThirdFragment();
                getFragmentManager().beginTransaction().add(R.id.container,fragment).addToBackStack(null).commit();
            }
        });


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
        Log.e("Fragment","onActivityCreated2");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Fragment","onStart2");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragment","onResume2");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragment","onPause2");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragment","onStop2");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragment","onDestroyView2");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragment","onDestroy2");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragment","onDetach2");
    }
}

