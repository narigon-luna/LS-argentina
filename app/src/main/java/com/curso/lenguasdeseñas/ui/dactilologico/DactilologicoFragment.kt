package com.curso.lenguasdeseñas.ui.dactilologico

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseas.databinding.FragmentDactilologicoBinding
import com.curso.lenguasdeseas.databinding.FragmentGenaralBinding
import com.curso.lenguasdeseñas.dominio.model.model.dactilomodel.DactilologicoInfo
import com.curso.lenguasdeseñas.dominio.model.model.dactilomodel.DactilologicoModel
import com.curso.lenguasdeseñas.ui.dactilologico.dactilologicoadapter.DactilologicoAdapter
import com.curso.lenguasdeseñas.ui.general.GeneralViewModel
import com.curso.lenguasdeseñas.ui.general.adapter.GenaralAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DactilologicoFragment : Fragment() {


   private val dactilologicoViewModel by viewModels<DactilologicoViewModel>()
    private lateinit var dactilologicoAdapter: DactilologicoAdapter

    private var _binding: FragmentDactilologicoBinding? = null

    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initList()
        initUIState()
    }

    private fun initList() {
        dactilologicoAdapter = DactilologicoAdapter(onItemSelecte = {
            when(it){
                DactilologicoInfo.A -> DactilologicoModel.A
                DactilologicoInfo.B -> DactilologicoModel.B
                DactilologicoInfo.C -> DactilologicoModel.C
                DactilologicoInfo.D ->  DactilologicoModel.D
                DactilologicoInfo.E ->  DactilologicoModel.E
                DactilologicoInfo.F ->   DactilologicoModel.F
                DactilologicoInfo.G ->  DactilologicoModel.G
                DactilologicoInfo.H ->  DactilologicoModel.H
                DactilologicoInfo.I -> DactilologicoModel.I
                DactilologicoInfo.J ->  DactilologicoModel.J
                DactilologicoInfo.K -> DactilologicoModel.K
                DactilologicoInfo.L ->  DactilologicoModel.L
                DactilologicoInfo.LL ->  DactilologicoModel.LL
                DactilologicoInfo.M ->  DactilologicoModel.M
                DactilologicoInfo.N ->  DactilologicoModel.N
                DactilologicoInfo.Ñ ->  DactilologicoModel.Ñ
                DactilologicoInfo.O ->  DactilologicoModel.O
                DactilologicoInfo.P ->  DactilologicoModel.P
                DactilologicoInfo.Q ->  DactilologicoModel.Q
                DactilologicoInfo.R ->  DactilologicoModel.R
                DactilologicoInfo.RR ->  DactilologicoModel.RR
                DactilologicoInfo.S ->  DactilologicoModel.S
                DactilologicoInfo.T ->  DactilologicoModel.T
                DactilologicoInfo.U ->  DactilologicoModel.U
                DactilologicoInfo.V ->  DactilologicoModel.V
                DactilologicoInfo.W ->  DactilologicoModel.W
                DactilologicoInfo.X -> DactilologicoModel.X
                DactilologicoInfo.Y ->  DactilologicoModel.Y
                DactilologicoInfo.Z ->  DactilologicoModel.Z

            }
        })
        binding.rvDactilologico.apply {
          //  layoutManager = GridLayoutManager(context, 2)
           layoutManager = LinearLayoutManager(context)
            adapter = dactilologicoAdapter
        }

    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                dactilologicoViewModel.dactilologico .collect {
                    //Cambio de general
                    dactilologicoAdapter.updateList(it)
                }
            }
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDactilologicoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    /** override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        val nuevaSeña = getString()
        binding.tvShare.setOnClickListener { sharedResult(nuevaSeña )}
    }

    private fun getString(): String {
         return "nada"
    }

    private fun sharedResult(seña: String) {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, seña)
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDactilologicoBinding.inflate(layoutInflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_dactilologico, container, false)
    }*/


}