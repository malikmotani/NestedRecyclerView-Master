package com.nestedrecyclerviewmaster.android.models;

import java.util.ArrayList;

public class VerticalModel {

   private String title;
   private ArrayList<HorizontalModel> arrayList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<HorizontalModel> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<HorizontalModel> arrayList) {
        this.arrayList = arrayList;
    }
}
