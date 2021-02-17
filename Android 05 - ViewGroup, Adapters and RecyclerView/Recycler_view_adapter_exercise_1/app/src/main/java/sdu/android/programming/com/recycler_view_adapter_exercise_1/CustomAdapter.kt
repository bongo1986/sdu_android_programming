package sdu.android.programming.com.recycler_view_adapter_exercise_1

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

/**
 * Created by Jakob on 27/02/2018.
 */
class CustomAdapter(var numbers: ArrayList<Int>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    /**
     * Creates the viewholder
     * @param parent
     * @param viewType
     * @return
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.random_textview, parent, false)
        val tv = v.findViewById<TextView>(R.id.test_tv)
        return ViewHolder(v, tv)
    }

    /**
     * Binds current viewholder, and creates on click listener for each item
     * @param holder
     * @param position
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val message = String.format("Setting textview for position: %s", position)
        Log.i("CustomAdapter", message)
        holder.textView.text = numbers[position].toString()
    }

    override fun getItemCount(): Int {
        Log.i("CustomAdapter", String.format("Getting item count: %s", numbers.size))
        return numbers.size
    }

    class ViewHolder(frameLayout: View?, // each data item is just a string in this case
                     var textView: TextView) : RecyclerView.ViewHolder(frameLayout!!) {
        var frameLayout: View? = null
    }

}