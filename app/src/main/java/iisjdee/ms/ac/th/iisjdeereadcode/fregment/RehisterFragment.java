package iisjdee.ms.ac.th.iisjdeereadcode.fregment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import iisjdee.ms.ac.th.iisjdeereadcode.R;

/**
 * Created by iisjdee on 21/3/2018 AD.
 */

public class RehisterFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fregmentregister, container, false);
        return view;
    }
}
