import kotlin.random.Random

class RandomAgent(override val name: String, val probability:Double) : Actor {
    override fun act(): Action {
        val randomNum = Random.nextDouble(0.0,probability)
        if (randomNum > 0.5){
            val action = ForageAction()
            return action
        }else{
            val action = NoAction()
            return action
        }
    }

    override fun perceive(vararg facts: Percept) {}
    override fun toString() = "$name is moving with score"

}