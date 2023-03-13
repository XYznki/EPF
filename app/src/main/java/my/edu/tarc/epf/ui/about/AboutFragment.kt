package my.edu.tarc.epf.ui.about

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import my.edu.tarc.epf.R
import my.edu.tarc.epf.databinding.FragmentAboutBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [AboutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutFragment : Fragment() {
    private var _binding : FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonWebsite.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            //intent.setData(Uri.parse("https://www.kwsp.gov.my/"))
            intent.data = (Uri.parse("https://www.kwsp.gov.my/"))
            startActivity(intent)
        }
        binding.buttonEmail.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO)
            with(intent){
                data = Uri.parse("mailto:service@kwsp.gov.my")
                putExtra("subject", "Request for Service")
            }
            startActivity(intent)
        }
        binding.buttonCall.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("tel:0389226000"))
            startActivity(intent)
        }
        binding.buttonLocate.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("geo:3.2023212944051145, 101.7170799"))
            startActivity(intent)
        }
    }

}