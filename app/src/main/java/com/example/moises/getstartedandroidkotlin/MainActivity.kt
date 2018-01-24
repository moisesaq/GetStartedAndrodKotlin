package com.example.moises.getstartedandroidkotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.moises.getstartedandroidkotlin.frag1.Fragment1
import com.example.moises.getstartedandroidkotlin.frag2.Fragment2
import com.example.moises.getstartedandroidkotlin.main.MainContract
import com.example.moises.getstartedandroidkotlin.main.MainFragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector

import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector,
        MainFragment.OnMainFragmentListener {

    @Inject lateinit var injector: DispatchingAndroidInjector<Fragment>
    @Inject lateinit var mainFrag: MainFragment//MainContract.View

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        //mainView = MainFragment()
        replaceFragment(mainFrag, false)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun replaceFragment(fragment: Fragment?, addToStack: Boolean) {
        val transaction = supportFragmentManager.beginTransaction()
        if (addToStack)
            transaction.addToBackStack(fragment?.javaClass?.name)
        transaction.replace(R.id.content_main, fragment)
        transaction.commit()
    }

    /**
     * Implementation OnMainFragmentListener
     */
    override fun onGoFragment1Click() {
        replaceFragment(Fragment1(), true)
    }

    override fun onGoFragment2Click(message: String) {
        replaceFragment(Fragment2.newInstance(message), true)
    }

    /**
     * Implementation HasSupportFragmentInjector
     */
    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return injector
    }
}
