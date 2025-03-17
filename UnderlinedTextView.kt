import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class UnderlinedTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    private val underlinePaint = Paint().apply {
        strokeWidth = 4f  // 底線粗細
        isAntiAlias = true
    }
    private var isUnderlineEnabled = true // 預設啟用底線

    fun setUnderlineEnabled(enabled: Boolean) {
        isUnderlineEnabled = enabled
        invalidate() // 重新繪製
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (isUnderlineEnabled) {
            underlinePaint.color = currentTextColor
            val textBounds = text.toString()
            val textWidth = paint.measureText(textBounds)
            val startX = paddingLeft.toFloat()
            val stopX = startX + textWidth
            val underlineY = height - paddingBottom.toFloat()

            canvas.drawLine(startX, underlineY, stopX, underlineY, underlinePaint)
        }


    }
}