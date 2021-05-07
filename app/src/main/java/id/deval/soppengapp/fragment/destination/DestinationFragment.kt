package id.deval.soppengapp.fragment.destination

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.PopupMenu
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.navigation.findNavController
import com.google.android.material.appbar.MaterialToolbar
import id.deval.soppengapp.R
import kotlinx.android.synthetic.main.fragment_destination.*
import kotlinx.android.synthetic.main.fragment_home.*

class DestinationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destination, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fl_destination_1.setOnClickListener {
            (activity as AppCompatActivity).findNavController(R.id.fragment_main_nav_host)
                .navigate(R.id.action_destinationFragment_to_detailFragment)
        }

        fl_destination_2.setOnClickListener {
            (activity as AppCompatActivity).findNavController(R.id.fragment_main_nav_host)
                .navigate(R.id.action_destinationFragment_to_detailFragment)
        }

        fl_destination_3.setOnClickListener {
            (activity as AppCompatActivity).findNavController(R.id.fragment_main_nav_host)
                .navigate(R.id.action_destinationFragment_to_detailFragment)
        }

        mt_destination.setNavigationOnClickListener {
            (activity as AppCompatActivity).findNavController(R.id.fragment_main_nav_host)
                .popBackStack()
        }

        mt_destination.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.help-> {
                    (activity as AppCompatActivity).findNavController(R.id.fragment_main_nav_host)
                        .navigate(R.id.action_destinationFragment_to_helpFragment)
                    true
                }
                R.id.about-> {
                    (activity as AppCompatActivity).findNavController(R.id.fragment_main_nav_host)
                        .navigate(R.id.action_destinationFragment_to_aboutFragment)
                    true
                }
                else -> true
            }
        }
    }

}