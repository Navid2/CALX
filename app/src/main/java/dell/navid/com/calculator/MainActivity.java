package dell.navid.com.calculator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

//   √
public class MainActivity extends Activity {
    boolean dt=false;
    int cnt=0,gnum=0,higherthan=0,lowerthan=101;
    public String text="";
    //
    public double anum=0,bnum=0;
    public String op="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("MainActivity","onCreate");
        final TextView tvl= (TextView) findViewById(R.id.textView2);
        tvl.setMovementMethod(new ScrollingMovementMethod());

        final ToggleButton tb = (ToggleButton)findViewById(R.id.toggleButton);
        final TextView tv = (TextView)findViewById(R.id.MainLabel);
        //final TextView tvt = (TextView) findViewById(R.id.TV);
        Button b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum = anum*10 +1;
                if (dt){
                    cnt++;
                }
                anum = anum*Math.pow(10, -cnt);
                INDO(anum,tv);

            }
        });
        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum = anum*10 +2;
                if (dt){
                    cnt++;
                }
                anum = anum*Math.pow(10, -cnt);
                INDO(anum, tv);

            }
        });
        Button b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum = anum*10 +3;
                if (dt){
                    cnt++;
                }
                anum = anum*Math.pow(10, -cnt);
                INDO(anum, tv);

            }
        });
        Button b4=(Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum = anum*10 +4;
                if (dt){
                    cnt++;
                }
                anum = anum*Math.pow(10, -cnt);
                INDO(anum, tv);

            }
        });
        Button b5=(Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum = anum*10 +5;
                if (dt){
                    cnt++;
                }
                anum = anum*Math.pow(10, -cnt);
                INDO(anum, tv);

            }
        });
        Button b6=(Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum = anum*10 +6;
                if (dt){
                    cnt++;
                }
                anum = anum*Math.pow(10, -cnt);
                INDO(anum, tv);

            }
        });
        Button b7=(Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum = anum*10 +7;
                if (dt){
                    cnt++;
                }
                anum = anum*Math.pow(10, -cnt);
                INDO(anum, tv);

            }
        });
        Button b8=(Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum = anum*10 +8;
                if (dt){
                    cnt++;
                }
                anum = anum*Math.pow(10, -cnt);
                INDO(anum, tv);

            }
        });
        Button b9=(Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum = anum*10 +9;
                if (dt){
                    cnt++;
                }
                anum = anum*Math.pow(10, -cnt);
                INDO(anum, tv);

            }
        });
        Button b0=(Button) findViewById(R.id.button10);
        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum = anum*10 ;
                if (dt){
                cnt++;
                }
                anum = anum*Math.pow(10, -cnt);
                INDO(anum, tv);


            }
        });
        Button p=(Button) findViewById(R.id.button11);
        p.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"\n"+anum;
                op="+";
                text=text+"\n"+op;
                bnum = anum;
                anum=0;
                dt = false;
                cnt=0;
                tv.setText(op);
                tvl.setText(text);

            }
        });
        Button mi=(Button) findViewById(R.id.button13);
        mi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"\n"+anum;
                op="-";
                text=text+"\n"+op;
                bnum = anum;
                anum=0;
                dt = false;
                cnt=0;
                tv.setText(op);
                tvl.setText(text);

            }
        });
        Button mul=(Button) findViewById(R.id.button14);
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"\n"+anum;
                op="*";
                text=text+"\n"+op;
                bnum = anum;
                anum=0;
                dt = false;
                cnt=0;
                tv.setText(op);
                tvl.setText(text);

            }
        });
        Button div=(Button) findViewById(R.id.button15);
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"\n"+anum;
                op="÷";
                text=text+"\n"+op;
                bnum = anum;
                anum=0;
                dt = false;
                cnt=0;
                tv.setText(op);

                tvl.setText(text);

            }
        });
        final Button power=(Button) findViewById(R.id.button18);
        power.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text=text+"\n"+anum;
                op=String.valueOf(power.getText());
                text=text+"\n"+op;
                bnum = anum;
                anum=0;
                dt = false;
                cnt=0;
                tv.setText(op);
                tvl.setText(text);

            }
        });
        Button eq=(Button) findViewById(R.id.button16);
        eq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text = text+"\n"+anum;
                switch (op){
                    case "+":anum=bnum+anum;
                        break;
                    case "-":anum=bnum-anum;
                        break;
                    case "*":anum=bnum*anum;
                        break;
                    case "÷":anum=bnum/anum;
                        break;
                    case "^":anum=Math.pow(bnum,anum);
                        break;


                }
                text = text+"\n= "+anum;
                INDO(anum,tv);
                bnum=0;
                dt = false;
                cnt=0;
                op="";
                tvl.setText(text);

            }
        });
        Button AC=(Button) findViewById(R.id.button17);
        AC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText("All Cleared");
                text=text+"\nAll Numbers Cleared";
                anum=0;
                bnum=0;
                op="";
                dt=false;
                cnt=0;
                tvl.setText(text);

            }
        });
        Button dot=(Button) findViewById(R.id.button12);
        dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dt=true;
                cnt=0;
            }
        });
        Button backspace=(Button) findViewById(R.id.button19);
        backspace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                anum=anum/10;
                anum=anum-(anum - (int)anum);
                if (cnt!=0)
                    cnt--;
                INDO(anum,tv);
            }

        });
        final Button sqrt=(Button) findViewById(R.id.button20);
        sqrt.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (tb.isChecked()) {
                    text = text+"\n"+anum+"\n3√";
                    anum = Math.cbrt(anum);
                    text = text+"\n"+anum;
                    INDO(anum, tv);
                }else{
                    text = text+"\n"+anum+"\n3√";
                    anum = Math.sqrt(anum);
                    text = text+"\n"+anum;
                    INDO(anum, tv);

                }
                tvl.setText(text);

            }

        });
        tb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (tb.isChecked()) {
                    text=text+"\n√ Changed to Cube Root";
                    sqrt.setText("3√");
                }else{
                    text=text+"\n√ Changed to Square Root";
                    sqrt.setText("2√");

                }
                tvl.setText(text);
            }

        });
        final Button clear=(Button) findViewById(R.id.button34);
        clear.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                text="";
                tvl.setText("Cleared");

            }

        });

        final Button gotob=(Button) findViewById(R.id.GOTOG);
        gotob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoActivity();

            }

        });


        /*
        Guess Number Activity
        _____________________
        _____________________
        _____________________
        _____________________
         */



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void INDO(double anum,TextView tv){


        if ((int)anum==anum){
            tv.setText(String.valueOf((long)anum));
        }else{
            tv.setText(String.valueOf(anum));
        }
    }

    public void GotoActivity(){
        Intent intent = new Intent(this, GuessActivity.class);
        startActivity(intent);
    }


    public void GuessNumOnClick(MenuItem item) {
        GotoActivity();

    }
}
