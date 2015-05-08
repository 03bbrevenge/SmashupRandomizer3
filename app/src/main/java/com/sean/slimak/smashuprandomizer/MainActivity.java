package com.sean.slimak.smashuprandomizer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Random;

public class MainActivity extends Activity implements OnClickListener{

    private int display[]= new int[8];
    private String strings[] = new String[28];
    private TextView textView;
    private Button but;

    private Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.InformationDisplay);
        but = (Button) findViewById(R.id.button);
        but.setOnClickListener(this);
       buildStrings();
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

    public void randomize(){
        String dis[] = new String[8];
        display[0]=-1;
        int count =0;
        for (int i =0; i<display.length;i++){
            count++;
            int r = rand.nextInt(27);

            int j=0;
            while (j< count){
                if (r ==display[j]) {
                    r = rand.nextInt(27);
                }
                else {
                    dis[i] = strings[r];
                    j++;
                }
            }

        }
textView.setText(dis[0].concat(dis[1].concat(dis[2].concat(dis[3].concat(dis[4].concat(dis[5].concat(dis[6].concat(dis[7]))))))));

    }
    private void buildStrings(){
        strings[0] ="Priates " ;
        strings[1] ="Ninjas ";
        strings[2]="Robots ";
        strings[3]="Dinosaurs " ;
        strings[4]="Wizards ";
        strings[5]="Tricksters ";
        strings[6]="Aliens ";
        strings[7]="Killer Plants ";
        strings[8]="Ghosts " ;
        strings[9]="Steampunks ";
        strings[10]="BearCavalry ";
        strings[11]="Cthulhu Cultists ";
        strings[12]="ElderThings ";
        strings[13]="Innsmouth ";
        strings[14]="Mistkatonic University ";
        strings[15]="Time Travelers ";
        strings[16]="Cyborg Apes ";
        strings[17]="Super Spies ";
        strings[18]="Shapeshifters ";
        strings[19]="Geeks ";
        strings[20]="Mad Scientists ";
        strings[21]="Giant Ants ";
        strings[22]="Werewolves ";
        strings[23]="Vampires ";
        strings[24]="Fairies ";
        strings[25]="Mythic Horses ";
        strings[26]="Kitty cats ";
        strings[27]="Princesses ";
    }

    public void onClick(View v){
        randomize();
    }
}
