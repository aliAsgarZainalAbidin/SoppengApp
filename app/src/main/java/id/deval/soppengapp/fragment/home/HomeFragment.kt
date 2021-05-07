package id.deval.soppengapp.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.selayar.history.R
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
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.card_home_lets-> {
                (activity as AppCompatActivity).findNavController(R.id.fragment_main_nav_host)
                    .navigate(R.id.action_homeFragment_to_destinationFragment)

            }
        }
    }

}