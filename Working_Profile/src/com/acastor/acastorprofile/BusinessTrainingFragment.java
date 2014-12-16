
package com.acastor.acastorprofile;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BusinessTrainingFragment extends Fragment {
	
	public BusinessTrainingFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_business_training, container, false);
        TextView tvApplicationLetter = (TextView) rootView.findViewById(R.id.business_training_text);
        tvApplicationLetter.setMovementMethod(new ScrollingMovementMethod());
        String sourceString = 
        		
        		"<h4>BUSINESS TRAINING AND PRACTICES</h4><br/>" +
        		"<b>Software</b>: VMware, SQL Server, SharePoint, Microsoft Dynamics NAV 2009, Windows Server and Active Directory, Samba Server, FTP Server, LAMPP, XAMPP, MAMPP <br/><br/>" +
        		"<b>Hardware</b>:  Cisco Routers and Switches, Servers Hardware, Desktop PC, MacBook(pro) and MAC <br/><br/>" +
        		"<b>Firewall</b>: Untangle and Checkpoint Secure Platform, Fortinet 80C<br/><br/>" +
        		"<b>Practice</b>: Work Documentation Practices(Work History, Changes, Approval and Implementation) <br/><br/>" +
        		"<b>Ethical hacking And Penetration Testing</b>: Metasploit, SolarWinds Engineer's Toolset and Kali Linux<br/><br/>" +
        		"<h4>SPECIAL SKILLS: </h4><br/>" +
        		"<b>Programming Languages</b>:C,C++,C#, Java,Basic, HTML5, JQuery, javascript, SQL, Python, QBasic, Perl, Ruby, Assembly, XNA, HTML,  CSS,  PHP and  MySQL, Unity 3d <br/><br/>" +
        		"<b>Multimedia Tools</b>: AdobeFlash ,AdobeFireworks, AdobeIllustrator, AdobeIndesign, Adobe Photoshop, Paint, Movie Maker, Maya, Gimp, 3D Max, ToonBoom,, Blender, HITFILM<br/><br/>" +
        		"<b>Development Tools</b>: Joomla, Dreamweaver,visual studio, Dreamweaver, Unity 3D, Facebook Programming, Real Studio<br/><br/>" +
        		"<b>Technical Skill</b>: Computer repair, Computer reprogram, Network Management, Cisco Routing and Management, Server Management, VMWare, MS Office, Linux, Mac, COMTIA+, Ethical Hacking, Android<br/><br/>" +
        		"<h4>SELF STUDY TRAINING: </h4><br/>" +
        		"<b>Cisco Training For Certification</b>:CCDA Network Design, CCDP Network Design, CCIE Profecional Advance, CCNA_640-802 intro to cisco, CCNP Network Profecional, CCSP network security complete, CCVP VoIP Vouce over IP complete<br/><br/>" +
        		"<b>Wireless Network Training For Certification</b>:CWNP CWNA PW0 100, CWNP Wireless# PW0 050, CWNE_PW0-300, CWTS_PW0-070<br/><br/>" +
        		"<b>Linux Training For Certification</b>: Ubuntu OS, Fedora OS, Mint OS, Open SUSE<br/><br/>" +
        		"<br/><br/>"; 
        		tvApplicationLetter.setText(Html.fromHtml((sourceString)));
        return rootView;
    }
}
