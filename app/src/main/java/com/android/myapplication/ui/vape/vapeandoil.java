package com.android.myapplication.ui.vape;

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

public class vapeandoil extends Fragment {

    private VapeandoilViewModel mViewModel;

    public static vapeandoil newInstance() {
        return new vapeandoil();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.vapeandoil_fragment, container, false);
        WebView webview = (WebView)v.findViewById(R.id.webView_vape);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://vaping360.com/best-vape-pens/weed-pens/");
        return v;
    }



}
