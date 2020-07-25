package com.mo_said.azkar.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mo_said.azkar.RV.ModelAd3ia;
import com.mo_said.azkar.R;
import com.mo_said.azkar.RV.RvAd3iaAdapter;
import com.mo_said.azkar.RcClickInterface;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Ad3iaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Ad3iaFragment extends Fragment implements RcClickInterface {
    View view;
    RecyclerView mRvAd3ia;
    RvAd3iaAdapter mrvAd3iaAdapter;
    ArrayList<ModelAd3ia> mad3iaArrayList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Ad3iaFragment() {
        // Required empty public constructor
    }

    public static Ad3iaFragment newInstance(String param1, String param2) {
        Ad3iaFragment fragment = new Ad3iaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_ad3ia, container, false);
        iniViewsd(view);
        return view;
    }

    private void iniViewsd(View v) {
        mRvAd3ia = v.findViewById(R.id.rv_ad3ia);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        mRvAd3ia.setLayoutManager(layoutManager1);

        mad3iaArrayList = new ArrayList<ModelAd3ia>();
        mad3iaArrayList.add(new ModelAd3ia("أدعية النَّبِيِّ صَلَّى اللهُ عَلَيْهِ وَسَلَّم"));
        mad3iaArrayList.add(new ModelAd3ia("الْأدْعِيَةُ القرآنية"));
        mad3iaArrayList.add(new ModelAd3ia("أدعية الأنبياء من القرآن الكريم"));
        mad3iaArrayList.add(new ModelAd3ia("أدعية للمتوفي"));
        mad3iaArrayList.add(new ModelAd3ia("دُعَاءُ خَتْمِ القُرْآنِ الكَريمِ"));
        mad3iaArrayList.add(new ModelAd3ia("جوامع الدعاء"));




        mrvAd3iaAdapter = new RvAd3iaAdapter(mad3iaArrayList,getActivity());
        mRvAd3ia.setAdapter(mrvAd3iaAdapter);


    }

    @Override
    public void onItemClickListener(int position) {
        Toast.makeText(getContext(),position,Toast.LENGTH_LONG).show();
    }
}