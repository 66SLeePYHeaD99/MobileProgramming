package com.example.midterm;

import android.view.View;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<String> text = new MutableLiveData<>();

    public void setText(String value) {
        text.setValue(value);
    }

    public LiveData<String> getText() {
        return text;
    }
}
