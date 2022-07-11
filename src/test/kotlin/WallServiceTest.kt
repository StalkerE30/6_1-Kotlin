import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_passed() {
        val service = WallService()
        val post1 = service.add(Post(from_id = 1, date = 1656494786, text = "Всем привет1!",  reposts = null))
        val post2 = service.add(Post(from_id = 1, date = 1656494787, text = "Всем привет2!",  reposts = null))
        val result = post2.id
        assertEquals(2, result)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(from_id = 1, date = 1656494786, text = "Всем привет1!", reposts = null))
        service.add(Post(from_id = 2, date = 1656494787, text = "Всем привет2!", reposts = null))
        service.add(Post(from_id = 3, date = 1656494788, text = "Всем привет3!", reposts = null))
        // создаём информацию об обновлении
        val postUpdate = Post(id=1, from_id = 1, date = 1656494786, text = "Всем привет5!", reposts = null)

        // выполняем целевое действие
        val result = service.update(postUpdate)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }
    @Test
    fun tryUpdateNoExisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(from_id = 1, date = 1656494786, text = "Всем привет1!", reposts = null))
        service.add(Post(from_id = 2, date = 1656494787, text = "Всем привет2!", reposts = null))
        service.add(Post(from_id = 3, date = 1656494788, text = "Всем привет3!", reposts = null))
        // создаём информацию об обновлении
        val postUpdate = Post(id=5, from_id = 1, date = 1656494786, text = "Всем привет1!", reposts = null)

        // выполняем целевое действие
        val result = service.update(postUpdate)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

    @Test
    fun AddAttachVideo(){
        val service = WallService()
        //val attach = Video()
        val post1 = service.add(Post(from_id = 3, date = 1656494788, text = "Всем привет3!", reposts = null))
        val result = service.addAttach(post1,"Видеозапись")
        assertTrue(result)
    }
    @Test
    fun AddAttachDocum(){
        val service = WallService()
        //val attach = Docs()
        val post1 = service.add(Post(from_id = 3, date = 1656494788, text = "Всем привет3!", reposts = null))
        val result = service.addAttach(post1,"Файл")
        assertTrue(result)
    }

    @Test
    fun AddAttachAudio(){
        val service = WallService()
        //val attach = Audio()
        val post1 = service.add(Post(from_id = 3, date = 1656494788, text = "Всем привет3!", reposts = null))
        val result = service.addAttach(post1,"Аудиозапись")
        assertTrue(result)
    }

    @Test
    fun AddAttachPpoto(){
        val service = WallService()
        //val attach = Photo()
        val post1 = service.add(Post(from_id = 3, date = 1656494788, text = "Всем привет3!", reposts = null))
        val result = service.addAttach(post1,"Фотография")
        assertTrue(result)
    }

    @Test
    fun AddAttachSticker(){
        val service = WallService()
        //val attach = Sticker()
        val post1 = service.add(Post(from_id = 3, date = 1656494788, text = "Всем привет3!", reposts = null))
        val result = service.addAttach(post1,"Стикер")
        assertTrue(result)
    }

    @Test
    fun AddAttachNoAvailable(){
        val service = WallService()
        //val attach = Thumb()
        val post1 = service.add(Post(from_id = 3, date = 1656494788, text = "Всем привет3!", reposts = null))
        val result = service.addAttach(post1,"Подарок")
        assertFalse(result)
    }

}