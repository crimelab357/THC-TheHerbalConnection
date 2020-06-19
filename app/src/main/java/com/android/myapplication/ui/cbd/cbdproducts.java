package com.android.myapplication.ui.cbd;

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

public class cbdproducts extends Fragment {

    private CbdproductsViewModel mViewModel;

    public static cbdproducts newInstance() {
        return new cbdproducts();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.cbdproducts_fragment, container, false);
        WebView webview = (WebView)root.findViewById(R.id.webView_cbd);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://medterracbd.com/products");
        return root;
    }


}
