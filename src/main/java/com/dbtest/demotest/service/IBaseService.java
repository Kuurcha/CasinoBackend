
package com.dbtest.demotest.service;

import java.util.List;

public interface IBaseService<T> {

    /**
     * Создает нового клиента
     * @param modelBase- объект типа ModelBase для создания записи
     */
    void create(T modelBase);

    /**
     * Возвращает список всей ModelBase записей из бд
     * @return список всей ModelBase записей из бд
     */
    List<T> readAll();

    /**
     * Возвращает RPG запись по ее id
     * @param id - ID ModelBase
     * @return объект записи с указанным Id
     */
    T read(int id);

    /**
     * Обновлени клиента в базе данных
     * @param modelBase объект типа ModelBase заменяющий текущий в базе данных
     * @param id - ID RPG который надо заменить
     * @return успех выполнения операции
     */
    boolean update(T modelBase, int id);

    /**
     * Удаляет объект по заданному ID из базы данных
     * @param id - ID объекта который надо удалить
     * @return успех выполнения операции
     */
    boolean delete(int id);
}
