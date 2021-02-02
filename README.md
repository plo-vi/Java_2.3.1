# Домашнее задание к занятию «2.3. Система сборки Maven, управление зависимостями, автотесты на JUnit5»

В качестве результата пришлите ссылки на ваши GitHub-проекты в личном кабинете студента на сайте [netology.ru](https://netology.ru).

Все задачи этого занятия нужно делать в разных репозиториях.

**Важно**: если у вас что-то не получилось, то оформляйте Issue [по установленным правилам](../report-requirements.md).

**Важно**: не делайте ДЗ всех занятий в одном репозитории! Иначе вам потом придётся достаточно сложно подключать системы Continuous Integration.

## Как сдавать задачи

1. Инициализируйте на своём компьютере пустой Git-репозиторий
1. Добавьте в него готовый файл [.gitignore](../.gitignore)
1. Добавьте в этот же каталог необходимые файлы
1. Сделайте необходимые коммиты
1. Создайте публичный репозиторий на GitHub и свяжите свой локальный репозиторий с удалённым
1. Сделайте пуш (удостоверьтесь, что ваш код появился на GitHub)
1. Ссылку на ваш проект отправьте в личном кабинете на сайте [netology.ru](https://netology.ru)
1. Задачи, отмеченные, как необязательные, можно не сдавать, это не повлияет на получение зачета

## Задача №1 - Дописываем тесты

### Легенда

На лекции мы написали всего два тестовых сценария, тогда как их должно быть больше (как минимум, мы не проверили незарегистрированного пользователя).

Что нужно сделать:
1. Создайте проект на базе Maven по инструкции из лекции
1. Добавьте в проект JUnit Jupiter & Surefire Plugin новой версии
1. Перенесите из лекции код существующего сервиса и автотестов
1. Допишите недостающие автотесты

Убедитесь, что ваши тесты действительно проходят и тестируют!

Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код (pom.xml и код автотестов также должны быть в репозитории).
