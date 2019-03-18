class TextBoxesField @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : TextFieldBoxes(context, attrs, defStyleAttr), FormField {

    //region FormField
    override val multicast = MulticastDelegate<FormFieldDelegate>()
    override val fieldId: Int = super.getId()

    override var value: Any? = null
        set(value) {
            field = value
            editText.setText(value.toString())
        }
        get() = editText.text.toString()

    override var error: String? = null
        get() = error.toString()
        set(value) {
            field = value
            if (value == null) removeError() else setError(value, false)
        }

    override var validator: FormFieldValidator? = null

    //endregion

    private var isPlainText = false
    set(value) {
        field = value
        if(field) showPassword() else hidePassword()
    }

    private fun showPassword() {
        setEndIcon(R.drawable.ic_hide_password)
        editText.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
        editText.setSelection(editText.text.length)
    }

    private fun hidePassword() {
        setEndIcon(R.drawable.ic_show_password)
        editText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        editText.setSelection(editText.text.length)
    }

   fun changePasswordVisibility() {
        isPlainText = !isPlainText
    }
}
