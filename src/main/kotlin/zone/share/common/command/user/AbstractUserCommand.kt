package zone.share.common.command.user

import zone.share.common.command.AbstractCommand

/**
 * AbstractUserCommand
 * @author Iamee
 * @create 2019-01-29 18:07
 */
abstract class AbstractUserCommand : AbstractCommand {

    lateinit var user: String
        private set

    constructor()

    constructor(user: String) {
        this.user = user
    }

    override fun getIdentifier(): String {
        return "User { user = $user }"
    }

}