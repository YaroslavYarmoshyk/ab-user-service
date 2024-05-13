INSERT INTO users (email, password, first_name, last_name)
VALUES ('bob@test.com', '$2a$12$UdMD/WnTmdyBQX4FY4BS6O8GNLRR5CGzwtC6exVuKpULQ6vmhVZZW', 'Bob', 'Odinson'),
       ('alice@test.com', '$2a$12$n1oNmtcIgwSUQQ4FrItHLuA1jaX1cSg9qBnIxIQ32Ds397J7ByT9.', 'Alice', 'Poppins'),
       ('john@test.com', '$2a$12$gagao3NtNtsgRPBlAPra5e/aJmzjov9h0v3Yh/ZOe9i5wP.j0c5H2', 'John', 'Wick');

INSERT INTO roles (name)
VALUES ('ADMIN'),
       ('CUSTOMER');

INSERT INTO users_roles (user_id, role_id)
VALUES ((SELECT id FROM users WHERE email = 'bob@test.com'), (SELECT id FROM roles WHERE name = 'ADMIN')),
       ((SELECT id FROM users WHERE email = 'alice@test.com'), (SELECT id FROM roles WHERE name = 'CUSTOMER')),
       ((SELECT id FROM users WHERE email = 'john@test.com'), (SELECT id FROM roles WHERE name = 'ADMIN')),
       ((SELECT id FROM users WHERE email = 'john@test.com'), (SELECT id FROM roles WHERE name = 'CUSTOMER'));
