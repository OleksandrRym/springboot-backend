CREATE TABLE users
(
    id                   SERIAL PRIMARY KEY,
    username             VARCHAR(50)  NOT NULL UNIQUE,
    password             VARCHAR(255) NOT NULL,
    avatar_url           VARCHAR(255),
    subscriptions_amount INT          NOT NULL DEFAULT 0,
    first_name           VARCHAR(50),
    last_name            VARCHAR(50),
    is_active            BOOLEAN      NOT NULL DEFAULT TRUE,
    city                 VARCHAR(50)
);
