package com.example.zapchat;

import android.os.Parcel;
import android.os.Parcelable;


public class User implements Parcelable {

    private String uuid;
    private String userName;
    private String profileUrl;

    public User() {
    }

    public User(String uuid, String userName, String profileUrl) {
        this.uuid = uuid;
        this.userName = userName;
        this.profileUrl = profileUrl;
    }

    protected User(Parcel in) {
        uuid = in.readString();
        userName = in.readString();
        profileUrl = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getUuid() {
        return uuid;
    }

    public String getUserName() {
        return userName;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uuid);
        dest.writeString(userName);
        dest.writeString(profileUrl);
    }
}
