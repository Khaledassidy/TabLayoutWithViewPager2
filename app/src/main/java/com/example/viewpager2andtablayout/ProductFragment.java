package com.example.viewpager2andtablayout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProductFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

//2awl she b8ayer l key le 3ande la esm category l2no ana asesan 3emel l fragemnt bede5ela recycle view w hay recycle view bada te3roud majmo3a mn l product w hay l product mafroud m5azane b database 2aw firebase 2aw web api l fekra 3ande data kteer  bade sanefa 3ala shakl category fa ana l mafroud bade ersel l categoryid lal fragment 2aw esm l category w bene2en 3lee e3red l product l 5aso b heda l category b2lab recycle view
//ba3mel variable esmo category bade ersel esm heda l category mn bara l fragemnt
public class ProductFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String CATEGORY = "param1";

    // TODO: Rename and change types of parameters
    private String category;

    public ProductFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param category Parameter 1.
     * @return A new instance of fragment ProductFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProductFragment newInstance(String category) {
        ProductFragment fragment = new ProductFragment();
        Bundle args = new Bundle();
        args.putString(CATEGORY, category);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            category = getArguments().getString(CATEGORY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_product, container, false);
        RecyclerView recyclerView=view.findViewById(R.id.rec_product);
        ArrayList<Product> products=Utils.getProductsByCategory(category);
        ProductAddpater addpater=new ProductAddpater(products);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(addpater);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}