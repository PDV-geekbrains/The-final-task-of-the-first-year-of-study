# (Потатуев Дмитрий, группа 6866)
# Операционные системы и виртуализация (Linux)
## 1. Использование команды cat в Linux

### 1.1. Создать два текстовых файла: "Pets" (домашние животные) и "Pack animals" (вьючные животные), используя команду `cat` в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором – лошадей, верблюдов и ослов.

![Create files "Pets" and "Pack animals".](Images/2024-12-11%20215919.png)

### 1.2. Объединить содержимое этих двух файлов в один и просмотреть его содержимое.

![Combine "Pets" and "Pack animals" and show result.](Images/2024-12-11%20220922.png)

### 1.3. Переименовать получившийся файл в "Human Friends".

![Rename new file to "Human Friends"](Images/2024-12-11%20221223.png)

## 2. Работа с директориями в Linux

### 2.1 Создать новую директорию и переместить туда файл "Human Friends".

![Make new dir and move "Human Friends" there.](Images/2024-12-12%20200537.png)

## 3. Работа с MySQL в Linux.

### 3.1 “Установите MySQL на вашу вычислительную машину”.
![Setup MySql](Images/2024-12-12%20203636.png)

Проверяем версию `MySql`.

![Check MySql version](Images/2024-12-12%20203826.png)

### 3.2 Подключите дополнительный репозиторий MySQL и установите один из пакетов из этого репозитория.

Скачиваем пакет (`mysql-apt-config_0.8.33-1_all.deb`) для подключения репозитория с ресурса: https://dev.mysql.com/downloads/repo/apt/.

![Download Repository setup package](Images/2024-12-14%20115610.png)

Устанавливаем скаченный пакет.

![The package installation](Images/2024-12-14%20121511.png)

В результате, получаем ссылки на новый репозиторий.

![Links to the new repo](Images/2024-12-14%20121605.png)

Устанавливаем `mysql-apt-config`.

![Setup mysql-apt-config](Images/2024-12-14%20124521.png)

Устанавливаем пакет `mysql-shell` и проверяем его версию.

![Setup mysql-shell](Images/2024-12-14%20125022.png)

## 4. Управление deb-пакетами

### 4.1 Установить и затем удалить deb-пакет, используя команду `dpkg`.

Скачиваем `.deb` пакет для Google Chrome с интернет ресурса используя `wget`:

![Download .deb package using wget](Images/2024-12-14%20200202.png)

Устанавливаем скаченный пакет используя `dpkg`:

![Setup .deb package using dpkg](Images/2024-12-14%20200355.png)

Графический интерфейс установленной программы:

![Google chrome UI](Images/2024-12-14%20200653.png)

Удаляем `.deb` пакет используя `dpkg`:

![Delete .deb package using `dpkg`](Images/2024-12-14%20212035.png)

## 5. История команд в терминале Ubuntu

### 5.1 Сохранить и выложить историю ваших терминальных команд в Ubuntu

Команды, вводимые в терминале, сохраняются в файле `.bash_history`, расположенном в домашнем каталоге пользователя. Пример фрагмента содержимого файла `.bash_history`:

![.bash_history's contents portion](Images/2024-12-14%20220639.png)