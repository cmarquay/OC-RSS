package com.oc.rss.oc_rss;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.oc.rss.fake.FakeNews;

/* Class that manages the list_cell layout inside the activity_main layout's RecyclerView.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    private FakeNews currentFake;
    private TextView title;

    /* Constructor, the parameters are declared final because they are needed inside the setOnClickListener.
     * @param the view
     * @param the context
     */
    public MyViewHolder(final View itemView, final Context context) {
        super(itemView);

        title = ((TextView) itemView.findViewById(R.id.title));

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //When clicking on an item, an intent is sent with both String title and htmlContent
                //We are not in MainActivity, so we use context instead of this
                Intent intent = new Intent(context, WebActivity.class);
                intent.putExtra("title", currentFake.title);
                intent.putExtra("htmlContent", currentFake.htmlContent);
                context.startActivity(intent);
            }
        });
    }

    /* Method that displays FakeNews titles in the RecyclerView.
     * @param the FakeNews whose title we want to display
     */
    public void display(FakeNews fake) {
        currentFake = fake;
        title.setText(fake.title);
    }
}