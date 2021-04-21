package school

class GroupService(
    private val repository: GroupRepository,
    private val pupilRepository: PupilRepository
) {
    fun add(id: Int, pupilId: Int) {
        val group: Group = this.repository.find(id)
        val pupils: Collection<Pupil> = group.getPupils()
        val addPupil: Pupil = this.pupilRepository.find(pupilId)
        if (pupils.size < 3) {
            var tmp = false
            for (pupil in pupils) {
                if (pupil.id == addPupil.id) {
                    tmp = true
                }
            }
            if (!tmp) {
                group.addPupil(addPupil)
                this.repository.persist(group)
            } else {
                throw PupilAlreadyInGroupException()
            }
        } else {
            throw TooManyPupilsException()
        }
    }
}
