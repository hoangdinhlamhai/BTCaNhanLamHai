package com.example.btcanhan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class CartFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        // Tạo danh sách dữ liệu
        List<ModelItem> items = new ArrayList<>();
        items.add(new ModelItem("Tên ảnh 1", "Mô tả ảnh 1"));
        items.add(new ModelItem("Tên ảnh 2", "Mô tả ảnh 2"));
        items.add(new ModelItem("Tên ảnh 3", "Mô tả ảnh 3"));

        // Tìm ListView trong layout
        ListView listView = view.findViewById(R.id.list_view);

        // Tạo Adapter và thiết lập cho ListView
        CartAdapter adapter = new CartAdapter(requireContext(), items);
        listView.setAdapter(adapter);

        return view;
    }
}
