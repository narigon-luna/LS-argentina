package com.curso.lenguasdeseñas.ui.practica

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import androidx.core.content.PermissionChecker
import androidx.fragment.app.viewModels
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.FragmentGenaralBinding
import com.curso.lenguasdeseas.databinding.FragmentPracticaBinding
import com.curso.lenguasdeseñas.ui.general.GeneralViewModel
import com.curso.lenguasdeseñas.ui.general.adapter.GenaralAdapter
import dagger.hilt.android.AndroidEntryPoint
import java.lang.Exception

@AndroidEntryPoint
class PracticaFragment : Fragment() {


   // private val generalViewModel by viewModels<GeneralViewModel>()
    //private lateinit var generalAdapter: GenaralAdapter
   companion object {
       private const val CAMERA_PERMISSION = android.Manifest.permission.CAMERA
   }

    private var _binding: FragmentPracticaBinding? = null

    private val binding get() = _binding!!

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            startCamera()
        } else {
            Toast.makeText(
                requireContext(),
                "Acepta los permisos para poder continuar",
                Toast.LENGTH_LONG
            ).show()
        }
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // initUI()
        if (checkCameraPermission()) {
            startCamera()
        } else {
            requestPermissionLauncher.launch(CAMERA_PERMISSION)
        }
    }
    private fun startCamera() {
        val cameraProviderFuture = ProcessCameraProvider.getInstance(requireContext())

        cameraProviderFuture.addListener({
            val cameraProvider: ProcessCameraProvider = cameraProviderFuture.get()

            val preview = Preview.Builder()
                .build()
                .also {
                    it.setSurfaceProvider(binding.viewFinder.surfaceProvider)
                }

            val cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA

            try{
                cameraProvider.unbindAll()

                cameraProvider.bindToLifecycle(this, cameraSelector, preview)
            }catch (e: Exception){
                Log.e("edu", "Algo paso ${e.message}")
            }
        }, ContextCompat.getMainExecutor(requireContext()))
    }
    private fun checkCameraPermission(): Boolean {
        return PermissionChecker.checkSelfPermission(
            requireContext(), CAMERA_PERMISSION
        ) == PermissionChecker.PERMISSION_GRANTED
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPracticaBinding.inflate(layoutInflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_practica, container, false)
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
