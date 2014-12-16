package com.acastor.test_quiz_sql;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
	List<Question> quesList;
	int score = 0;
	int qid = 0;
	Question currentQ;
	TextView txtQuestion;
	RadioButton rda, rdb, rdc;
	Button butNext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DbHelper db = new DbHelper(this);
		quesList = db.getAllQuestions();
		currentQ = quesList.get(qid);
		txtQuestion = (TextView) findViewById(R.id.textView1);
		rda = (RadioButton) findViewById(R.id.radio0);
		rdb = (RadioButton) findViewById(R.id.radio1);
		rdc = (RadioButton) findViewById(R.id.radio2);
		butNext = (Button) findViewById(R.id.button1);
		setQuestionView();

		butNext.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup1);
				RadioButton answer = (RadioButton) findViewById(grp
						.getCheckedRadioButtonId());
				if (currentQ.getANSWER().equals(answer.getText())) {
					score++;
				}
				currentQ = quesList.get(qid);
				setQuestionView();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void setQuestionView() {
		txtQuestion.setText(currentQ.getQUESTION());
		rda.setText(currentQ.getOPTA());
		rdb.setText(currentQ.getOPTB());
		rdc.setText(currentQ.getOPTC());
		qid++;
	}
}
