package Controler;



import Movie.Movie;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.moviesstore.R;
import view.DeteMain2Activity;

import java.util.List;


public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHoleder> {

    private List<Movie> listMovies;
    private Context context;

    public MoviesAdapter(List<Movie> listMovies,Context context) {
        this.listMovies = listMovies;
        this.context = context;

    }


    @NonNull
    @Override
    public MoviesAdapter.MyViewHoleder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_movies,parent,false);

        return new MyViewHoleder(item_view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.MyViewHoleder holder, int position) {

        Movie movie = listMovies.get(position);
        holder.title.setText(movie.getTitle());
        holder.year.setText(movie.getYear());
        holder.genre.setText(movie.getGenre());
       holder.image.setImageResource(movie.getImage());

    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    public class MyViewHoleder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView title,genre , year ;
        private ImageView image;


        public MyViewHoleder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            title = itemView.findViewById(R.id.Titele);
            genre =itemView.findViewById(R.id.Category);
            year = itemView.findViewById(R.id.Display_year);
            image = itemView.findViewById(R.id.imageView);
            

        }

        @Override
        public void onClick(View view) {

            int position = getAdapterPosition();
            Movie movie = listMovies.get(position);
            Intent intent = new Intent(context, DeteMain2Activity.class);

            intent.putExtra("title",movie.getTitle());
            intent.putExtra("genre",movie.getGenre());
            intent.putExtra("year",movie.getYear());
            intent.putExtra("image",movie.getImage());

            context.startActivity(intent);




        }
    }
}
