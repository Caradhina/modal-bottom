package com.example.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.myapplication.dummy.DummyContent

/**
 * A fragment representing a list of Items.
 * Activities containing this fragment MUST implement the
 * [HeroFragment.OnListFragmentInteractionListener] interface.
 */
class HeroFragment : Fragment() {

    // TODO: Customize parameters
//    private var columnCount = 1

//    private var listener: OnListFragmentInteractionListener? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        arguments?.let {
//            columnCount = it.getInt(ARG_COLUMN_COUNT)
//        }
//    }
    data class Hero(val name: String, val gender: String, val power: Int, val imgUrl: Int)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hero_list, container, false)


        val heroes:List<Hero> = listOf(
            Hero("Superman", "M", 100, R.drawable.superman),
            Hero("Spiderman", "M", 90, R.drawable.spiderman),
            Hero("Wonder Woman", "F", 89, R.drawable.wonderwoman),
            Hero("Thor", "M", 92, R.drawable.thor),
            Hero("Batman", "M", 70, R.drawable.batman),
            Hero("Iron Man", "M", 95, R.drawable.ironman),
            Hero("Black Panther", "M", 80, R.drawable.blackpanther)
        )
        if(view is RecyclerView){
            with(view){
                layoutManager = LinearLayoutManager(context)
                adapter = MyHeroRecyclerViewAdapter(heroes, this)
            }
        }
        return view
    }

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        if (context is OnListFragmentInteractionListener) {
//            listener = context
//        } else {
//            throw RuntimeException(context.toString() + " must implement OnListFragmentInteractionListener")
//        }
//    }
//
//    override fun onDetach() {
//        super.onDetach()
//        listener = null
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson
     * [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
//    interface OnListFragmentInteractionListener {
//        // TODO: Update argument type and name
//        fun onListFragmentInteraction(item: Hero?)
//    }

//    companion object {
//
//        // TODO: Customize parameter argument names
//        const val ARG_COLUMN_COUNT = "column-count"
//
//        // TODO: Customize parameter initialization
//        @JvmStatic
//        fun newInstance(columnCount: Int) =
//            HeroFragment().apply {
//                arguments = Bundle().apply {
//                    putInt(ARG_COLUMN_COUNT, columnCount)
//                }
//            }
//    }
}
