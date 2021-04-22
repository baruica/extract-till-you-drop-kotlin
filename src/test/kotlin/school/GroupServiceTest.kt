package school

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class GroupServiceTest {

    private lateinit var group: Group
    private lateinit var groupRepository: GroupRepository
    private lateinit var pupilRepository: PupilRepository
    private lateinit var groupService: GroupService

    @BeforeEach
    fun beforeEach() {
        this.group = Group(123)
        this.groupRepository = InMemoryGroupRepository()
        this.pupilRepository = InMemoryPupilRepository()
        this.groupService = GroupService(this.groupRepository, this.pupilRepository)
    }

    @Test
    fun add() {
        TODO("first test")
    }
}
