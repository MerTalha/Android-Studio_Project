package com.example.udemymap.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.udemymap.model.Place;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface PlaceDao {

    @Query("SELECT * FROM Place")
    default Flowable<List<Place>> getAll() {
        return null;
    }

    @Insert
    Completable insert(Place place);

    @Delete
    Completable delete(Place place);
}
