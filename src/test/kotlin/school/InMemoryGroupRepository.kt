package school

class InMemoryGroupRepository : GroupRepository {
    private val groups = mutableMapOf<Int, Group>()

    override fun find(id: Int): Group {
        return groups[id]
            ?: throw Exception()
    }

    override fun persist(group: Group) {
        groups[group.id] = group
    }
}
