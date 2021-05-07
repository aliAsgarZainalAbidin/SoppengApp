package id.deval.soppengapp.fragment.home

import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.PopupMenu
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import id.deval.soppengapp.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        card_home_lets.setOnClickListener(this)
        iv_home_menu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.card_home_lets -> {
                (activity as AppCompatActivity).findNavController(R.id.fragment_main_nav_host)
                    .navigate(R.id.action_homeFragment_to_destinationFragment)
            }

            R.id.iv_home_menu -> {
                var contextThemeWrapper = ContextThemeWrapper(context, R.style.PopupMenuOverlapAnchor)
                var popUpMenu = PopupMenu(contextThemeWrapper,iv_home_menu)
                popUpMenu.inflate(R.menu.menu_home)
                popUpMenu.setOnMenuItemClickListener {
                    when (it.itemId) {
                        R.id.help -> {
                            (activity as AppCompatActivity).findNavController(R.id.fragment_main_nav_host)
                                .navigate(R.id.action_homeFragment_to_helpFragment)
                        }

                        R.id.about -> {
                            (activity as AppCompatActivity).findNavController(R.id.fragment_main_nav_host)
                                .navigate(R.id.action_homeFragment_to_aboutFragment)
                        }
                    }
                    true
                }
                popUpMenu.show()
            }
        }
    }

}