package com.acastor.acastorprofile;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProsApacFragment extends Fragment {
	
	public ProsApacFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_pros_apac, container, false);
         
        TextView tvApplicationLetter = (TextView) rootView.findViewById(R.id.pros_apac_info);
        tvApplicationLetter.setMovementMethod(new ScrollingMovementMethod());
        String sourceString = 
        		
        		"<h4>I.T. Administrators</h4>" +
        		"PROS-APAC Corporation<br/>" +
        		"Suite 615 Don Santiago Bldg., 1344 Taft Ave., Ermita, Manila Philippines <br/><br/><br/>" +
        		
        		"<b>Duties and Responsibilities: </b><br/><br/>" +
        		"Install, configure, and maintain physical and software network infrastructure<br/>" +
        		"•	Cabling and crimping of all networkable devices.<br/>" +
        		"•	Proper configuration of network switches, routers and wireless access points.<br/>" +
        		"•	Setting up proper Internet Protocol (II’) configuration for all networkable devices <br/>" +
        		"•	Wireless-fidelity (WiFi) stability and security.<br/><br/><br/>"+
        		
				"<b>Server Administration: </b><br/><br/>" +
				"•	Installing and maintaining a Microsoft Windows Server (2008 or later) environment.<br/>" +
				"•	Operating MS SQL Server 2005 (or later), adding and modifying users for the office’s ERP software<br/>" +
				"•	Ensuring proper configuration of DNS settings and Active Directory (AD) propagation.<br/>" +
				"•	Set up scheduled backups for the server (including SQL data from MSSQL 2005)<br/>" +
				"•	Maintain NAS and other quasi-server devices.<br/><br/><br/>"+
				
				"<b>Purchasing, Configuration and Maintenance of existing workstations : </b><br/><br/>" +
				"•	Installation/reinstallation of OS in workstations<br/>" +
				"•	Configuration of OS to connect to the server to access various internal and External network resources.<br/>" +
				"•	Installation and customization of applications in a workstation.<br/>" +
				"•	Backing up of company data (e.g. locally-stored emails and calendar entries) in workstations.<br/>" +
				"•	Ensure that all programs and software drivers are up-to-date.<br/>" +
				"•	Upgrading and configuration of computer hardware, which includes workstation self-assembly.<br/><br/><br/>" +
				
				"<b>Firewall and filtering:</b><br/><br/>" +
				"•	Configure and maintain a dedicated firewall or proxy server<br/>" +
				"•	Prevent unnecessary user access to blocked domains or locations as stipulated by administration; block off potentially harmful data packets from entering the network.<br/>" +
				"•	Filter out obvious keywords that can potentially be handful or deemed unnecessary by administration.<br/>" +
				"•	Monitor data packets for exceptions that seem to be bypassing the firewall.<br/><br/><br/>" +

				"<b>Email Administration : </b><br/><br/>" +
				"•	Create, modify, and delete email accounts for users.<br/>" +
				"•	Configure email accounts on workstations (such as email clients) or devices (such as smart phones, etc.)<br/>" +
				"•	Assist users in password recovery in case of lost or forgotten passwords.<br/><br/><br/>" + 
				
				"<b>Network Printer Administration : </b><br/><br/>" +
				"•	Adding, modifying and deleting printer users.<br/>" +
				"•	Notifying and tallying printer usage per department <br/>" +
				"•	Setting up print quotas per user/department <br/>" +
				"•	Submitting monthly printer usage reports to printer supplier.<br/><br/><br/>"+
				
				
				"<b>IT Consultation and Administration : </b><br/><br/>" +
				"•	Recommendation on purchasing new IT-related equipment to administration<br/>" +
				"•	Being up-to-date on latest hardware and software in the information technology industry.<br/>" +
				"•	Instill proper and responsible use of IT-related equipment to users (such as recommending IT-related policies for users).<br/>" +
				"•	Studying and testing upcoming technologies that may be beneficial to the company.<br/><br/><br/>" +
				
				
				"<b>Text Support : </b><br/><br/>" +
				"•	Giving a hands-on Tutorial to employee<br/>" +
				"•	Providing information on how to fix a computer problem<br/>" +
				"•	Creating an IT documentation<br/><br/><br/>"+
				
				
				"<b>Biometrics  : </b><br/><br/>" +
				"•	Adding, modifying and deleting users <br/>" +
				"•	Maintenance of the Biometrics <br/>" +
				"•	Troubleshoot biometrics problem <br/><br/><br/>";
        		tvApplicationLetter.setText(Html.fromHtml((sourceString)));
        
        return rootView;
    }
}
