package school

interface PupilRepository {
    fun find(id: Int): Pupil
}
