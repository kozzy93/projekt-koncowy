# projekt-koncowy
Projekt końcowy na zakończenie studiów podyplomowych
<h4>Krzysztof Ozga</h4>
<h3>Aplikacja do planowania wycieczek w miastach Europy</h3>
Opis:
<br>Użytkowik otwierając aplikację widzi stronę główną na której dostępny jest krótki opis aplikacji. Klikając w odnośnik "Co warto zobaczyć", użytkowik przekierowywany jest do strony z trzema grafikami przedstawiającymi 3 Europejskie stolice. Najeżdżając na dany obrazek ukazuje się krótki tekst z opisem danego miasta oraz przycisk przekierowujący do strony z dokładniejszym opisem miasta, zdjęciami oraz odnośnikami w dane miejsce strony, zależne od wyboru zabytku. Klikając w odnośnik "Zaplanuj wycieczkę" użytkownik przekierowywany jest do strony z wyborem miasta w którym chciałby zarezerwować przewodnika. Po wyborze miasta ukazuje się strona z formularzem zamówienia. W url-u przekazywany jest nr id miasta na podstawie którego ściągane są z bazy danych dane dotyczące zabytków w wybranym mieście oraz lista przewodników. Baza danych uzupełniana jest danymi z pliku 'data.sql'. Aby dokonać rezerwacji użytkownik zobligowany jest do wypełnienia formularza. Do poszczególnych komórek dodana jest walidacja dotycząca wpisania znaków w danym zakresie. Użytkownik także nie jest w stanie zarezerwować tego samego przewodnika w zarezerwowanym już terminie. Jeśli wybrany przewodnik, data oraz godzina zwiedzania są te same, zwracana jest strona z prośbą o ponowne wypełnienie formularza. Jeśli formularz zostanie wypełniony w poprawny sposób użytkownik przenoszony jest na stronę z potwierdzeniem zamówienia. W url-u przekazywany jest nr id zamówienia na podstawie którego generowany jest link do google maps z poglądową trasą zwiedzania który różni się w zależności od wybranych przez użytkownika w zamówieniu zabytków. Zamówienia na wycieczki zapisywane są w bazie danych, z której dane przekazywane są do ukrytej podstrony z zamówieniami '/admin/orders'
 
<br>Dostępne widoki:
<br> • Strona główna z opisem serwisu
<br> • "Co warto zobaczyć" z wyborem miasta którego opis użytkownik chce zobaczyć
<br> • Opis miasta Rzymu
<br> • Opis miasta Paryża
<br> • Opis miasta Londynu
<br> • "Zaplanuj wycieczkę" z wyborem miasta co do którego użytkownik chciałby złożyć zamówienie
<br> • Formularz zamówienia w mieście Rzym
<br> • Formularz zamówienia w mieście Paryż
<br> • Formularz zamówienia w mieście Londyn
<br> • Errorpage z informacją o zarezerwowanym w danym terminie przewodniku
<br> • Potwierdzenie poprawnego dokonania rezerwacji
<br> • Strona admina z listą złożonych zamówień
<br>
<br>Aby połączyć się z bazą danych należy w katalogu resources zmienić nazwę pliku z 'db-template.properties' na 'db.properties' oraz uzupełnić go swoimi danymi. Aplikacja łączy się z bazą danych w MS Sql.
<br>
<br>Link do aplikacji w serwisie Heroku:
<br>https://guarded-sea-67974.herokuapp.com/
