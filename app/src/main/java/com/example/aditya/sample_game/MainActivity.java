package com.example.aditya.sample_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int turn;
    int a1,a2,a3,a4,a5,a6,a7,a8,a9;
    public void click1(View view){
        ImageView img1=(ImageView)view;
        if(a1==0){
            turn++;
            if(turn==1 || turn==3 || turn==5 || turn==7 ||turn==9){
                img1.setTranslationY(-1000f);
                img1.setImageResource(R.drawable.bulb);
                img1.animate().translationXBy(1000f).setDuration(1000);
                Log.i("Info", "Turn:"+turn);
                a1=turn;
                if(((a2!=0 & a3!=0 || a4!=0 & a7!=0 || a5!=0 & a9!=0) && (a2%2!=0 && a3%2!=0 || a4%2!=0 && a7%2!=0 || a5%2!=0 && a9%2!=0))){
                    Toast.makeText(this, "Bulb is Winner!!", Toast.LENGTH_SHORT).show();
                }

            }
            else if(turn==2 || turn==4 || turn==6 || turn==8){
                img1.setImageResource(R.drawable.gun);
                Log.i("Info", "Turn:"+turn);
                a1=turn;
                if((a2!=0 & a3!=0 || a4!=0 & a7!=0 || a5!=0 & a9!=0)&&(a2%2==0 && a3%2==0 || a4%2==0 && a7%2==0 || a5%2==0 && a9%2==0)){
                    Toast.makeText(this, "Gun is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
        }

    }
    public void click2(View view){
        ImageView img1=(ImageView)findViewById(R.id.img_click2);
        if(a2==0){
            turn++;
            if(turn==1 || turn==3 || turn==5 || turn==7 ||turn==9){
                img1.setImageResource(R.drawable.bulb);
                Log.i("Info", "Turn:"+turn);
                a2=turn;
                if((a1!=0 & a3!=0 || a5!=0 & a8!=0)&&(a1%2!=0 && a3%2!=0 || a5%2!=0 && a7%2!=0)){
                    Toast.makeText(this, "Bulb is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
            else if(turn==2 || turn==4 || turn==6 || turn==8){
                img1.setImageResource(R.drawable.gun);
                Log.i("Info", "Turn:"+turn);
                a2=turn;
                if((a1!=0 & a3!=0 || a5!=0 & a8!=0)&&(a1%2==0 && a3%2==0 || a5%2==0 && a7%2==0)){
                    Toast.makeText(this, "Gun is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
        }

    }
    public void click3(View view){
        ImageView img1=(ImageView)findViewById(R.id.img_click3);
        if(a3==0){
            turn++;
            if(turn==1 || turn==3 || turn==5 || turn==7 ||turn==9){
                img1.setImageResource(R.drawable.bulb);
                Log.i("Info", "Turn:"+turn);
                a3=turn;
                if((a1!=0 & a2!=0 || a6!=0 & a9!=0|| a5!=0 & a7!=0)&&(a1%2!=0 && a2%2!=0 || a6%2!=0 && a9%2!=0 || a5%2!=0 && a7%2!=0)){
                    Toast.makeText(this, "Bulb is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
            else if(turn==2 || turn==4 || turn==6 || turn==8){
                img1.setImageResource(R.drawable.gun);
                Log.i("Info", "Turn:"+turn);
                a3=turn;
                if((a1!=0 & a2!=0 || a6!=0 & a9!=0 || a5!=0 & a7!=0)&&(a1%2==0 && a2%2==0 || a6%2==0 && a9%2==0 || a5%2==0 && a7%2==0)){
                    Toast.makeText(this, "Gun is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
        }

    }
    public void click4(View view){
        ImageView img1=(ImageView)findViewById(R.id.img_click4);
        if(a4==0){
            turn++;
            if(turn==1 || turn==3 || turn==5 || turn==7 ||turn==9){
                img1.setImageResource(R.drawable.bulb);
                Log.i("Info", "Turn:"+turn);
                a4=turn;
                if((a1!=0 & a7!=0 || a5!=0 & a6!=0)&&(a1%2!=0 && a7%2!=0 || a5%2!=0 && a6%2!=0)){
                    Toast.makeText(this, "Bulb is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
            else if(turn==2 || turn==4 || turn==6 || turn==8){
                img1.setImageResource(R.drawable.gun);
                Log.i("Info", "Turn:"+turn);
                a4=turn;
                if((a1!=0 & a7!=0 || a5!=0 & a6!=0)&&(a1%2==0 && a7%2==0 || a5%2==0 && a6%2==0)){
                    Toast.makeText(this, "Gun is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
        }

    }
    public void click5(View view){
        ImageView img1=(ImageView)findViewById(R.id.img_click5);
        if(a5==0){
            turn++;
            if(turn==1 || turn==3 || turn==5 || turn==7 ||turn==9){
                img1.setImageResource(R.drawable.bulb);
                Log.i("Info", "Turn:"+turn);
                a5=turn;
                // img1.animate().translationXBy(1000f).setDuration(1000);
            }
            else if(turn==2 || turn==4 || turn==6 || turn==8){
                img1.setImageResource(R.drawable.gun);
                Log.i("Info", "Turn:"+turn);
                a5=turn;
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
        }

    }
    public void click6(View view){
        ImageView img1=(ImageView)findViewById(R.id.img_click6);
        if(a6==0){
            turn++;
            if(turn==1 || turn==3 || turn==5 || turn==7 ||turn==9){
                img1.setImageResource(R.drawable.bulb);
                Log.i("Info", "Turn:"+turn);
                a6=turn;
                if((a4!=0 & a5!=0 || a3!=0 & a9!=0)&&(a4%2!=0 && a5%2!=0 || a3%2!=0 && a9%2!=0)){
                    Toast.makeText(this, "Bulb is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
            else if(turn==2 || turn==4 || turn==6 || turn==8){
                img1.setImageResource(R.drawable.gun);
                Log.i("Info", "Turn:"+turn);
                a6=turn;
                if((a4!=0 & a5!=0 || a3!=0 & a9!=0)&&(a4%2==0 && a5%2==0 || a3%2==0 && a9%2==0)){
                    Toast.makeText(this, "Gun is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
        }

    }
    public void click7(View view){
        ImageView img1=(ImageView)findViewById(R.id.img_click7);
        if(a7==0){
            turn++;
            if(turn==1 || turn==3 || turn==5 || turn==7 ||turn==9){
                img1.setImageResource(R.drawable.bulb);
                Log.i("Info", "Turn:"+turn);
                a7=turn;
                if((a1!=0 & a4!=0 || a5!=0 & a3!=0 || a8!=0 & a9!=0)&&(a1%2!=0 & a4%2!=0 || a5%2!=0 & a3%2!=0 || a8%2!=0 & a9%2!=0)){
                    Toast.makeText(this, "Bulb is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
            else if(turn==2 || turn==4 || turn==6 || turn==8){
                img1.setImageResource(R.drawable.gun);
                Log.i("Info", "Turn:"+turn);
                a7=turn;
                if((a1!=0 & a4!=0 & a5!=0 & a3!=0 || a8!=0 & a9!=0)&&((a1%2==0 && a4%2==0) || (a5%2==0 && a3%2==0) || (a8%2==0 && a9%2==0))){
                    Toast.makeText(this, "Gun is Winner!!", Toast.LENGTH_SHORT).show();
                }
                // img1.animate().translationXBy(1000f).setDuration(1000);
            }
        }

    }
    public void click8(View view){
        ImageView img1=(ImageView)findViewById(R.id.img_click8);
        if(a8==0){
            turn++;
            if(turn==1 || turn==3 || turn==5 || turn==7 ||turn==9){
                img1.setImageResource(R.drawable.bulb);
                Log.i("Info", "Turn:"+turn);
                a8=turn;
                if((a2!=0 & a5!=0 || a7!=0 & a9!=0)&&(a2%2!=0 & a5%2!=0 || a7%2!=0 & a9%2!=0)){
                    Toast.makeText(this, "Bulb is Winner!!", Toast.LENGTH_SHORT).show();
                }
                // img1.animate().translationXBy(1000f).setDuration(1000);
            }
            else if(turn==2 || turn==4 || turn==6 || turn==8){
                img1.setImageResource(R.drawable.gun);
                Log.i("Info", "Turn:"+turn);
                a8=turn;
                if((a2!=0 & a5!=0 || a7!=0 & a9!=0)&&(a2%2==0 & a5%2==0 || a7%2==0 & a9%2==0)){
                    Toast.makeText(this, "Gun is Winner!!", Toast.LENGTH_SHORT).show();
                }

                // img1.animate().translationXBy(1000f).setDuration(1000);
            }
        }

    }
    public void click9(View view){
        ImageView img1=(ImageView)findViewById(R.id.img_click9);
        if(a9==0){
            turn++;
            if(turn==1 || turn==3 || turn==5 || turn==7 ||turn==9){
                img1.setImageResource(R.drawable.bulb);
                Log.i("Info", "Turn:"+turn);
                a9=turn;
                if((a1!=0 & a5!=0 || a3!=0 & a6!=0 || a7!=0 & a8!=0)&&(a1%2!=0 & a5%2!=0||a3%2!=0 & a6%2!=0||a7%2!=0 & a8%2!=0)){
                    Toast.makeText(this, "Bulb is Winner!!", Toast.LENGTH_SHORT).show();
                }
                // img1.animate().translationXBy(1000f).setDuration(1000);
            }
            else if(turn==2 || turn==4 || turn==6 || turn==8){
                img1.setImageResource(R.drawable.gun);
                Log.i("Info", "Turn:"+turn);
                a9=turn;
                if((a1!=0 & a5!=0 || a3!=0 & a6!=0 || a7!=0 & a8!=0)&&(a1%2==0 & a5%2==0||a3%2==0 & a6%2==0||a7%2==0 & a8%2==0)){
                    Toast.makeText(this, "Gun is Winner!!", Toast.LENGTH_SHORT).show();
                }
                //img1.animate().translationXBy(1000f).setDuration(1000);
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
