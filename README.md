# REST-сервис для управления опросами
  Создан в рамкам дисциплины "Творческий проект" в Томском Политехническом Университете
## Краткая инструкция по запуску
### Требования
  1. Java 17
  2. Maven
  3. PostgreSQL database

### 1. Склонировать репозиторий в нужную папку:   
```
git clone git@github.com:soulasphyxia/super-survey.git
```
2.  Перейти в директорию `/src/main/resources/` и указать в `application.properties` поля для инициализации базы данных `spring.database.url`,`spring.datasource.username` и `spring.datauser.password`
3.  Собрать проект с помощью Maven
```
mvn clear install
```
4. Запустить проект через созданный архив в директории `/target`
```
java -jar super-survey-0.0.1-SNAPSHOT.jar 
```
