package com.curso.lenguasdeseñas.ui.mundo

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.curso.lenguasdeseas.databinding.FragmentMundoBinding
import com.curso.lenguasdeseñas.data.provider.provider.provider.MundoProvider
import com.curso.lenguasdeseñas.dominio.model.model.mundomodel.MundoModel


import com.curso.lenguasdeseñas.ui.mundo.mundoadapter.MundoAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MundoFragment : Fragment() {

    private lateinit var mundoAdapter: MundoAdapter
    private var mundoMutableList: MutableList<MundoModel> =
       MundoProvider.mundoList.toMutableList()
   // private val llmanager = LinearLayoutManager(context)
    private var _binding:FragmentMundoBinding ?= null

    private val binding get() = _binding!!

    override fun onViewCreated(view: View,savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)
        binding.etFilter.addTextChangedListener {
     val mundoFilters = mundoMutableList.filter { mundo -> mundo.texto.contains(it.toString()) }

            mundoAdapter.updateMundo(mundoFilters)
        }
        initUI()
        }
  /** private fun crearMundo() {
        val mundo = MundoModel(
            "",
            "",
            "??????",
            "()"
        )
       mundoMutableList.add(index = 3, mundo)
       mundoAdapter.notifyItemInserted(3)
      // llmanager.scrollToPositionWithOffset(3,10)


    }*/

    private fun initUI() {
   mundoAdapter = MundoAdapter(
       mundoList = mundoMutableList
   )
       // binding.etFilter.addTextChangedListener { userFilter ->
           // val modelFilter = mundoMutableList.filter { mundoModel -> mundoModel.texto.contains(userFilter.toString())  }
     //  mundoAdapter.updateList(modelFilter)
       // }
        binding.recyclerMundo.layoutManager = LinearLayoutManager(context)
        binding.recyclerMundo.adapter = mundoAdapter
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMundoBinding.inflate(layoutInflater, container, false)
        return binding.root

    }
}





  /** // private val mundoViewModel by viewModels<MundoViewModel> ()
    private lateinit var mundoAdapter: MundoAdapter


    private  var _binding: com.curso.lenguasdeseas.databinding.FragmentMundoBinding? = null

    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    val jsonString = context?.assets?.open("datos.json")?.bufferedReader().use { it?.readText() }
    val mundoList = Gson().fromJson(jsonString, Array<MundoModel>::class.java).toList()

    fun buscarCoincidencias(query: String): List<MundoModel> {
        return mundoList.filter { it.texto.startsWith(query, ignoreCase = true) }
    }

        private fun initUI() {
      binding.

        }
}
override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.menu_main, menu)
    val searchItem = menu?.findItem(R.id.action_search)
    val searchView = searchItem?.actionView as SearchView
    searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String?): Boolean {
            return false
        }

        override fun onQueryTextChange(newText: String?): Boolean {
            newText?.let {
                val results = buscarCoincidencias(it)
                adapter.actualizarLista(results)
            }
            return true
        }
    })
    return true
}



   /** private fun  initUI() {
       mundoAdapter = MundoAdapter(onItemSelecte = {
            when(it){
                MundoInfo.Apellido -> MundoModel.Apellido
                MundoInfo.B -> MundoModel.B
                MundoInfo.Casado -> MundoModel.Casado
                MundoInfo.Edad -> MundoModel.Edad
            }
        })
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                initUIState(query.orEmpty())
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })

        binding.recyclerMundo.setHasFixedSize(true)
        binding.recyclerMundo.layoutManager = LinearLayoutManager(context)
        binding.recyclerMundo.adapter = mundoAdapter
      /**  binding.recyclerMundo.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = mundoAdapter
        }*/
    }
    private fun initUIState(query: String) {
        CoroutineScope(Dispatchers.IO).launch {
        val myMundo: List<MundoModel> = retrofit.create(MundoService::class.java).getMundo(query)
            if (myMundo.isEmpty()){
                Log.i("narigon", "funciona")
            val mundo: MundoModel? = myMundo.component1()
            if (mundo != null){
                Log.i("narigon", mundo.texto)

                mundoAdapter.updateList(myMundo
                )
            }
        }else{
            Log.i("narigon","no funca")
            }
    }
   /** private fun initUIState(query: String) {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                mundoViewModel.mundo.collect {
                    mundoAdapter.updateList(it)
                }
            }
        }
    }*/
    }
    private fun getRetrofit(): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl("C:\\Users\\manue\\AndroidStudioProjects\\LenguasDeSeas\\")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMundoBinding.inflate(layoutInflater, container, false)
        return binding.root

    }


}*/