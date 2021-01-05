package com.kubra.meyveler
import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.rcycler_row.view.*

class RcyclerAdapter(val meyveIsimleri : ArrayList <String>, val meyveGorselleri : ArrayList<Bitmap>) : RecyclerView.Adapter<RcyclerAdapter.MeyvelerVH>() {
    class MeyvelerVH(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeyvelerVH {
      val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rcycler_row, parent, false)
        return MeyvelerVH (itemView)
    }

    override fun onBindViewHolder(holder: MeyvelerVH, position: Int) {
      holder.itemView.textRcycler.text = meyveIsimleri.get(position)
        holder.itemView.setOnClickListener{
         val intent = Intent(holder.itemView.context, TanitimActivity ::class.java)
            intent.putExtra("secilenMeyve", meyveIsimleri.get(position))
            holder.itemView.context.startActivity(intent)
            val singelton = Singelton.secilenGorsel
            singelton.gorsel = meyveGorselleri.get(position)
        }
    }

    override fun getItemCount(): Int {
       return meyveIsimleri.size

    }
}