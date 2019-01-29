package zone.share.common.command.user

/**
 * ValidateUserAccountCommand
 * @author Iamee
 * @create 2019-01-29 18:33
 */
class ValidateUserAccountCommand : AbstractUserCommand {

    lateinit var account: String
        private set

    lateinit var captcha: String
        private set

    constructor()

    constructor(user: String, account: String, captcha: String) : super(user = user) {
        this.account = account
        this.captcha = captcha
    }

}