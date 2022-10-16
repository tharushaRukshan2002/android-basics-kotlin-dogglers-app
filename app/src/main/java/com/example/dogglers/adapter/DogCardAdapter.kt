/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.model.Dog

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int,
    private val dataList: List<Dog>
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val nameTxt :TextView = view!!.findViewById(R.id.vh_name_txt)
        val ageTxt : TextView = view!!.findViewById(R.id.vh_age_txt)
        val hobbyTxt: TextView = view!!.findViewById(R.id.vh_hobby_txt)
        val image: ImageView = view!!.findViewById(R.id.vh_list_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        return if (Layout.GRID == layout){
            val gridLayout = LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            DogCardViewHolder(gridLayout)
        }else {
            val horizontalVerticalItem = LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent, false)
            DogCardViewHolder(horizontalVerticalItem)
        }

    }

    override fun getItemCount(): Int{
        return dataList.size
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        // TODO: Get the data at the current position
        val item = dataList[position]
        // TODO: Set the image resource for the current dog
        holder.image.setImageResource(item.imageResourceId)
        // TODO: Set the text for the current dog's name
        holder.nameTxt.text = item.name
        // TODO: Set the text for the current dog's age
        holder.ageTxt.text = "Age: ${item.age}"
        val resources = context?.resources
        // TODO: Set the text for the current dog's hobbies by passing the hobbies to the
        holder.hobbyTxt.text = "Hobby: ${item.hobbies}"
    }
}
