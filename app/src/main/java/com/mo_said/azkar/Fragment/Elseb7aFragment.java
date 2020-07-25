package com.mo_said.azkar.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.mo_said.azkar.RV.ModelElseb7a;
import com.mo_said.azkar.R;
import com.mo_said.azkar.RcClickInterface;
import com.mo_said.azkar.RV.RvElseb7aAdapter;

import java.util.ArrayList;

public class Elseb7aFragment extends Fragment implements View.OnClickListener, RcClickInterface {
    View view;
    LottieAnimationView animationView;
    int mCounter;
    TextView mCounterText;



    RecyclerView mRvelsebha;
    RvElseb7aAdapter rvElseb7aAdapter;
    ArrayList<ModelElseb7a> arrayList;
    Context mContext;

//    public Elseb7aFragment(Context mContext) {
//        this.mContext = mContext;
//    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_elseb7a, container, false);
        IniViews();
        IniRv();


        return view;
    }

    private void IniRv() {
        mRvelsebha = view.findViewById(R.id.Rv_Elseb7a);
        arrayList = new ArrayList<>();
        arrayList.add(new ModelElseb7a("سبحان الله"));
        arrayList.add(new ModelElseb7a("سُبْحَانَ اللَّهِ وَبِحَمْدِهِ"));
        arrayList.add(new ModelElseb7a("سُبْحَانَ اللَّهِ وَالْحَمْدُ لِلَّهِ ِ"));
        arrayList.add(new ModelElseb7a("سُبْحَانَ اللهِ العَظِيمِ وَبِحَمْدِهِ"));
        arrayList.add(new ModelElseb7a("سُبْحَانَ اللَّهِ وَبِحَمْدِهِ ، سُبْحَانَ اللَّهِ الْعَظِيمِِ"));
        arrayList.add(new ModelElseb7a("لَا إلَه إلّا اللهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلُّ شَيْءِ قَدِيرِِ"));
        arrayList.add(new ModelElseb7a("لا حَوْلَ وَلا قُوَّةَ إِلا بِاللَّهِ ِ"));
        arrayList.add(new ModelElseb7a("الْحَمْدُ للّهِ رَبِّ الْعَالَمِينَ ِ"));
        arrayList.add(new ModelElseb7a("الْلَّهُم صَلِّ وَسَلِم وَبَارِك عَلَى سَيِّدِنَا مُحَمَّد "));
        arrayList.add(new ModelElseb7a("أستغفر اللهِ"));
        arrayList.add(new ModelElseb7a("سُبْحَانَ الْلَّهِ، وَالْحَمْدُ لِلَّهِ، وَلَا إِلَهَ إِلَّا الْلَّهُ، وَالْلَّهُ أَكْبَرُ ِ"));
        arrayList.add(new ModelElseb7a("لَا إِلَهَ إِلَّا اللَّهُِ"));
        arrayList.add(new ModelElseb7a("الْلَّهُ أَكْبَرُِ"));
        arrayList.add(new ModelElseb7a("سُبْحَانَ اللَّهِ ، وَالْحَمْدُ لِلَّهِ ، وَلا إِلَهَ إِلا اللَّهُ ، وَاللَّهُ أَكْبَرُ ، اللَّهُمَّ اغْفِرْ لِي ، اللَّهُمَّ ارْحَمْنِي ، اللَّهُمَّ ارْزُقْنِي.ِ"));
        arrayList.add(new ModelElseb7a("الْحَمْدُ لِلَّهِ حَمْدًا كَثِيرًا طَيِّبًا مُبَارَكًا فِيهِ.ِ"));
        arrayList.add(new ModelElseb7a("اللَّهُ أَكْبَرُ كَبِيرًا ، وَالْحَمْدُ لِلَّهِ كَثِيرًا ، وَسُبْحَانَ اللَّهِ بُكْرَةً وَأَصِيلاً.ِ"));
        arrayList.add(new ModelElseb7a("اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ , وَعَلَى آلِ إِبْرَاهِيمَ إِنَّكَ حَمِيدٌ مَجِيدٌ , اللَّهُمَّ بَارِكْ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ كَمَا بَارَكْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيمَ إِنَّكَ حَمِيدٌ مَجِيدٌ. "));



        rvElseb7aAdapter = new RvElseb7aAdapter(arrayList,this);
        mRvelsebha.setAdapter(rvElseb7aAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        mRvelsebha.setLayoutManager(layoutManager);






    }

    private void IniViews() {


    }

    @Override
    public void onClick(View view) {

    }

    private void AnimationMethods100(LottieAnimationView animationView) {
        mCounter++;
        String Counter__ = String.valueOf(( mCounter));
        int CounterAnimation = mCounter*9;
        mCounterText.setText(Counter__);
        animationView.setFrame(CounterAnimation);
        if (mCounter==100){
            animationView.setFrame(0);
            mCounter=0;
        }
    }

    @Override
    public void onItemClickListener(int position) {
        Toast.makeText(getActivity(),position,Toast.LENGTH_LONG).show();
    }
}