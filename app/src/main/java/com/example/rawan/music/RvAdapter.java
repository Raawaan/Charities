package com.example.rawan.music;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rawan on 8/2/18.
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder>{
    private Context context;
    private List<SongData> listItems;
    public RvAdapter(List<SongData> listItems,Context con) {
        this.context=con;
        this.listItems = listItems;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutHolderView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.list_view_items,
                parent,
                false);
        return new ViewHolder(layoutHolderView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setContent(listItems.get(position));

    }
    @Override
    public int getItemCount() {
        return listItems.size();}

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nameView;
        private Button btn;
        private LinearLayout rv;
        private TextView band;
        String n;
        public ViewHolder(View itemView) {
            super(itemView);
            band= (TextView) itemView.findViewById(R.id.band);
            nameView = (TextView)itemView.findViewById(R.id.name);
            btn = (Button) itemView.findViewById(R.id.btn);
            rv =(LinearLayout) itemView.findViewById(R.id.linerLayout);
        }
        public void setContent( final SongData listOfSongs)
        {
            nameView.setText("Song Name: "+listOfSongs.getName());
            band.setText("Band: "+listOfSongs.getBand());
            n = listOfSongs.getDownload();
rv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, player.class);
        intent.putExtra("link", listOfSongs.getLink());
        context.startActivity(intent);
    }
});
              btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    context.startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(n)));
                }
            });
        }
    }
}