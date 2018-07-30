package com.peacecorps.malaria.utils;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AppExecutors implements Executor {
    private final Executor mDiskIO;
    private final Executor mainThreadExecutor;
    @Override
    public void execute(@NonNull Runnable command) {
        mDiskIO.execute(command);

    }

    @VisibleForTesting
    private AppExecutors(Executor diskIO, Executor mainThread) {
        this.mDiskIO = diskIO;
        this.mainThreadExecutor = mainThread;
    }

    AppExecutors() {
        this(new DiskIOThreadExecutor(),new MainThreadExecutor());
    }


    public Executor diskIO() {
        return mDiskIO;
    }

    public Executor mainThread() {
        return mainThreadExecutor;
    }

    private static class MainThreadExecutor implements Executor {
        private Handler mainThreadHandler = new Handler(Looper.getMainLooper());

        @Override
        public void execute(@NonNull Runnable command) {
            mainThreadHandler.post(command);
        }
    }

    private static class DiskIOThreadExecutor implements Executor {

        private final Executor mDiskIO;

        DiskIOThreadExecutor() {
            mDiskIO = Executors.newSingleThreadExecutor();
        }

        @Override
        public void execute(@NonNull Runnable command) {
            mDiskIO.execute(command);
        }
    }
}
