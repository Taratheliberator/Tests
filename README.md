
# Базы данных

# Задание №1
    Ответы:
    
    1.(Категория поезда = «скорый») ИЛИ (Вокзал = «Павелецкий»)

    Ответ:
    Логическое «ИЛИ» истинно тогда, когда истиннo хотя бы одно высказывание. 
    Следовательно, подходят и варианты, в которых поезд «скорый», и те, в которых вокзал «Павелецкий».
    Таких вариантов 9.

    2.(Категория поезда = «скорый») И (Время в пути 40:00)

    Ответ:
    Логическое «И» истинно тогда, когда истинны оба высказывания. 
    Следовательно, условию удовлетворяют те строки таблицы, в которых скорый поезд находится в пути 40 часов. 
    Ни одна запись не удовлетворяют такому условию.
    
    3.(Вокзал = «Павелецкий») ИЛИ (Время в пути 35:00)

    Ответ:
    Логическое «ИЛИ» истинно тогда, когда истинны хотя бы одно высказывание.
    Следовательно, условию удовлетворяют те строки таблицы, в которых поезд находится в пути 35 часов или 
    отправляется с Павелецкого вокзала. 
    Таких вариантов 4.
        

# Базы данных

# Задание №2
    (Ответом на задание является текст запроса и его результат)
    Во фрагменте базы данных представлены сведения о родственных отношениях. 

# Вопрос:
    1.На основании приведённых данных определите ID родного брата Седых В.А.

      SELECT ID FROM Таблица 1  WHERE ID = ( SELECT ID_Ребенка FROM Таблица 2 WHERE ID_Родителя = 2349 OR ID_Родителя = 1616) AND Пол = "М";
      Ответ: 2593
   

    2.Сколько братьев у Саенко М.А.
    SELECT COUNT(ID) FROM Таблица 1  WHERE ID = ( SELECT ID_Ребенка FROM Таблица 2 WHERE ID_Родителя = 2349 OR ID_Родителя = 1616) AND Пол = "М";
          Ответ: 1

    3.Вывести список детей из неполных семей.
        SELECT * FROM Таблица 1  WHERE ID = ( SELECT ID_Ребенка, COUNT(*) AS kinder FROM Таблица 2 GROUP BY ID_Родителя HAVING kinder < 2);
        || ID  || Фамилия_И._О.|| Пол ||
        || 2339|| Седых Л.А.   ||  М  ||
        || 1974|| Тузенбах П.А.||  Ж  ||

