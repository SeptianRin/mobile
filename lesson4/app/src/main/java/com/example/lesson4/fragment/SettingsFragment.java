package com.example.lesson4.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson4.R;

public class SettingsFragment extends Fragment {
    private static final String ARG_PARAM1 = "params1";
    private static final String ARG_PARAM2 = "params2";

    private String mParam1;
    private String mParam2;

    private SettingsFragment.OnFragmentInteractionListener mListener;

    public  SettingsFragment(){
        //empty public constructor
    }

    public static SettingsFragment newInstance(String param1, String param2){
        SettingsFragment fragment = new SettingsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1,param1);
        args.putString(ARG_PARAM2,param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (getArguments() != null){
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_settings,container,false);

    }

    public void onButtonPressed(Uri uri){
        if (mListener!= null){
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if (context instanceof SettingsFragment.OnFragmentInteractionListener){
            mListener = (SettingsFragment.OnFragmentInteractionListener) context;
        }
        else {
            throw new RuntimeException(context.toString() + "miust implement OnFragmentInteraction");

        }
    }

    @Override
    public void onDetach(){
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener{
        void onFragmentInteraction (Uri uri);
    }
}
