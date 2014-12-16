package com.acastor.acastorprofile;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PascualTradingFragment extends Fragment {
	
	public PascualTradingFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_pascual_trading, container, false);
         
        TextView tvApplicationLetter = (TextView) rootView.findViewById(R.id.pascual_trading_info);
        tvApplicationLetter.setMovementMethod(new ScrollingMovementMethod());
        String sourceString = 
        		
        		"<h4>Social Media Manager/I.T.</h4>" +
        		"E.Pascual Trading<br/>" +
        		"1831 B Carba Bldg. C. M. Recto Avenue, Sampaloc Manila, Philippines <br/><br/><br/>" +
        		
        		"<b>Duties and Responsibilities: </b><br/><br/>" +
        		"Products Sales<br/>" +
        		"•	Posting of Products in Company Website <br/>" +
        		"•	Posting of Ads in other Website<br/><br/>" +
        		
        		"Product Marketing <br/>" +
        		"•	Marketing the product on Facebook, Instagram, Google+, Tweetter , Email.<br/>" +
        		"•	Creating design for marketing leaflet, Poster, Logo etc.<br/>" +
        		"•	Advising for future marketing strategy for the company<br/><br/>" +
        		
        		"IT Consultation and Administration<br/>" +
        		"•	Recommendation on purchasing new IT-related equipment to administration<br/>" +
        		"•	Being up-to-date on latest hardware and software in the information technology industry.<br/>" +
        		"•	Studying and testing upcoming technologies that may be beneficial to the company.<br/>" +
        		"•	Update of the Company Website<br/><br/>" +
        		
        		"Others Task<br/>" +
        		"•	Greet customer entering the office<br/>" +
        		"•	Good leadership skills and the ability to lead by example<br/>" +
        		"•	Give the type of respect you should be given to a customer and co-workers<br/>" +
        		"•	Maintaining network and communication systems, includes coordinating and repairing information technology equipment, servers and database. Install and configure network, desktop hardware and other electronic communications equipment<br/>" +
        		"•	Responsible for conceptualization and design of graphic applications such as collateral material, environmental graphics, multimedia interfaces, from concept to completion<br/>" +
        		"•	Prepares artworks requested by the company owner including brochures, forms graphs and display, provides creative services i.e. graphic design, slide lay-out and display design needed for the sales, publication and advertisement of company’s product<br/>" +
        		"•	Responsible for all technical error, loading new software and systems on existing equipment.<br/>" +
        		"•	Ensure that all programs and software drives are up-to-date<br/>" +
        		"•	Submit your daily ads with text and design to the company owner, prior to your posting for approval.<br/>" +
        		"•	Ability to stand and perform work duties for an extended period of time<br/>" +
        		"•	Other related duties as assigned.<br/>" +
        		"<br/><br/>";
        		tvApplicationLetter.setText(Html.fromHtml((sourceString)));
        
        return rootView;
    }
}
