package com.starenkysoftware.coronavirus_tracker.ui.about;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.starenkysoftware.coronavirus_tracker.R;

public class AboutFragment extends Fragment {

    private SendViewModel sendViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sendViewModel =
                ViewModelProviders.of(this).get(SendViewModel.class);
        View root = inflater.inflate(R.layout.fragment_about, container, false);

        TextView aboutTitle = root.findViewById(R.id.about_title);
        aboutTitle.setText("About");
        Typeface thin_font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Poppins_Light.ttf");
        aboutTitle.setTypeface(thin_font);


        // Headings
        TextView creator = root.findViewById(R.id.about_creator);
        TextView contact = root.findViewById(R.id.about_contact);
        TextView about = root.findViewById(R.id.about_why);

        Typeface thick_font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Poppins_Medium.ttf");
        creator.setTypeface(thick_font);
        contact.setTypeface(thick_font);
        about.setTypeface(thick_font);

        // Info (not headings)
        TextView name = root.findViewById(R.id.about_name);
        TextView email = root.findViewById(R.id.about_email);
        TextView description = root.findViewById(R.id.about_description);

        name.setTypeface(thin_font);
        email.setTypeface(thin_font);
        description.setTypeface(thin_font);

        int width = +getResources().getDisplayMetrics().widthPixels;
        if(width<=720){
            email.setText("starenkysoftware\n@gmail.com");
        }

        return root;
    }
}