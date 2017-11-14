package com.naveen.sampleratingwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class SampleWebView extends AppCompatActivity {

    private WebView webView;
    private EditText url,bgcolor,para;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_web_view);

        getSupportActionBar().setTitle("Sample WebView");

        webView = (WebView)findViewById(R.id.webView);

        url = (EditText)findViewById(R.id.editUrl);
        button = (Button)findViewById(R.id.bntrigger);
        para = (EditText)findViewById(R.id.editpara);
        bgcolor = (EditText)findViewById(R.id.editbgcolor);

        //Below code is written to read file of HTML in WEB VIEW.
        webView.loadUrl("file:///android_asset/myHtml.html");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // On Click of button we are appending the given values by user using EIDTTEXT inputs.

                String uri = url.getText().toString();
                String bg = bgcolor.getText().toString();
                String p = para.getText().toString();


                //Loading the given URL by user
               /* webView.loadUrl(uri);*/

               //Loading HTML CODE
               /*webView.loadData("<html> <body bgcolor="+bg+"> <h1> "+uri+" </h1> <p>"+p+" </p> </body> </html>","text/html","UTF-8");*/




            }
        });

       /* //open url given

        webView.loadUrl("http://facebook.com/");*/
    }
}
