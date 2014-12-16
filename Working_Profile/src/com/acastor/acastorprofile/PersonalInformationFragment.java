package com.acastor.acastorprofile;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PersonalInformationFragment extends Fragment {
	
	public PersonalInformationFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_personal_information, container, false);
        
        TextView tvApplicationLetter = (TextView) rootView.findViewById(R.id.personal_info_text);
        tvApplicationLetter.setMovementMethod(new ScrollingMovementMethod());
        String sourceString = 
        		
        		"<h3><b>NAME: </b>Anthony A. Castor</h3><br/>" +
        		"<b>Address</b>: BRGY. 522 ZONE 52 DIST. IV, MANILA 861B KUNDIMAN ST.<br/>" +
        		"<b>Contact Number</b>: 09156084040<br/>" +
        		"<b>Email</b>: dev.anthonycastor@gmail.com<br/><br/><br/>" +
        		
        		"<b>Birthday</b>: September 15, 1990<br/>" +
        		"<b>Age</b>: 24<br/>"+
        		"<b>Marital Status</b>	: Single <br/>"+
        		"<b>Mother’s Name</b> : Ma. Perlita Castor<br/> "+
        		"<b>Father’s Name</b>: Henry Castor <br/>"+
        		"<b>Religion</b>: Roman Catholic<br/> "+
        		"<b>Language Spoken</b>: Chavacano, English, Tagalog<br/><br/><br/>" +
        		"<h5>STRENGTHS:</h5>" +
        		"•	Good listener with outgoing, friendly demeanor and constantly maintains positive attitude towards work<br/>" +
        		"•	Goal oriented, flexible and willing to learn new things.<br/>"+
        		"•	Produces quality work even under pressure.<br/>" +
        		"•	Ambitious and hardworking with commitment to excellence.<br/>"+
        		"•	Team player.<br/>" +
        		"•	Proficient in MS office applications.<br/>" +
        		"•	Background in ERP Software (Navision, SQL and alike).<br/>" +
        		"•	Exp. In Deferent Computer programming language<br/>" +
        		"•	Exp. In Computer Repair<br/>" +
        		"•	Up to date in the current trend of technology<br/><br/>" +
        		"<h5>EDUCATION:</h5>" +
        		"2007-2013	Western Mindanao State University,BS Computer Science Major in Software Technology<br/><br/>" +
        		"2003 – 2007	Zamboanga National High School<br/><br/>" +
        		"1997 – 2003 	East Central School (Elementary)<br/>"; 
        		tvApplicationLetter.setText(Html.fromHtml((sourceString)));
        return rootView;
    }
}
