package com.android.myapplication.ui.accessories;

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

public class accesorriespage extends Fragment {

    private AccesorriespageViewModel mViewModel;

    public static accesorriespage newInstance() {
        return new accesorriespage();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.accesorriespage_fragment, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webView_accessories);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.aliexpress.com/i/32896541961.html");
        return view;
    }



}
