package dell.navid.com.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class GuessActivity extends Activity {
    public int gnum=0,higherthan=0,lowerthan=101,rnum=(int)(Math.random()*100)+1,i=0;
    public String text="";
    boolean setEnbd=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
        final TextView tvt= (TextView) findViewById(R.id.TV);
        final TextView tvb= (TextView) findViewById(R.id.textView);
        tvb.setMovementMethod(new ScrollingMovementMethod());


        final Button g1=(Button) findViewById(R.id.button21);
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=gnum*10+1;
                compare();
                tvt.setText(String.valueOf(gnum));
            }

        });
        final Button g2=(Button) findViewById(R.id.button22);
        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=gnum*10+2;
                compare();
                tvt.setText(String.valueOf(gnum));
            }

        });
        final Button g3=(Button) findViewById(R.id.button23);
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=gnum*10+3;
                compare();
                tvt.setText(String.valueOf(gnum));
            }

        });
        final Button g4=(Button) findViewById(R.id.button24);
        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=gnum*10+4;
                compare();
                tvt.setText(String.valueOf(gnum));
            }

        });
        final Button g5=(Button) findViewById(R.id.button25);
        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=gnum*10+5;
                compare();
                tvt.setText(String.valueOf(gnum));
            }

        });
        final Button g6=(Button) findViewById(R.id.button26);
        g6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=gnum*10+6;
                compare();
                tvt.setText(String.valueOf(gnum));
            }

        });
        final Button g7=(Button) findViewById(R.id.button27);
        g7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=gnum*10+7;
                compare();
                tvt.setText(String.valueOf(gnum));
            }

        });
        final Button g8=(Button) findViewById(R.id.button28);
        g8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=gnum*10+8;
                compare();
                tvt.setText(String.valueOf(gnum));
            }

        });
        final Button g9=(Button) findViewById(R.id.button29);
        g9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=gnum*10+9;
                compare();
                tvt.setText(String.valueOf(gnum));
            }

        });
        final Button g0=(Button) findViewById(R.id.button30);
        g0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=gnum*10;
                compare();
                tvt.setText(String.valueOf(gnum));
            }

        });
        final Button AC=(Button) findViewById(R.id.button31);
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gnum=0;
                compare();
                tvt.setText("All Cleared");
            }

        });
        final Button cp=(Button) findViewById(R.id.button33);
        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testnum(tvb,tvt);
                enableKeyboard(setEnbd);
                compare();
                i++;
                gnum=0;

            }
            public final void enableKeyboard(boolean a){
                g1.setEnabled(a);
                g2.setEnabled(a);
                g3.setEnabled(a);
                g4.setEnabled(a);
                g5.setEnabled(a);
                g6.setEnabled(a);
                g7.setEnabled(a);
                g8.setEnabled(a);
                g9.setEnabled(a);
                g0.setEnabled(a);
                AC.setEnabled(a);
                cp.setEnabled(a);
            }

        });
        final Button start=(Button) findViewById(R.id.button32);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableKeyboard(true);
                start.setText("Restart!");
                tvt.setText("Guess A Number");
                tvb.setText("");
                rnum=(int)(Math.random()*100)+1;
                gnum=0;
                higherthan=0;
                lowerthan=101;
            }


            public final void enableKeyboard(boolean a){
                g1.setEnabled(a);
                g2.setEnabled(a);
                g3.setEnabled(a);
                g4.setEnabled(a);
                g5.setEnabled(a);
                g6.setEnabled(a);
                g7.setEnabled(a);
                g8.setEnabled(a);
                g9.setEnabled(a);
                g0.setEnabled(a);
                AC.setEnabled(a);
                cp.setEnabled(a);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_guess, menu);
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
    public void testnum(TextView tvb,TextView tvt){
        if (gnum>rnum){
            text=text+"\n"+gnum+" , guess lower";
            tvb.setText(text);
            tvt.setText("Guess Lower");
            setEnbd=true;
        }else if (gnum<rnum){
            text=text+"\n"+gnum+" , guess higher";
            tvb.setText(text);
            tvt.setText("Guess Higher");
            setEnbd=true;
        }else{
            tvb.setText("\n"+gnum+" is right!");
            rnum=(int)(Math.random()*100)+1;
            text=text+"\n"+"You Won!!!"+"\t"+gnum+"\n"+"with "+i+" Guesses";
            tvt.setText("YOU WON!!");
            tvb.setText(text);
            text="";
            setEnbd=false;
            i=0;

        }


    }
    public void compare(){
        if (gnum>lowerthan){
            gnum=0;
        }else if (gnum<higherthan){
            gnum=0;
        }
    }
    public int numbutg(Button a){
        gnum=gnum*10+Integer.parseInt((String) a.getText());
        return gnum;
    }

    public void CalculatorOnClick(MenuItem item) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
