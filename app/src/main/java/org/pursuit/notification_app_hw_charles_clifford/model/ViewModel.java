package org.pursuit.notification_app_hw_charles_clifford.model;


public class ViewModel {
    private String message;
    private String imageUri;

    public ViewModel(String message, String imageUri) {
        this.message = message;
        this.imageUri = imageUri;
    }

    public String getMessage() {
        return message;
    }

    public String getImageUri() {
        return imageUri;
    }
}
