package com.example.abhiu.tnapp.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.example.abhiu.tnapp.Adapter.RestaurantsAdapter;
import com.example.abhiu.tnapp.Fragments.AboutMeFragment;
import com.example.abhiu.tnapp.R;
import com.example.abhiu.tnapp.Util.APIUtil;
import com.example.abhiu.tnapp.entity.ConnectionDetector;
import com.example.abhiu.tnapp.entity.FactualResponse;
import com.example.abhiu.tnapp.entity.Restaurant;
import java.util.ArrayList;
import java.util.List;
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<FactualResponse>, SearchView.OnQueryTextListener {

    private SearchView searchView;
    private ProgressDialog progressDialog;
    private MenuItem actionSearch;
    private RecyclerView recyclerView;
    private RestaurantsAdapter restaurantsAdapter;
    private TextView cityTitle;
    // flag for Internet connection status
    Boolean isInternetPresent = false;
    // Connection detector class
    ConnectionDetector cd;
    List<Restaurant> restaurantList = new ArrayList<>();

    private RelativeLayout frontpage;
    private final String SEARCH_CRITERIA = "Search term should be 3 or more characters";
    private final String SEARCH_RESULTS="Displaying search results";
    private final String ERROR="An error occured";
    private final String SEARCH="Searching restaurants in ";
    private final String RESTAURANT="Restaurants in ";
    private final String INTERNET_ERROR="Error:No Internet Connection";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Restaurant Finder");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        restaurantsAdapter = new RestaurantsAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(restaurantsAdapter);
        cityTitle = (TextView) findViewById(R.id.cityTitle);
        cityTitle.setText("");
        cd = new ConnectionDetector(getApplicationContext());
        isInternetPresent = cd.isConnectingToInternet();
        frontpage = (RelativeLayout) findViewById(R.id.layout1);
        recyclerView.setVisibility(RecyclerView.GONE);
        frontpage.setVisibility(RelativeLayout.VISIBLE);
        fancyAnimation();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        actionSearch = menu.findItem(R.id.action_search);
        searchView = (SearchView) actionSearch.getActionView();
        searchView.setOnQueryTextListener(this);
        return true;
    }
    //Function to execute the Menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.about_me) {
             //Calling Fragment
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.mainactivity, AboutMeFragment.newInstance(R.id.about_me))
                    .commit();
            Toast.makeText(getApplicationContext(), "Loading 'About Me' fragment", Toast.LENGTH_SHORT).show();
            return true;
        }

        if(id==R.id.mainactivity){
            //Launching Main Activity
            Intent i = new Intent(this, com.example.abhiu.tnapp.activities.MainActivity.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(), "Launching MainActivity", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onResponse(Call<FactualResponse> call, Response<FactualResponse> response) {
        progressDialog.dismiss();
        if (response != null && response.body() != null) {
            List<Restaurant> restaurantList = response.body().getResponse().getData();
            restaurantsAdapter.setRestaurantList(restaurantList);
            frontpage.setVisibility(RelativeLayout.GONE);
            // Delay
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    recyclerView.setVisibility(RecyclerView.VISIBLE);
                }
            }, 300);
            Toast.makeText(MainActivity.this, SEARCH_RESULTS, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onFailure(Call<FactualResponse> call, Throwable t) {
        Log.e("TNAPP", "API Error");
        progressDialog.dismiss();
        Toast.makeText(this,ERROR , Toast.LENGTH_SHORT).show();
    }

    // search function
    @Override
    public boolean onQueryTextSubmit(final String query) {
        if (isInternetPresent) {

            if (query.length() >= 3) {
                if (progressDialog != null && progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
                progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                progressDialog.setMessage(SEARCH + query);
                progressDialog.show();
                APIUtil.getRestaurantsByLocality(query, MainActivity.this);
                actionSearch.collapseActionView();
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        cityTitle.setText(RESTAURANT + query);
                    }
                }, 900);
            } else {
                Toast.makeText(MainActivity.this,SEARCH_CRITERIA, Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(MainActivity.this,INTERNET_ERROR , Toast.LENGTH_LONG).show();
        }
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        // UserFeedback.show( "SearchOnQueryTextChanged: " + s);
        return false;
    }
      //Animation for RecyclerView
    private void fancyAnimation() {
        AlphaInAnimationAdapter alphaInAnimationAdapter = new AlphaInAnimationAdapter(restaurantsAdapter);
        recyclerView.setAdapter(new ScaleInAnimationAdapter(alphaInAnimationAdapter));

    }
}
