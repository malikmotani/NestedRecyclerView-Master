package com.nestedrecyclerviewmaster.android.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.nestedrecyclerviewmaster.android.R;
import com.nestedrecyclerviewmaster.android.adapters.VerticalRecyclerViewAdapter;
import com.nestedrecyclerviewmaster.android.models.HorizontalModel;
import com.nestedrecyclerviewmaster.android.models.VerticalModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rvVertical)
    RecyclerView rvVertical;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    ArrayList<VerticalModel> mArrayList = new ArrayList<>();

    VerticalRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);

        rvVertical.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        mAdapter = new VerticalRecyclerViewAdapter(this, mArrayList);

        rvVertical.setAdapter(mAdapter);

        setDataOnVerticalRecyclerView();
    }

    private void setDataOnVerticalRecyclerView() {
        for (int i = 1; i <= 5; i++) {

            VerticalModel mVerticalModel = new VerticalModel();

            mVerticalModel.setTitle("Title " + i);

            ArrayList<HorizontalModel> arrayList = new ArrayList<>();

            for (int j = 0; j <= 5; j++) {
                HorizontalModel mHorizontalModel = new HorizontalModel();
                mHorizontalModel.setDescription("Description : " + j);
                mHorizontalModel.setName("Name : " + j);
                arrayList.add(mHorizontalModel);
            }

            mVerticalModel.setArrayList(arrayList);

            mArrayList.add(mVerticalModel);

        }
        mAdapter.notifyDataSetChanged();
    }
}
