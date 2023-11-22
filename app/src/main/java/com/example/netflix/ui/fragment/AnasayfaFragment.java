package com.example.netflix.ui.fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.example.netflix.databinding.FragmentAnasayfaBinding;
import com.example.netflix.entity.FilmList;
import com.example.netflix.ui.adapter.FilmlerAdapter;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.popular.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        binding.trending.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        binding.watch.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));


      FilmlerAdapter filmlerAdapter = new FilmlerAdapter(FilmList.getPopuler(),requireContext());
      binding.popular.setAdapter(filmlerAdapter);


    FilmlerAdapter gA = new FilmlerAdapter(FilmList.getGundemdekiler(),requireContext());
    binding.trending.setAdapter(gA);


    FilmlerAdapter yi = new FilmlerAdapter(FilmList.getYenidenIzle(),requireContext());
    binding.watch.setAdapter(yi);


      return binding.getRoot();
    }
}