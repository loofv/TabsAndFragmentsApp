package loveh.tutorial.tabsandfragmentsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


class MainFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FirstFragment()
            }
            1 -> {
                SecondFragment()
            }
            else -> {
                FirstFragment()
            }
        }
    }
//    override fun createFragment(position: Int): Fragment {
//        when (position) {
//            0 -> {
//                val bundle = Bundle()
//                bundle.putString("fragmentName", "First Fragment")
//                val firstFragment = FirstFragment()
//                firstFragment.arguments = bundle
//                return firstFragment
//            }
//            1 -> {
//                val bundle = Bundle()
//                bundle.putString("fragmentName", "Second Fragment")
//                val secondFragment = SecondFragment()
//                secondFragment.arguments = bundle
//                return secondFragment
//            }
//            else -> {
//                return FirstFragment()
//            }
//        }
//    }

    override fun getItemCount(): Int {
        return 2
    }
}