CREATE TABLE user_stack (
                            user_id BIGINT NOT NULL,
                            stack TEXT NOT NULL,
                            PRIMARY KEY (user_id, stack),
                            FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);
