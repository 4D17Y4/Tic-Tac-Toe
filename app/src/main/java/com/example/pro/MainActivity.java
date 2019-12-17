package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ImageButton x1y1;
    private ImageButton x1y2;
    private ImageButton x1y3;
    private ImageButton x2y1;
    private ImageButton x2y2;
    private ImageButton x2y3;
    private ImageButton x3y1;
    private ImageButton x3y2;
    private ImageButton x3y3;
    public int chosen;
    int c[]={0,0,0,0,0,0,0};
    int p[]={0,0,0,0,0,0,0};
    int d,k,l;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x1y1 = findViewById(R.id.imageButton5);
        x1y2 = findViewById(R.id.imageButton3);
        x1y3 = findViewById(R.id.imageButton4);
        x2y1 = findViewById(R.id.imageButton6);
        x2y2 = findViewById(R.id.imageButton7);
        x2y3 = findViewById(R.id.imageButton8);
        x3y1 = findViewById(R.id.imageButton9);
        x3y2 = findViewById(R.id.imageButton10);
        x3y3 = findViewById(R.id.imageButton11);
        chosen = getIntent().getIntExtra("chosen", chosen);
        final Handler hanler=new Handler();

        int i;
        c[0] = -1;
        x1y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (check(1)) {
                    if (chosen == 1)
                        x1y1.setImageResource(R.drawable.crossed);
                    else
                        x1y1.setImageResource(R.drawable.circled);
                    insert(1, p);
                    check_win(p, true);
                    hanler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            comp_play();
                        }
                    },1000);
                            //comp_play();

                } else {
                    Toast.makeText(MainActivity.this, "choose blank space ", Toast.LENGTH_SHORT).show();
                }

            }
        });
        x1y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check(2)) {
                    if (chosen == 1)
                        x1y2.setImageResource(R.drawable.crossed);
                    else
                        x1y2.setImageResource(R.drawable.circled);
                    insert(2, p);
                    check_win(p, true);
                    hanler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            comp_play();
                        }
                    },1000);
                } else {
                    Toast.makeText(MainActivity.this, "choose blank space ", Toast.LENGTH_SHORT).show();
                }

            }
        });
        x1y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check(3)) {
                    if (chosen == 1)
                        x1y3.setImageResource(R.drawable.crossed);
                    else
                        x1y3.setImageResource(R.drawable.circled);
                    insert(3, p);
                    check_win(p, true);
                    hanler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            comp_play();
                        }
                    },1000);
                } else {
                    Toast.makeText(MainActivity.this, "choose blank space ", Toast.LENGTH_SHORT).show();
                }

            }
        });
        x2y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check(4)) {
                    if (chosen == 1)
                        x2y1.setImageResource(R.drawable.crossed);
                    else
                        x2y1.setImageResource(R.drawable.circled);
                    insert(4, p);
                    //Toast.makeText(MainActivity.this, p[0]+""+p[1]+""+p[2]+""+p[3]+""+p[4]+""+p[5], Toast.LENGTH_SHORT).show();
                    check_win(p, true);
                    hanler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            comp_play();
                        }
                    },1000);                } else {
                    Toast.makeText(MainActivity.this, "choose blank space ", Toast.LENGTH_SHORT).show();
                }

            }
        });
        x2y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check(5)) {
                    if (chosen == 1)
                        x2y2.setImageResource(R.drawable.crossed);
                    else
                        x2y2.setImageResource(R.drawable.circled);
                    insert(5, p);
                    check_win(p, true);
                    hanler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            comp_play();
                        }
                    },1000);
                } else {
                    Toast.makeText(MainActivity.this, "choose blank space ", Toast.LENGTH_SHORT).show();
                }

            }
        });
        x2y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check(6)) {
                    if (chosen == 1)
                        x2y3.setImageResource(R.drawable.crossed);
                    else
                        x2y3.setImageResource(R.drawable.circled);
                    insert(6, p);
                    check_win(p, true);
                    hanler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            comp_play();
                        }
                    },1000);
                } else {
                    Toast.makeText(MainActivity.this, "choose blank space ", Toast.LENGTH_SHORT).show();
                }

            }
        });
        x3y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check(7)) {
                    if (chosen == 1)
                        x3y1.setImageResource(R.drawable.crossed);
                    else
                        x3y1.setImageResource(R.drawable.circled);
                    insert(7, p);
                    check_win(p, true);
                    hanler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            comp_play();
                        }
                    },1000);
                } else {
                    Toast.makeText(MainActivity.this, "choose blank space ", Toast.LENGTH_SHORT).show();
                }

            }
        });
        x3y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check(8)) {

                    if (chosen == 1)
                        x3y2.setImageResource(R.drawable.crossed);
                    else
                        x3y2.setImageResource(R.drawable.circled);
                    insert(8, p);
                    check_win(p, true);
                    hanler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            comp_play();
                        }
                    },1000);                } else {
                    Toast.makeText(MainActivity.this, "choose blank space ", Toast.LENGTH_SHORT).show();
                }

            }
        });
        x3y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check(9)) {
                    if (chosen == 1)
                        x3y3.setImageResource(R.drawable.crossed);
                    else
                        x3y3.setImageResource(R.drawable.circled);
                    insert(9, p);
                    check_win(p, true);
                    hanler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            comp_play();
                        }
                    },1000);

                } else {
                    Toast.makeText(MainActivity.this, "choose blank space ", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


    void insert(int q,int a[])
    {
        int p,k;
        for(p=0;p<6;p++)
            if(a[p]==0)
                break;
            k=p;
        for(d=0;d<p;d++)
            if(a[d]>q)
            {k=d;
            for(d=p;d>k;d--)
                a[d]=a[d-1];
            break;
            }
        a[k]=q;
    }
    void remove(int q,int a[])
    {
        int i;
        for(i=0;i<6;i++)if(a[i]==0)break;
        int n;
        for(n=0;n<i;n++)
            if(a[n]==q)
            {   n++;
                for(;n<=i;n++)a[n-1]=a[n];
                a[n-1]=0;break;
            }
    }
    boolean check(int t)
    {
        int i;
        for(i=0;true;i++)if(c[i]==0)break;
        if(t>9||t<1)return false;
        for(int n=0;n<i;n++){if(p[n]==t||c[n]==t)return false;}
        return true;
    }
    boolean check_win(int a[],boolean f)
    {
        int i,n;boolean b=false;
        for(i=0;i<6;i++)if(a[i]==0)break;
        if(i<3)return false;
        for (n=0;n<i-2;n++)
        {   if(a[n]==-1)continue;
            for(k=n+1;k<i-1;k++)
            {
                d=a[k]-a[n];
                for(l=k+1;l<i;l++)
                {
                    if(d==(a[l]-a[k]))
                    {
                        if((d==1)&&(a[n]==2||a[n]%3==0||a[n]==5||a[n]==8))continue;
                        if(d==2&&(a[n]!=3))continue;
                        if((d==4)&&(a[n]!=1))continue;
                        b= true;
                    }
                }
            }
        }
        if (f&b)
        {//display();
          if(a[0]==-1) {
              Intent intent= new Intent(MainActivity.this,Main3Activity.class);
              intent.putExtra("status",0);
              startActivity(intent);
              System.exit(0);
              //Toast.makeText(MainActivity.this, "you lost \n better luck next time ", Toast.LENGTH_SHORT).show();
          }
          else {
              Intent intent2 =new Intent(MainActivity.this,Main3Activity.class);
              intent2.putExtra("status",1);
              startActivity(intent2);
              System.exit(0);

              Toast.makeText(MainActivity.this, "congratulations you won ", Toast.LENGTH_SHORT).show();
          }
          }

        return b;
    }
    void comp_play()
    {   if(c[4]!=0)
    {
        Intent intent3=new Intent(MainActivity.this,Main3Activity.class);
        intent3.putExtra("status",-1);

        startActivity(intent3);
        System.exit(0);
    }else {
        int n;
        int i;
        for (i = 0; true; i++) if (c[i] == 0) break;
        if (i > 2) {
            for (n = 1; n < 10; n++) {
                if (!check(n)) continue;
                insert(n, c);
                if (check_win(c, true)) {
                    display(n);
                    return;
                }
                remove(n, c);
            }
            for (n = 1; n < 10; n++) {
                if (!check(n))
                    continue;
                insert(n, p);
                if (check_win(p, false)) {
                    insert(n, c);
                    display(n);
                    remove(n, p);
                    return;
                }
                remove(n, p);
            }
            for(n=1;n<10;n++)
            {
                if(check(n))
                {
                    insert(n,c);
                    display(n);
                    return;
                }
            }
        }
        if (i == 2) {
            for (n = 1; n < 10; n++) {
                if (!check(n))
                    continue;
                insert(n, p);
                if (check_win(p, false)) {
                    insert(n, c);
                    remove(n, p);
                    display(n);
                    return;
                }
                remove(n, p);
            }
            if (p[0] == 1) {
                if (p[1] == 9)
                    k = 6;
                if (p[1] == 3 || p[1] == 7)
                    k = 5;
                if (p[1] == 6)
                    k = (check(2)) ? 2 : 8;
                if (p[1] == 8)
                    k = 7;
                if (p[1] == 5)
                    k = 3;
            }
            if (p[0] == 2) {
                if(p[1]==4||p[1]==5||p[1]==6)
                    k=((Math.random()>0.5)?7:((check(8)?8:9)));
                if (p[1] == 9)
                    k = 3;
                if (p[1] == 7)
                    k = 1;
            }
            if (p[0] == 3) {
                if (p[1] == 9)
                    k = 5;
                if (p[1] == 7)
                    k = 2;
                if (p[1] == 5)
                    k = 1;
            }
            if (p[0] == 4) {
                if (p[1] == 9)
                    k = 7;
            }
            if (p[0] == 5) {
                if (p[1] == 9)
                    k = 7;
                if (p[1] == 7)
                    k = 9;
            }
            if (p[0] == 6) {
                if (p[1] == 7)
                    k = 9;
            }
            if (check(k)) {

                insert(k, c);
                display(k);
                return;
            }
        } else {
            if (p[0] == 1 || p[0] == 3 || p[0] == 7 || p[0] == 9) {

                int y = (Math.random() > 0.3) ? 5 : (p[0] == 3 ? 7 : 3);
                insert(y, c);
                display(y);
            }
            if (p[0] == 2) {
                int y = (Math.random() > 0.3) ? 8 : 9;
                insert(y, c);
                display(y);
            }
            if (p[0] == 4) {
                int y = (Math.random() > 0.3) ? 6 : 3;
                insert(y, c);
                display(y);
            }
            if (p[0] == 6) {
                int y = (Math.random() > 0.3) ? 4 : 7;
                insert(y, c);
                display(y);
            }
            if (p[0] == 8) {
                int y = (Math.random() > 0.3) ? 2 : 1;
                insert(y, c);
                display(y);
            }
            if (p[0] == 5) {
                int y = (Math.random() > 0.5) ? 3 : 7;
                insert(y, c);
                display(y);
            }
            return;
        }

        insert(k, c);

    }
    }
    void display(int y)
    {

            if(y==1) {
            if(chosen==1)
                x1y1.setImageResource(R.drawable.circled);
            else
                x1y1.setImageResource(R.drawable.crossed);
        }
            if(y==2) {
                if(chosen==1)
                    x1y2.setImageResource(R.drawable.circled);
                else
                    x1y2.setImageResource(R.drawable.crossed);
            }
            if(y==3) {
                if(chosen==1)
                    x1y3.setImageResource(R.drawable.circled);
                else
                    x1y3.setImageResource(R.drawable.crossed);
            }
            if(y==4) {
                if(chosen==1)
                    x2y1.setImageResource(R.drawable.circled);
                else
                    x2y1.setImageResource(R.drawable.crossed);
            }
            if(y==5) {
                if(chosen==1)
                    x2y2.setImageResource(R.drawable.circled);
                else
                    x2y2.setImageResource(R.drawable.crossed);
            }
            if(y==6) {
                if(chosen==1)
                    x2y3.setImageResource(R.drawable.circled);
                else
                    x2y3.setImageResource(R.drawable.crossed);
            }
             if(y==7) {
                if(chosen==1)
                    x3y1.setImageResource(R.drawable.circled);
                else
                    x3y1.setImageResource(R.drawable.crossed);
            }
             if(y==8) {
                if(chosen==1)
                    x3y2.setImageResource(R.drawable.circled);
                else
                    x3y2.setImageResource(R.drawable.crossed);
            }
             if(y==9) {
                if(chosen==1)
                    x3y3.setImageResource(R.drawable.circled);
                else
                    x3y3.setImageResource(R.drawable.crossed);
            }
             check_win(c,true);

    }

}
