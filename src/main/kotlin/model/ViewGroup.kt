package model

class ViewGroup() : View() {
    var view = View()
    fun addView(view: View) {
       this.view = view
    }
}