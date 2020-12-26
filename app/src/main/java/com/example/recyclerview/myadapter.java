package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter extends FirebaseRecyclerAdapter<model, myadapter.ProgrammingViewHolder> {

    public myadapter(FirebaseRecyclerOptions<model> options){
        super(options);
    };
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);

        return new ProgrammingViewHolder(view);
    }


    @Override
    protected void onBindViewHolder(@NonNull ProgrammingViewHolder programmingViewHolder, int i, @NonNull model model) {
        programmingViewHolder.txtTitle.setText(model.getPerson());
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{

        TextView txtTitle;

        public ProgrammingViewHolder(View itemView){
            super(itemView);
            txtTitle=itemView.findViewById(R.id.txtTitle);


        }
    }
}
