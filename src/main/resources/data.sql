INSERT INTO cities (id, city_name)
VALUES (1, 'Rzym'),
       (2, 'Paryż'),
       (3, 'Londyn');

INSERT INTO guides (id, language, name, city_id)
VALUES (1, 'polski', 'Jan Kowalski', 1),
       (2, 'angielski', 'Bogdan Nowak', 1),
       (3, 'polski', 'Roman Dobrowolski', 2),
       (4, 'angielski', 'Zbigniew Kostrzycki', 2),
       (5, 'polski', 'Artur Ptak', 3),
       (6, 'angielski', 'Marian Kot', 3);

INSERT INTO monuments (id, name, price, visiting_time, city_id)
VALUES (1, 'Koloseum', 80, 90, 1),
       (2, 'Fontanna di Trevi', 30, 40, 1),
       (3, 'Watykan', 100, 150, 1),
       (4, 'Forum Romanum', 60, 80, 1),
       (5, 'Wieża Eiffla', 80, 60, 2),
       (6, 'Luwr', 120, 150, 2),
       (7, 'Katedra Notre Dame', 60, 50, 2),
       (8, 'Łuk Triumfalny', 40, 30, 2),
       (9, 'Big Ben', 50, 40, 3),
       (10, 'London Eye', 60, 50, 3),
       (11, 'Buckingham Palace', 120, 140, 3),
       (12, 'Tower Bridge', 40, 30, 3);