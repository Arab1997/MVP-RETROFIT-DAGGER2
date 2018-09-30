package com.example.baris.brsmvp.main.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainModel {
    @SerializedName("post_id")
    @Expose
    private String postId;
    @SerializedName("post_user_id")
    @Expose
    private String postUserId;
    @SerializedName("first_photo")
    @Expose
    private String firstPhoto;
    @SerializedName("sec_photo")
    @Expose
    private String secPhoto;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("post_time")
    @Expose
    private String postTime;
    @SerializedName("post_user_name")
    @Expose
    private String postUserName;
    @SerializedName("post_username")
    @Expose
    private String postUsername;
    @SerializedName("post_user_photo_path")
    @Expose
    private String postUserPhotoPath;
    @SerializedName("commentCount")
    @Expose
    private String commentCount;
    @SerializedName("registerType")
    @Expose
    private String registerType;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostUserId() {
        return postUserId;
    }

    public void setPostUserId(String postUserId) {
        this.postUserId = postUserId;
    }

    public String getFirstPhoto() {
        return firstPhoto;
    }

    public void setFirstPhoto(String firstPhoto) {
        this.firstPhoto = firstPhoto;
    }

    public String getSecPhoto() {
        return secPhoto;
    }

    public void setSecPhoto(String secPhoto) {
        this.secPhoto = secPhoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getPostUserName() {
        return postUserName;
    }

    public void setPostUserName(String postUserName) {
        this.postUserName = postUserName;
    }

    public String getPostUsername() {
        return postUsername;
    }

    public void setPostUsername(String postUsername) {
        this.postUsername = postUsername;
    }

    public String getPostUserPhotoPath() {
        return postUserPhotoPath;
    }

    public void setPostUserPhotoPath(String postUserPhotoPath) {
        this.postUserPhotoPath = postUserPhotoPath;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }
}
