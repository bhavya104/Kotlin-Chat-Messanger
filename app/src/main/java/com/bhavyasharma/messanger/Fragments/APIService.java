package com.bhavyasharma.messanger.Fragments;

import com.bhavyasharma.messanger.Notifications.MyResponse;
import com.bhavyasharma.messanger.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAJZqVdTU:APA91bHFX0aqTx1lI572F9T5eI1OIIEy3YjjlhUdQ43J3NMKZPf5Jl4iAXtD9VyQ5LiQyPHWhoR1HNNhHbQVip1gFyggpz3jPCO8koXfbWp_3FI0FPxioULhsnNryYyYNk6GPbgLoCr5"
    })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}