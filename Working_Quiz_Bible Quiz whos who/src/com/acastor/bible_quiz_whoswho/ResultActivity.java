package com.acastor.bible_quiz_whoswho;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		// get rating bar object
		RatingBar bar = (RatingBar) findViewById(R.id.ratingBar1);
		Button btnBackhome = (Button) findViewById(R.id.backhome);
		bar.setNumStars(5);
		bar.setStepSize(0.5f);
		// get text view
		TextView t = (TextView) findViewById(R.id.textResult);
		// get score
		Bundle b = getIntent().getExtras();
		int score = b.getInt("score");
		int barRating = 0;

		if (score >= 0 && score < 8) {
			t.setText("Oopsie! You can try again!\nYour Score: " + score);
			barRating = 1;
		} else if (score >= 8 && score < 13) {
			t.setText("Oopsie! You can try again!\nYour Score: " + score);
			barRating = 2;
		} else if (score >= 13 && score < 16) {
			t.setText("Oopsie! You can try again!\nYour Score: " + score);
			barRating = 3;
		}

		else if (score >= 16 && score < 19) {
			t.setText("Nice.. Someone's been reading the BIBLE\nYour Score: "
					+ score);
			barRating = 4;
		}

		else if (score >= 19) {
			t.setText("Who are you? Walking BIBLE???\nYour Score: " + score);
			barRating = 5;
		}
		// display score
		bar.setRating(barRating);
		btnBackhome.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ResultActivity.this,
						MainActivity.class);
				startActivity(intent);
			}
		});
	}
}
