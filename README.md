# Trip Fellows
## Описание приложения
### Проблема
Долгая дорога от общежития до универа на электричке выматывает. Некоторые люди ездят на каршеринге, но одному ехать дорого и скучно. 

### Идея
Водитель имеет приложение, в котором он оперативно подберет попутчиков на поездку.

### Решение
Android приложение. Водитель открывает приложение, указывает конечную точку поездки.
Всем пассажирам, находящимся в некотором радиусе от водителя, приходит push-уведомление с информацией о поездке.
Пассажир может согласиться на поездку и добраться домой быстрее и комфортнее.

## Используемые технологии
* Kotlin
* Android SDK

(будет дополнено)

## Функциональность приложения
### 1. Список поездок, удовлетворяющих заданным параметрам. (Радиус поиска, местоположение)
### 2. Просмотр поездки
* Начальный и конечный пункт поездки
* Кол-во мест
* Водитель и пассажиры
* Время начала и приблизительное время в пути
### 3. История поездок
* Поиск по дате
### 4. Настройки
* Выбор языка
* Радиус поиска
* Включение пуш-уведомлений
### 5. Авторизация
* Возможность зарегистрироваться через приложение
* Авторизация через google
* Авторизация через facebook

## Описание экранов
### 1. Экран "Список поездок"
На этом экране появляются поездки, созданные в определенном радиусе от местоположения пользователя.
Пользователь может перейти на экран просмотра нажатиенм на поездку.
Вверху экрана отображается текущее местоположения пользователя и радиус поиска поездок.
Пользователь  может обновить данные своего местоположения.

### 2. Экран "История поездок"
Здесь пользователь может просмотреть историю поездок, в которых он учавствовал. Так же ему доступен поиск по дате.
При нажатии на поездку, открывается экран "Просмотр поездки"

### 3. Экран "Профиль"
Отображаются данные о пользователе. Отображаются настройки "Радиус", "Пуш-уведомления"

### 4. Экран "Просмотр поездки"
Отображается информация о начальном и конечном пунктах, времени, кол-ве мест и участников поездки.
На кнопку "Присоединиться" можно стать участником поездки.
Если пользователь - создатель поездки - он может ей управлять. (Выгнать пассажира, начать поездку, завершить)

### 5. Экран "Создание поездки"
Отображаются поля для ввода начального и конечного адресов, кол-во доступных мест для пассажиров и время отправления.

### 6. Экран "Авторизация"
Поля для ввода логина и пароля, кнопка Login для авторизации через приложение, кнопка Sign up для регистрации, иконки для авторизации через Google или Facebook


## API
* Backend - [Trip Fellows Server](https://github.com/lo0ken/trip-fellows-server)

## Команда
* Дмитрий Гаврилов - [GitHub](https://github.com/lo0ken)
* Даниил Чернов - [GitHub](https://github.com/Lackier)
* Даннил Кучеренко - [GitHub](https://github.com/Danil-dn)
