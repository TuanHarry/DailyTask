package com.example.tuantran.dailyworking.network;

import com.example.tuantran.dailyworking.network.model.Note;
import com.example.tuantran.dailyworking.network.model.User;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {
    // Register new user
    @FormUrlEncoded
    @POST("notes/user/register")
    Single<User> register(@Field("device_id") String deviceId);

    // Create new note
    @FormUrlEncoded
    @POST("notes/new")
    Single<Note> createNote(@Field("note") String note);

    // Fetch all note
    @GET("notes/all")
    Single<List<Note>> fetchAllNotes();

    // Update note by id
    @FormUrlEncoded
    @PUT("notes/{id}")
    Completable updateNote(@Path("id") int noteID, @Field("note") String note);

    // Delete note by id
    @DELETE("notes/{id}")
    Completable deleteNote(@Path("id") int noteID);
}
