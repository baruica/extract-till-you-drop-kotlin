package school

interface GroupRepository {
    fun find(id: Int): Group
    fun persist(group: Group)
}
