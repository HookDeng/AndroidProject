package com.acastor.acastorprofile;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ImmersiveMediaFragment extends Fragment {
	
	public ImmersiveMediaFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_immersive_media, container, false);
        
        TextView tvApplicationLetter = (TextView) rootView.findViewById(R.id.immersive_media_text);
        tvApplicationLetter.setMovementMethod(new ScrollingMovementMethod());
        String sourceString = 
        		
        		"<h4>Network and Systems Administrator / Front End Developer</h4>" +
        		"Milk Communication / Immersive Media<br/>" +
        		"A-52,191 Zeta Bldg., Salcedo St. Legaspi Village, Makati City, Philippines<br/><br/><br/><br/>" +
				
				"<b>Duties and Responsibilities: </b><br/><br/><br/>" +
				"<h5>Job Description for Network and Systems Administrator:</h5><br/><br/>" +
				"<b>Responsibilities:</b><br/><br/>" +
				"A highly motivated systems and network administrator who is responsible for the ongoing configuration and support of the organization’s infrastructure. Maintains computing environment by identifying network requirements; installing upgrades; monitoring network performance.<br/><br/><br/>" +
				"<b>Responsibilities:</b><br/><br/><br/>" +
				"•	Design, implement and maintain LAN and WAN system.<br/><br/>" +
				"•	Budgeting for equipment and assembly costs. <br/><br/>"+
				"•	Providing network administration and support. <br/><br/>" +
				"•	Assembling new systems. <br/><br/>" +
				"•	Secures network by developing network access, monitoring, control and evaluation; maintaining documentation. <br/><br/>" +
				"•	Protects organization’s value by keeping information confidential.<br/><br/>" +
				"•	Maintain servers through daily or weekly routine backups and quarterly maintenance.<br/><br/>" +
				"•	Manages and monitors software licenses.<br/><br/><br/>" +
				
				"<b>Qualifications:</b><br/><br/><br/>" +
				"•	Routing and switching, LAN troubleshooting, configure DCHP and TCP/IP, support firewall security same with the load balancers, and bandwidth monitoring and exposure (FORTIGATE)<br/><br/>" +
				"•	Familiarity with Linux environment (shell scripting, cron jobs, FTP, SSH, Samba Server, MySQL) <br/><br/>" +
				"•	Experience with HTTP and web based applications.<br/><br/>" +
				"•	<b>Certifications</b><br/><br/>" +
				"	o	CCNA and/or CCNP are desired. <br/><br/>" +
				"	o	Fortinet Certified Network Security Administrator	(optional)<br/><br/>" +
				"	o	Fortinet Certified Network Security Professional	(optional)<br/><br/><br/><br/>" +
				
				
				"<h5>Job Description for Front End Developer Requirements:</h5><br/><br/>" +
				"<b>Responsibilities:</b><br/><br/>" +
				"•	Work in collaboration with product designers and business owners to ensure the best user experience for the application.<br/><br/>" +
				"•	Maintain and modernize existing legacy tools.<br/><br/>"+
				"•	Familiar with responsive design principles. Influence design for mobile devices and product designers and support with responsive design implementation.<br/><br/>" +
				"•	Write, unit test, and integrate code. <br/><br/>" +
				"•	Maintain an updated knowledge of current technologies and techniques.<br/><br/>" +
				"•	Create associated technical lead role for specific projects and/or releases. <br/><br/>" +
				"•	Able to voice out concerns and suggestions at any time regarding development of applications or anything helpful for the team.<br/><br/>" +
				"•	Attention to detail and problem-solving skills.<br/><br/>" +
				"•	The desire to work in a team-driven environment.<br/><br/><br/>" +
				
				"<b>Qualifications:</b><br/><br/><br/>" +
				"•	Knowledge of at least one of the following Programming Languages:<br/><br/>" +
				"	o	Objective-C (iOS app) <br/><br/>" +
				"	o	Java (android app)<br/><br/>" +
				"	o	HTML5<br/><br/>" +
				"	o	Flash/AS3<br/><br/>" +
				"	o	Javascript/Jquery/Ajax<br/><br/>" +
				"•	Familiarity with the following concepts:<br/><br/>" +
				"	o	Object-Oriented Programming (OOP)<br/><br/>" +
				"	o	Model-View-Controller methodology (MVC)<br/><br/>" +
				"	o	Delegate methodology<br/><br/>" +
				"•	Knowledge of Mobile and Web development skills.<br/><br/>" +
				"•	Ability to develop for cross-browser compatibility.<br/><br/>" +
				"•	Familiarity with SQL and/or databases such as MySQL , SQLite and/or MS SQL  (a plus but not required)<br/><br/>" +
				"•	An eye for usability along with a basic knowledge of graphic design software such as Adobe Photoshop and/or Adobe Illustrator. (a plus but not required)<br/><br/>" +
				"•	Tech Savy(a plus but not required)<br/><br/>" +
				"•	Willing to work extra hours to complete deadlines.<br/><br/>" +
				"<br/><br/>";
        		tvApplicationLetter.setText(Html.fromHtml((sourceString)));
        
        
        return rootView;
    }
}
