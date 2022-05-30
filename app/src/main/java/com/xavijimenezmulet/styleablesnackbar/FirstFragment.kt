package com.xavijimenezmulet.styleablesnackbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.xavijimenezmulet.customsnackbar.snackbar.StyleableSnackBar
import com.xavijimenezmulet.styleablesnackbar.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            StyleableSnackBar.snack(
                requireActivity().window.decorView.rootView as ViewGroup,
                "Custom Snack Bar",
                StyleableSnackBar.Type.SUCCESS,
                true,
                requireContext()
            )
        }
        binding.buttonSecond.setOnClickListener {
            StyleableSnackBar.snack(
                requireActivity().window.decorView.rootView as ViewGroup,
                "Custom Snack Bar",
                StyleableSnackBar.Type.SUCCESS,
                true,
                requireContext(),
                false
            )
        }
        binding.buttonThird.setOnClickListener {
            StyleableSnackBar.snack(
                requireActivity().window.decorView.rootView as ViewGroup,
                "Custom Snack Bar",
                StyleableSnackBar.Type.FAILURE,
                true,
                requireContext()
            )
        }
        binding.buttonFourth.setOnClickListener {
            StyleableSnackBar.snack(
                requireActivity().window.decorView.rootView as ViewGroup,
                "Custom Snack Bar",
                StyleableSnackBar.Type.FAILURE,
                true,
                requireContext(),
                false
            )
        }
        binding.buttonFifth.setOnClickListener {
            StyleableSnackBar.snack(
                requireActivity().window.decorView.rootView as ViewGroup,
                "Custom Snack Bar",
                StyleableSnackBar.Type.WARNING,
                true,
                requireContext()
            )
        }
        binding.buttonSixth.setOnClickListener {
            StyleableSnackBar.snack(
                requireActivity().window.decorView.rootView as ViewGroup,
                "Custom Snack Bar",
                StyleableSnackBar.Type.WARNING,
                true,
                requireContext(),
                false
            )
        }
        binding.buttonSeventh.setOnClickListener {
            StyleableSnackBar.snack(
                requireActivity().window.decorView.rootView as ViewGroup,
                "Custom Snack Bar",
                StyleableSnackBar.Type.INFORMATION,
                true,
                requireContext()
            )
        }
        binding.buttonEighth.setOnClickListener {
            StyleableSnackBar.snack(
                requireActivity().window.decorView.rootView as ViewGroup,
                "Custom Snack Bar",
                StyleableSnackBar.Type.INFORMATION,
                true,
                requireContext(),
                false
            )
        }
        binding.buttonNineth.setOnClickListener {
            StyleableSnackBar.customSnack(
                requireActivity().window.decorView.rootView as ViewGroup,
                "Custom Snack Bar",
                R.color.purple_500,
                com.xavijimenezmulet.customsnackbar.R.drawable.ic_launcher_foreground,
                R.color.white,
                true,
                0,
                context = requireContext()
            )
        }
        binding.buttonTenth.setOnClickListener {
            StyleableSnackBar.customSnack(
                requireActivity().window.decorView.rootView as ViewGroup,
                "Custom Snack BarCustom Snack BarCustom Snack BarCustom Snack BarCustom Snack BarCustom Snack BarCustom Snack BarCustom Snack BarCustom Snack BarCustom Snack BarCustom Snack BarCustom Snack BarCustom Snack BarCustom Snack Bar",
                R.color.purple_500,
                com.xavijimenezmulet.customsnackbar.R.drawable.ic_launcher_foreground,
                R.color.white,
                true,
                2,
                com.xavijimenezmulet.customsnackbar.R.color.styleableYellow,
                requireContext()
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}