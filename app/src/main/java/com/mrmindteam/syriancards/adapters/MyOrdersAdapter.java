package com.mrmindteam.syriancards.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mrmindteam.syriancards.R;
import com.mrmindteam.syriancards.models.Order;
import com.mrmindteam.syriancards.models.Request;

import java.util.ArrayList;
import java.util.List;

public class MyOrdersAdapter extends RecyclerView.Adapter<MyOrdersAdapter.ViewHolder> {


    Context context;
    private List<Order> orders;

    // RecyclerView recyclerView;
    public MyOrdersAdapter(Context context, ArrayList<Order> orders) {
        this.context = context;
        this.orders = orders;
    }

    @NonNull
    @Override
    public MyOrdersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item_order, parent, false);
        MyOrdersAdapter.ViewHolder viewHolder = new MyOrdersAdapter.ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyOrdersAdapter.ViewHolder holder, int position) {

        Order order = orders.get(position);

        holder.cardName.setText(order.getCard_name());
        holder.cardType.setText(order.getCard_type());
        holder.quantity.setText(order.getQuantity());
        holder.date.setText(order.getDate());
        holder.status.setText(order.getStatus());

    }


    @Override
    public int getItemCount() {
        return orders.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView cardName, cardType, quantity, date, status;
        public ViewHolder(View itemView) {
            super(itemView);

            this.cardName = itemView.findViewById(R.id.card_name);
            this.cardType = itemView.findViewById(R.id.card_type);
            this.quantity = itemView.findViewById(R.id.quantity);
            this.date = itemView.findViewById(R.id.date);
            this.status = itemView.findViewById(R.id.status);

        }
    }


}
