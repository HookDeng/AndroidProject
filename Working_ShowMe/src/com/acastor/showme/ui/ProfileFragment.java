package com.acastor.showme.ui;

import android.R.bool;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.acastor.showme.R;
import com.parse.ParseQuery;
import com.parse.ParseUser;

public class ProfileFragment extends Fragment {

	public static final String TAG = ProfileFragment.class.getSimpleName();

	protected EditText mUsername;
	protected EditText mPassword;
	protected EditText emailAddress;
	protected Button profile_Save_Button;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.user_profile, container,
				false);
		// get the text edit
		mUsername = (EditText) rootView.findViewById(R.id.usernameField);
		mPassword = (EditText) rootView.findViewById(R.id.passwordField);
		emailAddress = (EditText) rootView.findViewById(R.id.emailField);
		profile_Save_Button = (Button) rootView.findViewById(R.id.profile_Save);
		
		SaveProfile();
		
		return rootView;
	}

	private void SaveProfile() 
	{
		// save password
		profile_Save_Button.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View v) {
				DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() 
				{
					@Override
					public void onClick(DialogInterface dialog, int which)
					{
						ParseUser currentUser = ParseUser.getCurrentUser();							
						String username = mUsername.getText().toString();
						String password = mPassword.getText().toString();
						
						username = username.trim();
						password = password.trim();
						boolean isUsername = false;
						boolean isUsernameChange = false;
						
						switch (which) {
						case DialogInterface.BUTTON_POSITIVE:
							// Yes button clicked
							
							
							if (username.isEmpty()) 
							{
								AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
								builder.setMessage(R.string.savingprofile_username_error_message)
									.setTitle(R.string.savingprofile_username_error_title)
									.setPositiveButton(android.R.string.ok, null);
								AlertDialog dialogError = builder.create();
								dialogError.show();
							}
							else
							{
								//checking if user already exist
								ParseQuery<ParseUser> queryuserlist = ParseUser.getQuery();
						        queryuserlist.whereEqualTo("username", username);
						        try {
						            //attempt to find a user with the specified credentials.
						        	if (queryuserlist.count() != 0) 
						        	{
						        		// not available
						        		isUsername = true;
						            }
						            else
						            {
						            	//available
						            	isUsername = false;
						            }
						            
						        } 
						        catch (com.parse.ParseException e) 
						        {
									e.printStackTrace();
								}
							}
							break;

						case DialogInterface.BUTTON_NEGATIVE:
							// No button clicked
							break;
						}
						
						//checking if username is change
						String currentUsername = currentUser.getUsername().toString();
						if(currentUsername == username)
						{
							isUsernameChange = false;
						}
						else
						{
							isUsernameChange = true;
						}
						
						//saving if isUsername is true or isUsernameChange is true
						if(isUsername == false || isUsernameChange == true)
						{
							currentUser.setUsername(username);
							
							if (!password.isEmpty()) {
								currentUser.setPassword(password);
								currentUser.saveInBackground();
							}
							else
							{
								currentUser.saveInBackground();
							}
							
							AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
							builder.setMessage(R.string.savingprofile_message)
								.setTitle(R.string.savingprofile_title)
								.setPositiveButton(android.R.string.ok, null);
							AlertDialog dialogInfo = builder.create();
							dialogInfo.show();
							
						}
					}
				};
				
				
				
				AlertDialog.Builder builder = new AlertDialog.Builder(
						getActivity());
				builder.setMessage("Are you sure you want to save the changes?")
						.setPositiveButton("Yes", dialogClickListener)
						.setNegativeButton("No", dialogClickListener).show();
			}
		});
	}

	@Override
	public void onResume() {
		super.onResume();
		// get the id of the user
		ParseUser currentUser = ParseUser.getCurrentUser();
		// deplay the name of the user
		String lUsername = currentUser.getUsername().toString();
		mUsername.setText(lUsername);

		// deplay the password of the user
		String lEmailAddress = currentUser.getEmail().toString();
		emailAddress.setText(lEmailAddress);
		emailAddress.setKeyListener(null);
	}

}
