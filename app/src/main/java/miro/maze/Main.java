package miro.maze;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Main extends AppCompatActivity {
    FrameLayout playScr = null;
    int way[][] = null;
    TileMgr tile[][] = null;
    int[] userPos = new int[2];
    int[] clearPos = new int[2];

    public void waySetting1() {
        userPos = new int[]{0, 0};
        clearPos = new int[]{9, 9};
        way = new int[][] {
                {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1, 1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 0, 0, 1, 0},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };

    }

    public void waySetting2() {
        userPos = new int[]{0, 6};
        clearPos = new int[]{5, 9};
        way = new int[][] {
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 1, 0, 1, 1, 1, 0},
                {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 1},
                {0, 1, 0, 0, 0, 0, 1, 0, 0, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };

    }

    public void waySetting3() {
        userPos = new int[]{0, 4};
        clearPos = new int[]{9, 5};
        way = new int[][] {
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 1, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 1, 1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
        };

    }

    public void waySetting20x() {
        userPos = new int[]{0, 0};
        clearPos = new int[]{19, 19};
        way = new int[][] {
                {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},

                {1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        };

    }


    public void initialTile() {
        waySetting1();
        tile = new TileMgr[way.length][way[0].length];
        tileReady();
        tilePlank();
    }

    public void tileReady() {
        for (int i = 0; i < way.length; i++)
            for (int j = 0; j < way[i].length; j++)
                tile[i][j] = new TileMgr(this);
    }

    public void tilePlank() {
        for (int i = 0; i < way.length; i++) {
            for (int j = 0; j < way[i].length; j++) {
                if (way[i][j] == 1)
                    tile[i][j].setBackgroundColor(Color.GRAY);
                else
                    tile[i][j].setBackgroundResource(R.drawable.brick);
            }
        }

        tile[clearPos[0]][clearPos[1]].setBackgroundColor(Color.BLUE);
    }

    ImageView user = null;
    int tenWid = 0, tenHei = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maze_main);

        initialTile();
        playScr = (FrameLayout) findViewById(R.id.playscreen);

        playScr.post(new Runnable() {
            @Override
            public void run() {
                tenWid = (int) (playScr.getWidth() / tile[0].length);
                tenHei = (int) (playScr.getHeight() / tile.length);

                for (int i = 0; i < tile.length; i++) {
                    for (int j = 0; j < tile[i].length; j++) {
                        View nowTile = tile[i][j];
                        FrameLayout.LayoutParams flParam = new FrameLayout.LayoutParams(tenWid, tenHei);
                        flParam.leftMargin = j * tenWid;
                        flParam.topMargin = i * tenHei;
                        nowTile.setLayoutParams(flParam);
                        playScr.addView(nowTile);
                    }
                }

                settingBtn();

                user = new ImageView(Main.this);
                // user.setBackgroundColor(Color.GREEN);
                user.setBackgroundResource(R.mipmap.ic_launcher);

                FrameLayout.LayoutParams userParam = new FrameLayout.LayoutParams(tenWid, tenHei);
                userParam.leftMargin = 0;
                userParam.topMargin = 0;
                user.setLayoutParams(userParam);

                ani = new TranslateAnimation(
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.RELATIVE_TO_SELF, userPos[0],
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.RELATIVE_TO_SELF, userPos[1]);

                ani.setFillAfter(true);
                ani.setFillEnabled(true);
                ani.setStartOffset(0);
                ani.setStartTime(0);
                ani.setDuration(0);
                user.startAnimation(ani);

                playScr.addView(user);

            }
        });

    }

    public void settingBtn() {
        leftBtn = (ImageView) findViewById(R.id.leftarrow);
        rightBtn = (ImageView) findViewById(R.id.rightarrow);
        upBtn = (ImageView) findViewById(R.id.uparrow);
        downBtn = (ImageView) findViewById(R.id.downarrow);

        leftBtn.setOnTouchListener(otl);
        rightBtn.setOnTouchListener(otl);
        upBtn.setOnTouchListener(otl);
        downBtn.setOnTouchListener(otl);
    }

    ImageView lastBtn = null;

    View.OnTouchListener otl = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int action = event.getAction();
            System.out.println("action : " + action);

            if (action == MotionEvent.ACTION_DOWN) {
                clicking = true;
                lastBtn = (ImageView) v;
                moveStep(v);
                v.setBackgroundColor(Color.RED);
            } else if (action == MotionEvent.ACTION_UP) {
                clicking = false;
                v.setBackgroundColor(Color.TRANSPARENT);
            }
            return true;
        }
    };




    boolean aning = false, clicking = false;
    TranslateAnimation ani = null;

    public ImageView leftBtn, rightBtn, upBtn, downBtn;

    public void moveStep(View clickBtn) {
        int posLeft = 0, posTop = 0;
        int moveLeft = 0, moveTop = 0;

        if (clickBtn == leftBtn) {
            posLeft = -1;
            moveLeft = -tenWid;
        } else if (clickBtn == rightBtn) {
            posLeft = +1;
            moveLeft = +tenWid;
        } else if (clickBtn == upBtn) {
            posTop = -1;
            moveTop = -tenHei;
        } else if (clickBtn == downBtn) {
            posTop = +1;
            moveTop = +tenHei;
        }

        int tmpRow = userPos[0] + posTop;
        int tmpCol = userPos[1] + posLeft;

        if ((0 <= tmpRow && tmpRow < way.length)
                && (0 <= tmpCol && tmpCol < way[tmpRow].length)
                && way[tmpRow][tmpCol] == 1
                && !aning) {

//            ani = new TranslateAnimation(
//                    Animation.RELATIVE_TO_SELF, userPos[1],
//                    Animation.RELATIVE_TO_SELF, tmpCol,
//                    Animation.RELATIVE_TO_SELF, userPos[0],
//                    Animation.RELATIVE_TO_SELF, tmpRow);
//
//            ani.setFillAfter(true);
//            ani.setFillEnabled(true);
//            ani.setStartOffset(0);
//            ani.setStartTime(0);
//            ani.setDuration(250);

            AnimationSet snowMov1 = new AnimationSet(true);
            RotateAnimation rotate1 = new RotateAnimation(0,360, Animation.RELATIVE_TO_SELF,0.5f , Animation.RELATIVE_TO_SELF,0.5f );
            rotate1.setStartOffset(50);
            rotate1.setDuration(9500);
            snowMov1.addAnimation(rotate1);
            TranslateAnimation trans1 =  new TranslateAnimation(
                    Animation.RELATIVE_TO_SELF, userPos[1],
                    Animation.RELATIVE_TO_SELF, tmpCol,
                    Animation.RELATIVE_TO_SELF, userPos[0],
                    Animation.RELATIVE_TO_SELF, tmpRow);
            trans1.setDuration(250);
            snowMov1.addAnimation(trans1);
            snowMov1.setFillAfter(true);
            snowMov1.setFillEnabled(true);
            snowMov1.setStartOffset(0);
            snowMov1.setStartTime(0);
            snowMov1.setDuration(250);

            snowMov1.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                    aning = true;
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    aning = false;
                    if (clicking) moveStep(lastBtn);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });
            snowMov1.setInterpolator(new LinearInterpolator());
            user.startAnimation(snowMov1);

            aning = true;

            userPos[0] = tmpRow;
            userPos[1] = tmpCol;

        }
    }

}
