package com.example.btcanhan;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CartAdapter extends ArrayAdapter<ModelItem> {
    private Context context;
    private List<ModelItem> itemList;

    public CartAdapter(@NonNull Context context, @NonNull List<ModelItem> objects) {
        super(context, R.layout.list_item, objects);
        this.context = context;
        this.itemList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        // Lấy dữ liệu hiện tại
        ModelItem currentItem = itemList.get(position);

        // Ánh xạ view
        TextView itemName = convertView.findViewById(R.id.foodName);
        TextView itemDescription = convertView.findViewById(R.id.foodPrice);

        // Thiết lập dữ liệu
        itemName.setText(currentItem.getName());
        itemDescription.setText(currentItem.getDescription());


        return convertView;
    }
}

