-- Створення таблиці
CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       username VARCHAR(50) NOT NULL UNIQUE,
                       avatar_url TEXT,
                       subscriptions_amount INTEGER DEFAULT 0,
                       first_name VARCHAR(50),
                       last_name VARCHAR(50),
                       is_active BOOLEAN DEFAULT TRUE,
                       stack TEXT[] DEFAULT '{}',
                       city VARCHAR(50)
);

