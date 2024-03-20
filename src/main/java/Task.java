import java.util.Objects;

public class Task {  //родительский класс, в нем все общее для классов с задачами
    protected int id;

    public Task(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    /**
     * Метод, проверяющий подходит ли эта задача поисковому запросу.
     * Эта логика должна быть определена в наследниках, у каждого она будет своя
     *
     * @param query Поисковый запрос
     * @return Ответ на вопрос, подходит ли эта задача под поисковый запрос
     */
    public boolean matches(String query) {
        return false;
    }

}