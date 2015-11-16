package cn.shellc.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;

public class MainActivity extends Activity {

	private TextView resultView;
	private float fstnum,secnum,resultnum;
	private NumButton[] numBtns;
	private CommButton[] commBtns;
	private int[] btnIDs={R.id.btn_0,R.id.btn_1,R.id.btn_2,R.id.btn_3,R.id.btn_4,R.id.btn_5,R.id.btn_6,R.id.btn_7,R.id.btn_8,R.id.btn_9,R.id.btn_dot,R.id.btn_jia,R.id.btn_jian,R.id.btn_cheng,R.id.btn_chu,R.id.btn_deng,R.id.btn_del,R.id.btn_clear};
	private class NumButton extends Button {
		public NumButton(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}

		public void setOnClickListener(OnClickListener l) {
			// TODO Auto-generated method stub
			
			if(resultView.getText()=="0")
			{
				resultView.setText(this.getText());
			}else{
				resultView.setText(resultView.getText().toString()+this.getText().toString());
			}			
			secnum=Float.parseFloat(resultView.getText().toString());					
			super.setOnClickListener(l);
		}
	}
	
	private class CommButton extends Button{
		public CommButton(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}
		
		public void setOnClickListener(OnClickListener l) {
			// TODO Auto-generated method stub
			switch(this.getId())
			{
				case R.id.btn_jia:
					resultnum=fstnum+secnum;
					fstnum=secnum;
					break;
				case R.id.btn_jian:
					break;
				case R.id.btn_cheng:
					break;
				case R.id.btn_chu:
					break;
				case R.id.btn_dot:
					break;
				case R.id.btn_deng:
					break;
				case R.id.btn_del:
					break;
				case R.id.btn_clear:
					break;
				default:
					break;			
			}			
			super.setOnClickListener(l);
		}
	}
	
	private class ResultButton extends Button{

		//@Override
		public ResultButton(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}
		
		public void setOnClickListener(OnClickListener l) {
			// TODO Auto-generated method stub
			super.setOnClickListener(l);
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		resultView = (TextView) findViewById(R.id.resultView);
		resultView.setText("0");
		fstnum=1;	secnum=0;	resultnum=0;
		InitButton();		
	}

	private void InitButton() {
		numBtns=new NumButton[11];
		commBtns=new CommButton[7];
		for(int i=0;i<11;i++)
		{
			numBtns[i]=(NumButton) findViewById(btnIDs[i]);			
		}
		
		for(int i=0;i<7;i++)
		{
			commBtns[i]=(CommButton) findViewById(btnIDs[i+11]);
		}		
	}

	
	

}
