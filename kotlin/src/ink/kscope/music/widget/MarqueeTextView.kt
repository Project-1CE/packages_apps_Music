package ink.kscope.music.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

class MarqueeTextView : TextView {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun isFocused() = true
}
