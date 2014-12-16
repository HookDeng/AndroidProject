package com.acastor.bible_quiz_whoswho.sql;
import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DbHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "triviaQuiz";
	// tasks table name
	private static final String TABLE_QUEST = "quest";
	// tasks Table Columns names
	private static final String KEY_ID = "id";
	private static final String KEY_QUES = "question";
	private static final String KEY_ANSWER = "answer"; //correct option
	private static final String KEY_OPTA= "opta"; //option a
	private static final String KEY_OPTB= "optb"; //option b
	private static final String KEY_OPTC= "optc"; //option c
	private SQLiteDatabase dbase;
	public DbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		dbase=db;
		String sqlDelete = "DROP TABLE IF EXISTS "+TABLE_QUEST;
		db.execSQL(sqlDelete);
		String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
				+KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
		db.execSQL(sql);		
		addQuestions();
		//db.close();
	}
	private void addQuestions()
	{
		//New Testament
		Question q1=new Question("Who was the mother of Jesus? (Matthew 1:18)","Martha", "Anna", "Mary", "Mary");
		this.addQuestion(q1);
		Question q2=new Question("Who did Jesus raise from the dead? (John 11:43)", "Peter", "Lazarus", "James", "Lazarus");
		this.addQuestion(q2);
		Question q3=new Question("Who baptized Jesus? (Matthew 3:13)","John", "Joseph","Saul","John");
		this.addQuestion(q3);
		Question q4=new Question("Who tried to dispose of baby Jesus by making a decree that all baby boys should be killed? (Matthew 2:16)",
								"Augustus", "Herod", "Pharaoh","Herod");
		this.addQuestion(q4);
		Question q5=new Question("Who was Jesus' stepfather? (Luke 1:27)","Peter","Zechariah","Joseph","Joseph");
		this.addQuestion(q5);
		Question q6=new Question("Which apostle led Christ's church after Jesus was killed? (Matthew 16:18)","Thomas","Lazarus","Peter","Peter");
		this.addQuestion(q6);
		Question q7=new Question("Which apostle betrayed Jesus with a kiss for money? (Luke 22:48)","Luke","Judas","Timothy","Judas");
		this.addQuestion(q7);
		Question q8=new Question("Who was converted on the road to Damascus and later became one of the greatest missionaries in the New Testament? (Acts 8:22)",
				"Lazarus","Saul/Paul","John","Saul/Paul");
		this.addQuestion(q8);
		Question q9=new Question("Who would not believe that Jesus was resurrected until he saw Him with his own eyes? (John 20:28)",
				"Thomas","Lazarus","Joseph","Thomas");
		this.addQuestion(q9);
		Question q10=new Question("Who atoned, suffered, was crucified, and was resurrected for all mankind, making Him the Savior? (John 20:31)",
				"Jesus Christ","John","James","Jesus Christ");
		this.addQuestion(q10);
		
		//Old Testament
		Question q11=new Question("Who was the first man created on earth? (Genesis 2:19)",
				"Adam","Moses","Noah","Adam");
		this.addQuestion(q11);
		Question q12=new Question("Who was the first woman created on earth? (Genesis 3:20)",
				"Eve","Rebekah","Rachel","Eve");
		this.addQuestion(q12);
		Question q13=new Question("Who built an ark to survive the great flood? (Genesis 6:13)",
				"Samson","Noah","Isaac","Noah");
		this.addQuestion(q13);
		Question q14=new Question("Who parted the Red Sea and helped the children of Israel escape from Egypt? (Exodus 14:21)",
				"Elijah","Naaman","Moses","Moses");
		this.addQuestion(q14);
		Question q15=new Question("Who was the first murderer? (Genesis 4:8)",
				"Cain","Abraham","Moses","Cain");
		this.addQuestion(q15);
		Question q16=new Question("Who sold the birthright to his brother for a meal? (Genesis 25:34)",
				"Zedekiah","Esau","Moses","Esau");
		this.addQuestion(q16);
		Question q17=new Question("Whose name was changed to 'Israel'? (Genesis 32:28)",
				"Adam","Jacob","Zedekiah","Jacob");
		this.addQuestion(q17);
		Question q18=new Question("Who is taken captive into Egypt, becomes a ruler, and later saves the country from famine? (Genesis 41:41)",
				"Joseph","Jacob","Zedekiah","Joseph");
		this.addQuestion(q18);
		Question q19=new Question("Who becomes the leader of the children of Israel following Moses' death and brings them to the promised land? (Deuteronomy 34:9)",
				"Joshua","Daniel","Naaman","Joshua");
		this.addQuestion(q19);
		Question q20=new Question("Who had incredible strength until his hair was cut? (Judges 16:6)",
				"Israel","Samson","Naaman","Samson");
		this.addQuestion(q20);
		Question q21=new Question("Who could interpret King Nebuchadnezzar's dream and later was delivered by God from a den of lions? (Daniel 6:23)",
				"Jacob","Daniel","Naaman","Daniel");
		this.addQuestion(q21);
		Question q22=new Question("Who received the ability to interpret visions and dreams because he refused to eat the king's rich food? (Daniel 1:17)",
				"Shadrach","Daniel","Meshach","Daniel");
		this.addQuestion(q22);
		Question q23=new Question("Who killed the giant Philistine, Goliath, and saved Israel from captivity? (1 Samuel 17:50)",
				"Shadrach","Jeroboam","David","David");
		this.addQuestion(q23);
		Question q24=new Question("Which Jew married the king of Persia and bravely convinced him to reverse the decree calling for the destruction of her people? (Esther 8:3)",
				"Esther","Rachel","Sarai","Esther");
		this.addQuestion(q24);
		Question q25=new Question("Who lost his riches, health, friends, and family, but remained faithful to God in his afflictions? (Job 19)",
				"Esther","Nehemiah","Job","Job");
		this.addQuestion(q25);
		
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
		// Create tables again
		onCreate(db);
	}
	// Adding new question
	public void addQuestion(Question quest) {
		//SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_QUES, quest.getQUESTION()); 
		values.put(KEY_ANSWER, quest.getANSWER());
		values.put(KEY_OPTA, quest.getOPTA());
		values.put(KEY_OPTB, quest.getOPTB());
		values.put(KEY_OPTC, quest.getOPTC());
		// Inserting Row
		dbase.insert(TABLE_QUEST, null, values);		
	}
	public List<Question> getAllQuestions() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		dbase=this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(selectQuery, null);
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quesList.add(quest);
			} while (cursor.moveToNext());
		}
		// return quest list
		return quesList;
	}
	public int rowcount()
	{
		int row=0;
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		row=cursor.getCount();
		return row;
	}
}
