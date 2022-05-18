package com.guy.testtv;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.mediahome.video.PreviewProgram;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {

    String link = "https://rr2---sn-ogueln7z.googlevideo.com/videoplayback?expire=1652637424&ei=kOqAYpqNBOaBxN8PlISagAg&ip=14.36.70.132&id=o-AF0HacQJWrplkYjun9YHO3Ta1_MtmSMH6xbJnnLYjG0W&itag=18&source=youtube&requiressl=yes&spc=4ocVC4yUpdE0FDbmLWGFkcfpMDbR&vprv=1&mime=video%2Fmp4&ns=5dxtmFGCza_2H0zNlRIg3V8G&gir=yes&clen=19034173&ratebypass=yes&dur=275.760&lmt=1610674167454983&fexp=23886213,24001373,24007246&beids=23886213&c=WEB&txp=5438434&n=A_vok0CH1dW33g&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRgIhAKcbU88s3eiQT2p_VhPRFOTdv818IbMMAiygVPIPCC1GAiEA8hELoBqwZzZx3NOjp593S4w5Y-dEeP6ndjJQGR_52dk%3D&rm=sn-3u-nf0z7s,sn-3u-bh2z67l&req_id=772e92ceb50fa3ee&redirect_counter=2&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=ZB&mm=30&mn=sn-ogueln7z&ms=nxu&mt=1652615791&mv=m&mvi=2&pl=22&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIhAKjavUQyf81M63oFSBI2Q8kh4Qamr8EAof29pwyOetnQAiAsaQz9nVNEXloAgbF9OyHAPrDz6qE4-tCrLzzZR5abOw%3D%3D";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Uri previewVideoUrl = Uri.parse(link);
    }

    private MediaPlayer mPlayer;

}