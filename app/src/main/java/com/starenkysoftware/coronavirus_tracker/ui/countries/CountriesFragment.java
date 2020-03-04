package com.starenkysoftware.coronavirus_tracker.ui.countries;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.starenkysoftware.coronavirus_tracker.R;

public class CountriesFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_countries, container, false);

        final WebView webview = root.findViewById(R.id.countries_webview);
        webview.loadUrl("http://yogta.ca/c_tracker/tester_1.html");

        webview.setInitialScale(138);

        int width = +getResources().getDisplayMetrics().widthPixels;
        if(width<=720){
            webview.setInitialScale(92);
        }

        FloatingActionButton fab = root.findViewById(R.id.fab_countries);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Refreshing . . .", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                webview.reload();
            }
        });

        return root;
    }
}