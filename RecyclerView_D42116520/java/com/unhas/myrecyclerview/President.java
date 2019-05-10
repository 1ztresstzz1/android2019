package com.unhas.myrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class President implements Parcelable {
    private String name;
    private String remarks;
    private int photo;

    public President() {
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.remarks);
        parcel.writeString(String.valueOf(this.photo));
    }

    protected President(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = Integer.parseInt(in.readString());
    }

    public static final Creator<President> CREATOR = new Creator<President>() {
        @Override
        public President createFromParcel(Parcel source) {
            return new President(source);
        }

        @Override
        public President[] newArray(int size) {
            return new President[size];
        }
    };
}
