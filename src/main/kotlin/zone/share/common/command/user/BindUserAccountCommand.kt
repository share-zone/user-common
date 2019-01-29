package zone.share.common.command.user

/**
 * BindUserAccountCommand
 * @author Iamee
 * @create 2019-01-29 18:29
 */
class BindUserAccountCommand : AbstractUserCommand {

    lateinit var type: String
        private set

    lateinit var account: String
        private set

    lateinit var secret: String
        private set

    constructor()

    constructor(user: String, account: String, secret: String) : super(user = user) {
        this.type = type
        this.account = account
        this.secret = secret
    }

}