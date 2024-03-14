package com.example.testexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SinhVienAdapter extends ArrayAdapter<SinhVien> {

    public SinhVienAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public SinhVienAdapter(@NonNull Context context, int resource, @NonNull List<SinhVien> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.sinhvien, parent, false);
        }

        // Lấy đối tượng SinhVien tại vị trí position
        SinhVien sinhVien = getItem(position);

        // Tìm và gán dữ liệu vào các TextView trong layout sinhvien.xml
        TextView textViewName = listItemView.findViewById(R.id.textViewName);
        TextView textViewYear = listItemView.findViewById(R.id.textViewYear);
        TextView textViewMark = listItemView.findViewById(R.id.textViewMark);

        textViewName.setText("Name: " + sinhVien.getName());
        textViewYear.setText("Year of Birth: " + sinhVien.getYearOfBirth());
        textViewMark.setText("Mark: " + sinhVien.getMark());

        return listItemView;
    }
}
