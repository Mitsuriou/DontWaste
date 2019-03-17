package fr.iutbm.dontwaste;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MealListAdapter extends RecyclerView.Adapter<MealViewHolder> {

    private List<Meal> mealList;
    private Context context;

    public MealListAdapter(List<Meal> mealList, Context context) {
        this.mealList = mealList;
        this.context = context;
    }

    @Override
    public MealViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_meal, parent, false);
        return new MealViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MealViewHolder holder, int position) {
        Meal meal = mealList.get(position);
        holder.mealNameView.setText(meal.getMealName());
        holder.latitudeView.setText("" + meal.getLatitude());
        holder.longitudeView.setText("" + meal.getLongitude());

//        try {
//            String imageName = meal.getBmppath();
//            InputStream ims = context.getAssets().open(imageName);
//            Drawable d = Drawable.createFromStream(ims, null);
//            holder.pictureView.setImageDrawable(d);
//            ims.close();
//        } catch (IOException ex){
//            return;
//        }
    }

    @Override
    public int getItemCount() {
        return mealList.size();
    }
}
