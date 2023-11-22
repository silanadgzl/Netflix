package com.example.netflix.ui.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.netflix.entity.Film;
import com.example.netflix.databinding.CardTasarimBinding;
import java.util.ArrayList;
import java.util.List;

public class FilmlerAdapter extends RecyclerView.Adapter<FilmlerAdapter.ViewHolder>{
    private final List<Film> filmListesi;
    private final Context context;

    public FilmlerAdapter(ArrayList<Film> filmListesi, Context context) {
        this.filmListesi = filmListesi;
        this.context = context;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final CardTasarimBinding tasarim;

        public ViewHolder(CardTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(context),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Film film = filmListesi.get(position);
        CardTasarimBinding t = holder.tasarim;

        t.imageViewFilm.setImageResource(context.getResources().getIdentifier(film.getResim(),
                "drawable", context.getPackageName()));

    }

    @Override
    public int getItemCount() {
        return filmListesi.size();
    }
}
