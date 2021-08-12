package com.example.homeworkmvp

import androidx.fragment.app.Fragment

class MainActivityContract {

    interface MainView {
        fun setFragment(fragment: Fragment)
        fun updateTopMenu(enumIte: Int)
    }

    interface FirstFragmentView {
        fun setPresenter(presenter:Presenter)
    }
    interface SecondFragmentView {
        fun setPresenter(presenter:Presenter)
    }
    interface ThirdFragmentView {
        fun setPresenter(presenter:Presenter)
    }

    interface Presenter{
        fun getDbData()
        fun getServerData()
        fun showFirstFragment()
        fun showSecondFragment()
        fun showThirdragment()
    }


}