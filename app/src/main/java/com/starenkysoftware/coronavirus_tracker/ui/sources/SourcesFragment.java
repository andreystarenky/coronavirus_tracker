package com.starenkysoftware.coronavirus_tracker.ui.sources;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.starenkysoftware.coronavirus_tracker.R;

public class SourcesFragment extends Fragment {

    private ShareViewModel shareViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shareViewModel =
                ViewModelProviders.of(this).get(ShareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sources, container, false);

        TextView aboutTitle = root.findViewById(R.id.sources_title);
        aboutTitle.setText("Sources");
        Typeface thin_font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Poppins_Light.ttf");
        aboutTitle.setTypeface(thin_font);


        // Headings
        TextView source1_title = root.findViewById(R.id.source1_title);
        TextView source2_title = root.findViewById(R.id.source2_title);

        Typeface thick_font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Poppins_Medium.ttf");
        source1_title.setTypeface(thick_font);
        source2_title.setTypeface(thick_font);

        // Non-headings
        TextView sub_title = root.findViewById(R.id.sub_title);
        TextView source1 = root.findViewById(R.id.source1);
        TextView source2 = root.findViewById(R.id.source2);

        source1.setTypeface(thin_font);
        source2.setTypeface(thin_font);
        sub_title.setTypeface(thin_font);

        return root;
    }
}