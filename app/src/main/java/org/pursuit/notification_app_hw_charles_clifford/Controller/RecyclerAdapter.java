package org.pursuit.notification_app_hw_charles_clifford.Controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.notification_app_hw_charles_clifford.R;
import org.pursuit.notification_app_hw_charles_clifford.model.ViewModel;
import org.pursuit.notification_app_hw_charles_clifford.view.ViewHolder;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<ViewModel> viewModelList;

    public RecyclerAdapter(List<ViewModel> viewModelList) {
        this.viewModelList = viewModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_layout,viewGroup,false);
          return new ViewHolder(childView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
       ViewModel viewModel = viewModelList.get(i);
        viewHolder.onBind(viewModel);


    }

    @Override
    public int getItemCount() {
        return viewModelList.size();
    }




}
