package school

class InMemoryPupilRepository : PupilRepository {
    private val pupils = mutableMapOf<Int, Pupil>()

    override fun find(id: Int): Pupil {
        return pupils[id]
            ?: throw Exception()
    }

    override fun persist(pupil: Pupil) {
        pupils[pupil.id] = pupil
    }
}
