package com.acastor.acastorprofile;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ApplicationLetterFragment extends Fragment {
	
	public ApplicationLetterFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_application_letter, container, false);
        
        TextView tvApplicationLetter = (TextView) rootView.findViewById(R.id.personal_info_text);
        tvApplicationLetter.setMovementMethod(new ScrollingMovementMethod());
        String sourceString = 
        		
        		"Date Septembers 27, 2014<br/><br/>" +
        		"Dear Ma’am / Sir, <br/><br/>" +
        		"I am writing to express my interest in your current opening for an I.T. Manager Please accept my resume for your consideration. I have focused my career into Information Technology, and I am looking for an organization in which to apply my enthusiasm for I.T. Manager.<br/><br/>" +
        		"What I bring to the position is a combination of quality I.T. Services, Team Leadership and attention to detail. I work diligently to provide excellence in all my professional endeavors and have earned a reputation for my technical proficiency and results-drivenwork ethics. In my previous positions I worked to provide excellence in service to the Company. I would continue do the same for your organization.<br/><br/>" +
        		"My resume, which I have enclosed for your review, contains additional details about my professional accomplishments. I look forward to the opportunity to meet with you to discuss the qualifications I would bring to your organization. Thank you for your consideration.<br/><br/><br/>" +
        		"Sincerely,<br/>" +
        		"Anthony A. Castor<br/>"  ; 
        		tvApplicationLetter.setText(Html.fromHtml((sourceString)));
        return rootView;
    }
}
