package com.acastor.bible_quiz_whoswho;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CreaditFragment extends Fragment {
	
	public CreaditFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_creadit, container, false);
         
        return rootView;
    }
}
