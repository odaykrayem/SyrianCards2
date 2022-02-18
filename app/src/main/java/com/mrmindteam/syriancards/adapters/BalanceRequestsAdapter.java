package com.mrmindteam.syriancards.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.mrmindteam.syriancards.R;
import com.mrmindteam.syriancards.models.Request;

import java.util.ArrayList;
import java.util.List;

public class BalanceRequestsAdapter extends RecyclerView.Adapter<BalanceRequestsAdapter.ViewHolder> {


    Context context;
    private List<Request> requests;

    // RecyclerView recyclerView;
    public BalanceRequestsAdapter(Context context, ArrayList<Request> requests) {
        this.context = context;
        this.requests = requests;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item_balance_request, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Request request = requests.get(position);
        holder.amount.setText(request.getAmount());
        holder.date.setText(request.getCreate_at());
        holder.status.setText(request.getStatus());

    }


    @Override
    public int getItemCount() {
        return requests.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView amount, date, status;
        public ViewHolder(View itemView) {
            super(itemView);
            this.amount = itemView.findViewById(R.id.amount);
            this.date = itemView.findViewById(R.id.date);
            this.status = itemView.findViewById(R.id.status);

        }
    }


}
