package school

class Group(val id: Int) {

    private val pupils = mutableListOf<Pupil>()

    fun getPupils(): MutableCollection<Pupil> {
        return pupils
    }

    fun addPupil(pupil: Pupil) {
        pupils.add(pupil)
    }
}
