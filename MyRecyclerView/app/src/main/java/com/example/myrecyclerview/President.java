package com.example.myrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class President implements Parcelable {
    private String name, remarks, photo;

    public President(){

    }

    protected President(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
    }

    public static final Parcelable.Creator<President> CREATOR = new Parcelable.Creator<President>() {
        @Override
        public President createFromParcel(Parcel source) {
            return new President(source);
        }

        @Override
        public President[] newArray(int size) {
            return new President[size];
        }
    };

    public String getName() {
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(remarks);
        dest.writeString(photo);
    }
}
