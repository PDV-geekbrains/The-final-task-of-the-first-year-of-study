# (Потатуев Дмитрий, группа 6866)
# Объектно-ориентированное программирование

## 6. Диаграмма классов

### 6.1. Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".

#### В составы классов, в случае "Pets", войдут: Собаки, Кошки, Хомяки, а в класс "Pack animals" - Лошади, Верблюды и Ослы. Каждый тип животных будет характеризоваться, например, именем, датой рождения, выполняемыми командами и т.д. (Диаграмму можно нарисовать в любом редакторе, таких как Lucidchart, Draw.io, Microsoft Visio и других.)

![Class diagram](ClassDiagram/class-diagram.png)

## 7. Работа с MySQL

### 7.1. Структурировать базу данных "Human Friends" в соответствии с диаграммой, созданной в п. 6.

#### Например, можно создать таблицы, которые будут соответствовать классам "Pets" и "Pack animals", и в этих таблицах будут поля, которые характеризуют каждый тип животных (например, имена, даты рождения, выполняемые команды и т.д.).

Подключаемся к `MySQL`

![Connecting to MySQL Client](Images/2024-12-26%20193532.png)

### 7.2. В ранее подключенном MySQL, создать базу данных с названием "Human Friends".

![Creating new database "human_friends"](Images/2024-12-26%20194012.png)

#### 7.2.1. Создать таблицы, соответствующие иерархии диаграммы классов

Выбираем созданную базу данных `human_friends`.

![Select database "human_friends"](Images/2024-12-26%20200648.png)

Поскольку класс `Animal` является абстрактным, создаём таблицы только для классов `Pet` и `PackAnimal`.

Создаём таблицу `pets` для класса `Pet`.

![Create table 'pet'](Images/2024-12-31%20135724.png)

Создаём таблицу `pack_animals` для класса `PackAnimal`.

![Create table 'pack_animals'](Images/2024-12-31%20231131.png)

Для обеих таблиц сделаем поля `type` и `name` обязательными.

Для таблицы `pets`:

![Make fields `type` and `name` of table `pets` NOT NULL](Images/2024-12-31%20232451.png)

Для таблицы `pack_animals`:

![Make fields `type` and `name` of table `pack_animals` NOT NULL](Images/2024-12-31%20233027.png)

#### 7.2.2. Заполнить таблицы данными о животных, их командах и датами рождения

Заполняем таблицу `pets`: 

![Populate table `pets`](Images/2025-01-01%20153017.png)

Проверим содержимое таблицы `pets`:

![Show up content of table `pets`](Images/2025-01-01%20153409.png)

Заполняем таблицу `pack_animals`:

![Populate table `pack_animals`](Images/2025-01-01%20155103.png)

Проверим содержимое таблицы `pack_animals`:

![Show up content of table `pack_animals`](Images/2025-01-01%20155441.png)

#### 7.2.3. Удалить записи о верблюдах и объединить таблицы `pets` и `pack_animals`

Удаляем записи о верблюдах из таблицы `pack_animals`:

![Delete records where type = 'верблюд' from 'pack_animals'](Images/2025-01-01%20194729.png)

Поскольку, при создании таблиц 'pets' и 'pack_animals' они были созданы по умолчанию в формате 'InnoDB', для получения возможности их объединения переведём их в формат 'MyISAM'.

![Convert tables 'pets' and 'pack_animals' to 'MyISAM'](Images/2025-01-03%20133511.png)

Проверим формат таблиц:

![Check 'pets' and 'pack_animals' format](Images/2025-01-03_13-43-44.png)

Объединяем таблицы `pets` и `pack_animals`:

![Union tables `pets' and 'pack_animals'](Images/2025-01-05%20133448.png)

Выведем объединённую таблицу:

![Result table 'animals'](Images/2025-01-05%20132409.png)

#### 7.2.4. Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца

Создадим новую таблицу `animal_age`:

![Create a table `animal_age`](Images/2025-01-06%20135316.png)

Заполним таблицу `animal_age`:

![Populate the table `animal_age`](Images/2025-01-06%20144543.png)

Вычислим возраст животных с точностью до месяца:

![Calculate each animal age](Images/2025-01-07%20002823.png)

#### 7.2.5. Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам

Сведём все таблицы (`pets`, `pack_animals`, `animal_age`) в одну таблицу `animals_total`:

![Create table `animals_total`](Images/2025-01-07%20131602.png)

Проверим результат объединения таблиц:

![Show table `animals_total`](Images/2025-01-07%20131658.png)
