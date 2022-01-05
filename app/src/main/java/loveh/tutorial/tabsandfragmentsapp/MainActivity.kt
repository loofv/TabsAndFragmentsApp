package loveh.tutorial.tabsandfragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tlTabLayout)
        val viewPager = findViewById<ViewPager2>(R.id.vpViewPager2)

        tabLayout.addTab(tabLayout.newTab().setText("First"))
        tabLayout.addTab(tabLayout.newTab().setText("Second"))

        val adapter = MainFragmentAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter
        viewPager.isUserInputEnabled = true

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "First fragment"
                }
                1 -> {
                    tab.text = "Second fragment"
                }
            }

        }.attach()

    }
}