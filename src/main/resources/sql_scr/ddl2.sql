CREATE TABLE user_stack
(
    id      SERIAL PRIMARY KEY,
    user_id INT         NOT NULL,
    stack   VARCHAR(50) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);