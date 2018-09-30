package com.example.baris.brsmvp.main.main;

import com.example.baris.brsmvp.main.models.MainModel;

import java.util.List;

public interface MainContract {

    interface MainPresenter{
        void requestDataFromServer();
    }

    interface MainView{
        void setDataToRecyclerView(List<MainModel> mainModelList);
    }

    interface MainIntractor{
        interface OnFinishListener{
            void onFinished(List<MainModel> mainModelList);
        }
        void getDataList(OnFinishListener onFinishListener);
    }
}
