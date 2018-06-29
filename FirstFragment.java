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
 * Created by Manoj on 6/7/2018.
 */

public class FirstFragment extends Fragment{
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragment","onAttach");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Fragment","onCreate");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.first_fragment,container,false);
        Log.e("Fragment","onCreateView");

        Button button=(Button)view.findViewById(R.id.pop_up);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // showDialog();

                Fragment fragment=new SecondFragment();
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
        Log.e("Fragment","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Fragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragment","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragment","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragment","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragment","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragment","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragment","onDetach");
    }
}
