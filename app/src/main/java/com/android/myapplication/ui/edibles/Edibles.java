package com.android.myapplication.ui.edibles;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.android.myapplication.R;

public class Edibles extends Fragment {

    private EdiblesViewModel mViewModel;

    public static Edibles newInstance() {
        return new Edibles();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.edibles_fragment, container, false);
        WebView webview = (WebView)v.findViewById(R.id.webView_edibles);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.instagram.com/derrty_cookies/?hl=en");
        return v;

    }


}
