package com.acastor.bible_quiz_whoswho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.acastor.bible_quiz_whoswho.sql.DbHelper;
import com.acastor.bible_quiz_whoswho.sql.Question;

public class HomeFragment extends Fragment {

	public HomeFragment() {
	}

	List<Question> quesList;
	int score = 0;
	int qid = 0;
	Question currentQ;
	TextView txtQuestion;
	RadioButton rda, rdb, rdc;
	Button butNext;

	Random randomGenerator = new Random();
	int randomInt;
	int Qcountdown = 0;
	ArrayList<Integer> number;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		final View rootView = inflater.inflate(R.layout.fragment_home,
				container, false);
		//generate Rundom list number
		number = new ArrayList<Integer>();
		for (int i = 0; i <= 24; ++i) number.add(i);
		Collections.shuffle(number);
		
		
		DbHelper db = new DbHelper(getActivity());
		quesList = db.getAllQuestions();
		currentQ = quesList.get(qid);
		txtQuestion = (TextView) rootView.findViewById(R.id.textView1);
		rda = (RadioButton) rootView.findViewById(R.id.radio0);
		rdb = (RadioButton) rootView.findViewById(R.id.radio1);
		rdc = (RadioButton) rootView.findViewById(R.id.radio2);
		butNext = (Button) rootView.findViewById(R.id.button1);
		
		//set the question
		setQuestionView();
		butNext.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				RadioGroup grp = (RadioGroup) rootView
						.findViewById(R.id.radioGroup1);
				RadioButton answer = (RadioButton) rootView.findViewById(grp
						.getCheckedRadioButtonId());
				Log.d("yourans", currentQ.getANSWER() + " " + answer.getText());
				if (currentQ.getANSWER().equals(answer.getText())) {
					score++;
					Log.d("score", "Your score" + score);
				}
				if (Qcountdown < 25) {
					//currentQ = quesList.get(qid);
					setQuestionView();
				} else {
					Intent intent = new Intent(getActivity(),
							ResultActivity.class);
					Bundle b = new Bundle();
					b.putInt("score", score); // Your score
					intent.putExtras(b); // Put your score to your next Intent
					startActivity(intent);
					getActivity().finish();
				}
			}
		});

		return rootView;
	}

	private void setQuestionView()
	{
		//checkListnumber();
		currentQ = quesList.get(number.get(Qcountdown));
		
		txtQuestion.setText(currentQ.getQUESTION());
		rda.setText(currentQ.getOPTA());
		rdb.setText(currentQ.getOPTB());
		rdc.setText(currentQ.getOPTC());
		
		//qid++;
		Qcountdown++;
	}
	
	private void checkListnumber(){
		if(Qcountdown == 0){
			currentQ = quesList.get(number.get(0));
		}
		
		if(Qcountdown == 1){
			currentQ = quesList.get(number.get(1));
		}
		
		if(Qcountdown == 2){
			currentQ = quesList.get(number.get(2));
		}
		
		if(Qcountdown == 3){
			currentQ = quesList.get(number.get(3));
		}
		
		if(Qcountdown == 4){
			currentQ = quesList.get(number.get(4));
		}
		if(Qcountdown == 5){
			currentQ = quesList.get(number.get(5));
		}
		
		if(Qcountdown == 6){
			currentQ = quesList.get(number.get(6));
		}
		
		if(Qcountdown == 7){
			currentQ = quesList.get(number.get(7));
		}
		
		if(Qcountdown == 8){
			currentQ = quesList.get(number.get(8));
		}
		
		if(Qcountdown == 9){
			currentQ = quesList.get(number.get(9));
		}
		
	}

}
