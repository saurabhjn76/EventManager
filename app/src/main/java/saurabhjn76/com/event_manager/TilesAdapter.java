package saurabhjn76.com.event_manager;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by saurabh on 18/10/16.
 */

public class TilesAdapter extends RecyclerView.Adapter<TilesAdapter.MyViewHolder>{
    private List<Tile> tilesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, description, date;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.description);
            date = (TextView) view.findViewById(R.id.time);
        }
    }


    public TilesAdapter(List<Tile> moviesList) {
        this.tilesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tile_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Tile tile = tilesList.get(position);
        holder.title.setText(tile.getTitle());
        holder.description.setText(tile.getDescription());
        holder.date.setText(tile.getDate());
    }

    @Override
    public int getItemCount() {
        return tilesList.size();
    }
}
