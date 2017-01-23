package com.alandwiprasetyo.mvp.utils;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by alandwiprasetyo on 11/23/16.
 */
import static com.google.common.base.Preconditions.checkNotNull;

public class ActivityUtils {

    /**
     * @param fragmentManager
     * @param fragment
     * @param frameId
     */
    public static void addFragment(@NonNull FragmentManager fragmentManager,
                                   @NonNull Fragment fragment,
                                   int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment);
        transaction.commit();
    }
}
