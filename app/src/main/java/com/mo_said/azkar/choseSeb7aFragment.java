package com.mo_said.azkar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mo_said.azkar.DB.DB;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link choseSeb7aFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class choseSeb7aFragment extends BottomSheetDialogFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    View view;
    RecyclerView mRv;
    choseSeb7aRvAdapter choseSeb7aRvAdapter;
    DB db;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public choseSeb7aFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment choseSeb7aFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static choseSeb7aFragment newInstance(String param1, String param2) {
        choseSeb7aFragment fragment = new choseSeb7aFragment();
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
        view = inflater.inflate(R.layout.fragment_chose_seb7a, container, false);


        mRv = view.findViewById(R.id.choseSeb7aRv);
        db = new DB();
        choseSeb7aRvAdapter = new choseSeb7aRvAdapter(db.elseb7a0(), getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        mRv.setLayoutManager(layoutManager);
        mRv.setAdapter(choseSeb7aRvAdapter);

        return view;
    }
}