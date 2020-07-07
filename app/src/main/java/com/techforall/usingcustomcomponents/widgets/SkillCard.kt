package com.techforall.usingcustomcomponents.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.techforall.usingcustomcomponents.R
import com.techforall.usingcustomcomponents.model.Skill
import kotlinx.android.synthetic.main.skill_card_layout.view.*

class SkillCard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context)
            .inflate(R.layout.skill_card_layout, this, true)
        orientation = VERTICAL
    }

    fun loadSkill(skill: Skill) {
        skill_title_textview.text = skill.skillTitle
        skill_level_textview.text = skill.skillLevel
    }
}