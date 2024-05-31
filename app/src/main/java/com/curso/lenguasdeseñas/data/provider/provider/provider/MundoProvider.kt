package com.curso.lenguasdeseñas.data.provider.provider.provider

import com.curso.lenguasdeseas.R
import com.curso.lenguasdeseñas.dominio.model.model.gramaticamodel.GramaticaInfo
import com.curso.lenguasdeseñas.dominio.model.model.mundomodel.MundoInfo
import com.curso.lenguasdeseñas.dominio.model.model.mundomodel.MundoModel
import javax.inject.Inject
class MundoProvider {
    companion object{
        val mundoList = listOf<MundoModel>(
            //A
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"anillo",R.string.anill ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"anteojos",R.string.anteojo ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"anillo",R.string.anill ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"aros",R.string.aro ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"ascensor",R.string.ascen ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"año",R.string.añ ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"abril",R.string.ab ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"agosto",R.string.agos ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"a",R.string.a),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"abuelo/a", R.string.abu),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"aburrido",R.string.aburri ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"abril",R.string.abril),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"ahijado",R.string.ahij ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"abuelo/a",R.string.abu ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"adulto",R.string.ad),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"agosto",R.string.agos),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"alegre",R.string.ale),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"alto",R.string.alt ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"amante",R.string.amant),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"amigo",R.string.amix ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"antipatico",R.string.antip),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"año",R.string.añ ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"apellido",R.string.apell),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"arroba",R.string.arro ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"aqui",R.string.aq ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"ahi",R.string.ah),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"alli",R.string.all ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"amarillo",R.string.amari ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"anaranjado",R.string.anaran ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"azul",R.string.az ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"acto",R.string.ac ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"aprender",R.string.apren ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"aprobar",R.string.aprob ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"atento",R.string.att ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"ausente",R.string.aus ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"auto",R.string.auto ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"avion",R.string.avi ),

            //B

            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"baño",R.string.bañ ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"barco",R.string.barc ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"bicicleta",R.string.bici ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"bajo",R.string.baj),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"barba",R.string.bar ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"bastante",R.string.bastan),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"bueno",R.string.bun),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"bebe",R.string.be),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"beige",R.string.beig ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"blusa",R.string.bls ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"bufanda",R.string.bufan ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"blanco",R.string.blac ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"bien",R.string.bi ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"bienvenido",R.string.bv ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"buen Dia",R.string.bd ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"buenas Tardes",R.string.bt ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"buenas Noches,",R.string.bn ),
            //C
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cadena",R.string.cade ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"camisa",R.string.camis ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"campera",R.string.campe ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cartera",R.string.carter ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cinto",R.string.cint ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cocina",R.string.cocin ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"comedor",R.string.comed ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"camping/carpa",R.string.camp ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cine",R.string.cin ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"colectivo",R.string.cole ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"camion",R.string.cami ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"calor",R.string.calor ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"casado",R.string.casa ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"concubino",R.string.concu ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"celular",R.string.celu ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"claro(compañia telefono)",R.string.clar ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"computadora",R.string.computadora ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"correo electronico",R.string.coel ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"carpeta",R.string.carpe ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"comenzar",R.string.comenza ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"completo",R.string.complet ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"contar",R.string.cont ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"corregir",R.string.correg ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cual", R.string.cua),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"colores",R.string.colo ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"como", R.string.com),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"chau",R.string.ch ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"como Estas,",R.string.com ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cuando",R.string.cuand),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cuantos",R.string.cuantos ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cuil",R.string.cuil ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"celeste",R.string.cele ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"claro",R.string.clar ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cerca",R.string.cerc),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"canoso", R.string.can),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"calvo", R.string.calv),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"caracter",R.string.carac ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"castaño",R.string.cast ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"celoso",R.string.celo ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cariñoso",R.string.cariñ ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"chusma",R.string.chus ),

            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"cuñado",R.string.cuñex ),

            //D
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"dormitorio",R.string.dormit ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"deporte",R.string.depo ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"de Nada,",R.string.deene ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"diceimbre",R.string.dic ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"domingo",R.string.domi ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"domingo",R.string.domi ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"dorado",R.string.dorad ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"dDesatento",R.string.desatt ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"desaprobar",R.string.desaprob ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"diccionario",R.string.dicci ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"diplomado/a",R.string.dipplomad ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"director/a",R.string.direct ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"distraido",R.string.distrai ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"diciembre",R.string.dic ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"direccion,",R.string.dire ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"divertido",R.string.diver ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"divorciado",R.string.diver ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"demasiado",R.string.dema ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"dni",R.string.dn ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"donde",R.string.don ),


            //E

            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"edificio",R.string.edif ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"entender,",R.string.entender ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"enero,",R.string.en ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"edad",R.string.ed ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"educado",R.string.educ ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"enero",R.string.en ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"envidioso",R.string.envid ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"el/Ella", R.string.ele),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"ellos/Ellas",R.string.ellosEllas ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"escuela",R.string.escul ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"educacion",R.string.educac ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"enseñar",R.string.enseñ ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"escribir",R.string.escrib ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"escuela primaria,",R.string.escuepri ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"estudiante Alumno/a",R.string.estudi ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"estudiar",R.string.estudi ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"examen/Rendir",R.string.exa ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"explicar",R.string.explic ),
            //F
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"facebook",R.string.fac ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"fondo",R.string.fond ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"febrero",R.string.fe ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"fin De Semana,",R.string.fds ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"familias",R.string.famili ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"feo",R.string.fe ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"febrero",R.string.fe ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"fecha de nacimiento",R.string.fech ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"fin De Semana",R.string.fds ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"flaco",R.string.fla ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"facultad",R.string.facu ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"fallar" ,R.string.fall ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"fotocopia",R.string.fotoc ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"feliz Cumpleaños",R.string.fc ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"fiesta",R.string.fies ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"fotografia",R.string.foto ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"frio",R.string.fri ),
            //G
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"gorro",R.string.gorr ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"guardapolvo",R.string.guardapol ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"garaje/Cochera",R.string.garajecoch ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"gracias,",R.string.grax ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"gemelo/a",R.string.geme ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"generaciones",R.string.ge ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"gris,",R.string.gri ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"granizo",R.string.gra ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"gordo",R.string.gor ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"goma",R.string.gom ),

            //H
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"helicoptero",R.string.heli ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"hotel",R.string.hot ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"hola",R.string.holis ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"hora",R.string.ho ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"hermano/a",R.string.herm ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"hijo/a",R.string.hij ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"hermoso",R.string.herm ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"hipoacusico",R.string.hipo ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"hora",R.string.ho ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"hombre",R.string.ho),

            //I
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"internet",R.string.interner ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"instagram",R.string.ins ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"informar",R.string.info ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"instituto",R.string.instit ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"interesado/a",R.string.inter ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"invierno",R.string.invierno ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"ignorante",R.string.igno),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"inteligente",R.string.intel ),

            //J
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"jeans",R.string.jens ),

            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"jardin",R.string.jard ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"joven",R.string.jov ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"jardin de infantes",R.string.jardinf ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"jugar",R.string.jug ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"jueves",R.string.jueves ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"junio",R.string.juni ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"julio",R.string.juli ),
            //L
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"lunes",R.string.lunes ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"lacio",R.string.laci ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"lapicera",R.string.lapicer ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"lapiz",R.string.lapi ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"leer",R.string.lee ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"libro",R.string.libr ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"lindo",R.string.lin ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"living",R.string.liv ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"lejos",R.string.lej ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"llovizna",R.string.llo ),
            //M
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"mar",R.string.maar ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"micro/omnibus",R.string.micro ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"montaña",R.string.mon ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"moto",R.string.mot ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"movistar",R.string.mov ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"musica",R.string.mus ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"mal",R.string.ma ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"mas o Menos",R.string.mom ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"mama",R.string.mam ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"madrastra",R.string.madras ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"mellizos/a",R.string.mell ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"mojado",R.string.mo ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"marron",R.string.marr ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"marzo",R.string.marzo ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"malo",R.string.mal),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"martes",R.string.martes ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"mayo",R.string.may ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"media hora",R.string.mh ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"menos",R.string.meno ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"meses",R.string.me ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"minutos",R.string.minut ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"miercoles",R.string.miercoles ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"maestro/a",R.string.maest ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"memorizar,",R.string.memo ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"mujer", R.string.mu),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"mucho",R.string.much ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"mio",R.string.mi),




            //N
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"navidad",R.string.navidad ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"nublado",R.string.nue ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"nerviosoa",R.string.nervios ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"no recortar",R.string.norecord ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"no saber,",R.string.nosab ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"nos Vemos",R.string.nv ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"no Entender,",R.string.noent ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"numeroCelular",R.string.numcel ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"nombre",R.string.nom ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"noviembre",R.string.nov ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"negro",R.string.negr ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"natural",R.string.nat),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"nieto/a",R.string.niet ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"nuera",R.string.nue ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"nieve",R.string.nieve ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"niño",R.string.niñ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"nada",R.string.na),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"nosotros",R.string.noso),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"nuestro",R.string.nues ),

            //O

            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"ojotas",R.string.ojot ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"otra Vez",R.string.ov ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"otoño",R.string.otoño ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"olvidar",R.string.olvid ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"octubre",R.string.oct ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"octubre",R.string.oct ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"opaco,",R.string.opa ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"oscuro",R.string.oscu ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"oyente",R.string.oy ),

            //P
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pantalon",R.string.pantal),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pantunflas",R.string.pantunf ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pañuelo",R.string.pañ ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pijama",R.string.pija ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pollera",R.string.polle ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pulsera",R.string.pulsr ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"por Favor",R.string.porfa ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"perdon",R.string.per ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"permiso",R.string.perm ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"personal(compañia de telefono)",R.string.personal ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"primavera",R.string.primavera ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"papel/hoja",R.string.pape ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"parque",R.string.pq ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pelicula",R.string.peli ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pensar",R.string.pens ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pizarron",R.string.pazarr ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"privado",R.string.privad ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"practicar",R.string.practica ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"presente",R.string.presen ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"padrastro",R.string.padras ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"papa",R.string.pa ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"primo/a,",R.string.pri ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"profesor/a",R.string.profe ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"publico",R.string.publi ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"puntual",R.string.punt ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pelirrojo",R.string.peli ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"peloCorto",R.string.pelco ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pelo Largo",R.string.pellar),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"plateado",R.string.platea ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"poco",R.string.pco),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"pregunta",R.string.pregun),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"presentarme",R.string.presen ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"paraque", R.string.pq),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"porque",R.string.poq),


            //Q
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"que",R.string.qu),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"quien",R.string.qi ),


            //R
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"reloj",R.string.relo ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"remera",R.string.reme ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"ropa",R.string.rop ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"ropa interior de mujer",R.string.ropaintmuj ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"recortar",R.string.recort ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"recreo",R.string.recre ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"responder",R.string.respon ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"responsable,",R.string.respons ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"regalo",R.string.regal ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"rio",R.string.ri ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"rojo",R.string.roj ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"rosa",R.string.ros ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"rizado",R.string.riza ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"rubio",R.string.rubi ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"relampago",R.string.rela ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"rayos",R.string.ra ),

            //S
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"saco",R.string.sac ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"sol",R.string.so ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"sabado",R.string.sab ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"saber",R.string.sab ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"secundaria",R.string.secund ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"separado",R.string.separ ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"seco",R.string.sec ),

            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"semana santa",R.string.ssan ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"subte",R.string.sub ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"soltero",R.string.solte ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"signar",R.string.sign ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"segundos",R.string.segun ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"semana",R.string.se ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"señas personales",R.string.señper ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"serio,",R.string.ser ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"setiembe",R.string.set ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"simpatico",R.string.sim ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"sobrino/a",R.string.sobri ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"sordo",R.string.sor ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"suyo",R.string.suy ),


            //T

            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tapado",R.string.tapa ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"telefono",R.string.te ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"television",R.string.telev ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"twitter",R.string.tw ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"terraza",R.string.terraza ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"todo Bien",R.string.tb ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tema",R.string.tem ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"terminar",R.string.termin ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"terciaria",R.string.tercia ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tardar",R.string.tarda ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tez Blanca",R.string.tb ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tez Blanca",R.string.tezbla ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"timido",R.string.timi ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tia",R.string.tiia ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tio",R.string.tiis ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tezMorocha",R.string.tezmo ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"todos",R.string.todes ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"taxi",R.string.tax),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"teatro",R.string.tea ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tren",R.string.chucu ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"turismo,",R.string.turi ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tu",R.string.tuu),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"tuyo",R.string.tuy ),


            //U
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"ustedes",R.string.usted),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"universidad",R.string.univerdid ),


            //V

            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"video llamda",R.string.vll ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"vacaciones",R.string.vaca ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"verano",R.string.verano ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"vestido",R.string.vestid ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"viudo",R.string.viu ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"vago/a",R.string.vag ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"vicedirector/a",R.string.vicedirect ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"verde",R.string.verd ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"viernes",R.string.viernes ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"violeta,",R.string.viole ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"vivienda",R.string.vivien ),

            // W
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"whatsapp",R.string.wa ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"wifi",R.string.wv ),

            //Y
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"yo",R.string.io ),

           // Z
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"zapatillas",R.string.zapatill ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"zapatos",R.string.zapat ),



      //      MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"",R.string. ),

            /**

            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"",R.string. ),
            MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"",R.string. ),*/


        )


        /**


        MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"whatsapp",R.string. ),
        MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"wifi",R.string. ),
        MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"personal(compañia de telefono)",R.string. ),
        MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"telefono",R.string. ),
        MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"television",R.string. ),
        MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"twitter",R.string. ),
        MundoModel(R.drawable.detail_mujer, R.drawable.detail_mujer,"video llamda",R.string. ),
      ,
























  */
    }
}
/**class MundoProvider  @Inject constructor() {
    fun getMundo(): List<MundoInfo> {
        return listOf(
            MundoInfo.Apellido,
            MundoInfo.B,
            MundoInfo.Casado,
            MundoInfo.Edad
        )
    }
}*/