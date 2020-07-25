package com.mo_said.azkar.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mo_said.azkar.RV.ModelAzkar;
import com.mo_said.azkar.R;
import com.mo_said.azkar.RV.RvِAzkarAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AzkarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AzkarFragment extends Fragment {

    View view;
    RecyclerView mRv;
    RvِAzkarAdapter mRvِAzkarAdapter;
    ArrayList<ModelAzkar> arrayList__;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AzkarFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AzkarFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AzkarFragment newInstance(String param1, String param2) {
        AzkarFragment fragment = new AzkarFragment();
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
        view = inflater.inflate(R.layout.fragment_azkar, container, false);
        iniViews(view);


        return view;

    }

    private void iniViews(View view) {
        mRv = view.findViewById(R.id.rv);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        mRv.setLayoutManager(layoutManager);

        arrayList__ = new ArrayList<>();

        arrayList__.add(new ModelAzkar(R.drawable.ic_night,"اذكار المساء"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_morning,"اذكار الصباح"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_alarm,"اذكار الاستيقاظ"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_sleep,"اذكار النوم"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_mosque,"اذكار المسجد"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_azan,"اذكار الاذان"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_prayer,"اذكار الصلاة"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_wdo2,"اذكار الوضوء"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_wc,"اذكار الخلاء"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_home,"اذكار المنزل"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_food,"اذكار الطعام"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_ka3ba,"اذكار الحج والعمرة"));




        mRvِAzkarAdapter = new RvِAzkarAdapter(arrayList__,getContext());
        mRv.setAdapter(mRvِAzkarAdapter);




    }

}