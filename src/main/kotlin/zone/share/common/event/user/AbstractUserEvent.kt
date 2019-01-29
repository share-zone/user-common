package zone.share.common.event.user

import zone.share.common.event.AbstractEvent

/**
 * AbstractUserEvent
 * @author Iamee
 * @create 2019-01-29 18:12
 */
abstract class AbstractUserEvent : AbstractEvent {

    lateinit var username: String
        private set

    constructor()

    constructor(seq: String, username: String, time: Long) : super(seq = seq, time = time) {
        this.username = username
    }

}