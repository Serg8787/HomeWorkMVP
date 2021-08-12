package com.example.homeworkmvp

import androidx.fragment.app.Fragment

class MainActivityPresenter(val mainView: MainActivityContract.MainView):MainActivityContract.Presenter {

    override fun getDbData() {
        TODO("Not yet implemented")
    }

    override fun getServerData() {
        TODO("Not yet implemented")
    }

    override fun showFirstFragment() {
        val fragment = FirstFragment()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showSecondFragment() {
        val fragment = SecondFragment()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showThirdragment() {
        val fragment = ThirdFragment()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }
}