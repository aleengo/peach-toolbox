package com.aleengo.peach.toolbox.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aleengo.peach.toolbox.common.PeachConfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;


/**
 * Created by CK_ALEENGO on 20/02/2019.
 * Copyright (c) 2019. All rights reserved.
 */
public abstract class BaseFragment extends Fragment implements BaseUI {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onCreated().");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onAttach().");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onCreateView().");
        return inflater.inflate(getLayoutResId(), container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onViewCreated().");
        ButterKnife.bind(this, view);
        initialize(view, savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onSaveInstanceState().");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onActivityCreated().");
    }

    @Override
    public void onStart() {
        super.onStart();
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onStart().");
    }

    @Override
    public void onResume() {
        super.onResume();
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onResume().");
    }

    @Override
    public void onPause() {
        super.onPause();
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onPause().");
    }

    @Override
    public void onStop() {
        super.onStop();
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: OnStop().");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onDestroyView().");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onDestroy().");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (PeachConfig.isDebug()) Log.d(getClassName(), "EVENT: onDetach().");
    }

    /**
     * Performs initialization
     *
     * This method is called by [onViewCreated()] for a {@link androidx.fragment.app.Fragment}
     */
    protected abstract void initialize(@NonNull View view, @Nullable Bundle savedInstanceState);
}