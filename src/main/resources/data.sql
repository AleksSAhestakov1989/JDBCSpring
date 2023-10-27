insert into netology.customers(name, surname, age, phone_number)
values ('Ivan', 'Ivanov', 19, '111-111'),
       ('Igor', 'Vasilev', 40, '222-222'),
       ('Nikita', 'Petrov', 33, '333-222');

insert into netology.orders( data,customer_id, produсt_name, amount)
values (10,1,'Vino',10),
       (11,1,'Bear', 20),
       (12,2,'Water',5),
       (13,3,'Rom',50),
       (14,3,'Hotdog',10);