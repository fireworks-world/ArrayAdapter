package com.example.arrayadapter;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

    Context context;
    String[] ListItemsName;
    int[] ImageName;
    LayoutInflater inflater;

    public ListAdapter(Context context, String[] ListItemsName, int[] ImageName) {
this.context=context;
        this.ListItemsName = ListItemsName;
        this.ImageName = ImageName;
        inflater= (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return ListItemsName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup parent) {
         view = inflater.inflate(R.layout.listview, null, true);

        TextView ListViewItems = (TextView) view.findViewById(R.id.textView1);
        ImageView ListViewImage = (ImageView) view.findViewById(R.id.imageView1);

        ListViewItems.setText(ListItemsName[i]);
        ListViewImage.setImageResource(ImageName[i]);
        return view;

    }

    ;
}
