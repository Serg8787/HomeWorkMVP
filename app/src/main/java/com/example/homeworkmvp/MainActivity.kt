package com.example.homeworkmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MainActivityContract.MainView {

    val presenter = MainActivityPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btFirstFragment.setOnClickListener {
            presenter.showFirstFragment()
        }
        btSecondFragment.setOnClickListener {
            presenter.showSecondFragment()
        }
        btThirdFrament.setOnClickListener {
            presenter.showThirdragment()
        }
    }

    override fun setFragment(fragment: Fragment) {
       supportFragmentManager.beginTransaction().replace(R.id.flFragments,fragment).commit()
    }

    override fun updateTopMenu(enumIte: Int) {
        TODO("Not yet implemented")
    }
}