class Attachments (
    val type: String,
    val attach: Attachment
)

interface Attachment{
    val id: Int
    val user_id: Int
    val views: Int //количество просмотров/скачиваний
}

class Video(
    //override val type: String ="Video",
    override val id: Int = 0,
    override val user_id: Int = 0,
    override val views: Int = 0 ,
    val size: Int = 0,
    val ext: String = "avi",
    val duration: Int = 0// длительность в секундах

) : Attachment {

}

class Docs(
    //override val type: String = "Doc",
    override val id: Int = 0,
    override val user_id: Int = 0,
    override val views: Int = 0 ,
    val size: Int = 0,
    val ext: String = "docx"


) : Attachment {

}

class Audio(
    //override val type: String = "Audio",
    override val id: Int = 0,
    override val user_id: Int = 0,
    override val views: Int = 0,
    val size: Int = 0,
    val ext: String = "mp3",
    val artist: String ="",
    val title: String = "",
    val duration: Int = 0// длительность в секундах

) : Attachment

class Photo(
    //override val type: String = "Photo",
    override val id: Int = 0,
    override val user_id: Int = 0,
    override val views: Int = 0,
    val album_id: Int = 0,
    val ext: String = "jpg",
    val width: Int = 0,
    val height: Int = 0

) : Attachment

class Sticker(
    override val id: Int = 0,
    override val user_id: Int = 0,
    override val views: Int = 0,
    val animation_url: String = "",
    val is_allowed: Boolean = true
): Attachment

class Thumb(
    override val id: Int =0,
    override val user_id: Int = 0,
    override val views: Int = 0,
    val thumb_256: String = ""
): Attachment