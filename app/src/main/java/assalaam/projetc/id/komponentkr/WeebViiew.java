package assalaam.projetc.id.komponentkr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WeebViiew extends AppCompatActivity {
    WebView WeebViiew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeb_viiew);
        WeebViiew = (WebView) findViewById(R.id.webview);
        WeebViiew.setWebViewClient(new WebViewClient());
        WebSettings webSettings = WeebViiew.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        WeebViiew.loadUrl("http://smkassalaambandung.sch.id");

    }
}
