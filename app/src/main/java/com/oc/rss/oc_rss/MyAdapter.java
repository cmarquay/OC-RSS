package com.oc.rss.oc_rss;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oc.rss.fake.FakeNews;
import com.oc.rss.fake.FakeNewsList;

import java.util.List;

/* Class that manages the activity_main layout's RecyclerView.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<FakeNews> list = FakeNewsList.all;
    private Context mContext;

    /* Constructor, we store the context since we are not in MainActivity.
     * @param the context
     */
    MyAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_cell, parent, false);
        //We pass the context to MyViewHolder
        return new MyViewHolder(view, mContext);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        FakeNews fakeNews = list.get(position);
        holder.display(fakeNews);
    }
}
