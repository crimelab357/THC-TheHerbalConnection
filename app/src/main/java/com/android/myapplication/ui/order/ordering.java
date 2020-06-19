package com.android.myapplication.ui.order;

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

public class ordering extends Fragment {

    private OrderingViewModel mViewModel;

    public static ordering newInstance() {
        return new ordering();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.ordering_fragment, container, false);
        WebView webview=(WebView)v.findViewById(R.id.order);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.crimelab357.com");
        return v;
    }



}
