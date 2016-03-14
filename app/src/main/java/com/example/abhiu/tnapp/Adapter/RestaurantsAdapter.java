package com.example.abhiu.tnapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.abhiu.tnapp.R;
import com.example.abhiu.tnapp.entity.Restaurant;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhilash on 3/11/2016.
 */
public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.RestaurantViewHolder> {

    List<Restaurant> restaurantList = new ArrayList<>();

    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.restaurant_item, null);
        return new RestaurantViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        Restaurant restaurant = restaurantList.get(position);
        holder.txtName.setText(restaurant.getName());
        holder.descp.setText(restaurant.getAddress());

        List<List<String>> categoryLabels = restaurant.getCategoryLabels();
        List<String> categoryItem = categoryLabels.get(0);
        String category = categoryItem.get(categoryItem.size() - 1);
        //String category = restuarant.getCategoryLabels().get(0).get(restuarant.getCategoryLabels().get(0).size() - 1);
        if (category != null) {
            holder.restaurantType.setText(category);
        }
        Float rating = restaurant.getRating().floatValue();
        holder.ratingbar.setRating(rating);
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView descp;
        RatingBar ratingbar;
        TextView restaurantType;
        public RestaurantViewHolder(View itemView) {
            super(itemView);
            Initialiseview(itemView);
        }

        private void Initialiseview(View itemView) {
            txtName = (TextView) itemView.findViewById(R.id.txt_name);
            descp = (TextView) itemView.findViewById(R.id.desc);
            ratingbar = (RatingBar) itemView.findViewById(R.id.ratingBar);
            restaurantType = (TextView) itemView.findViewById(R.id.restaurantType);
        }
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
        notifyDataSetChanged();
    }

   }
