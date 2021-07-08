package com.dbtest.demotest.service;

import com.dbtest.demotest.model.RPG;

import java.util.List;

public interface  RPGService {
    /**
     * Создает нового клиента
     * @param rpg - объект типа ролевой игры для создания записи
     */
    void create(RPG rpg);

    /**
     * Возвращает список всей RPG записей из бд
     * @return список всей RPG записей из бд
     */
    List<RPG> readAll();

    /**
     * Возвращает RPG запись по ее id
     * @param id - ID RPG
     * @return объект записи с указанным Id
     */
    RPG read(int id);

    /**
     * Обновлени клиента в базе данных
     * @param rpg объект типа RPG заменяющий текущий в базе данных
     * @param id - ID RPG который надо заменить
     * @return успех выполнения операции
     */
    boolean update(RPG rpg, int id);

    /**
     * Удаляет объект по заданному ID из базы данных
     * @param id - ID RPG который надо удалить
     * @return успех выполнения операции
     */
    boolean delete(int id);


}
