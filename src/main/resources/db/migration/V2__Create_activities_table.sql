ALTER TABLE users ADD PRIMARY KEY (id);

CREATE TABLE activities (
    id serial PRIMARY KEY,
    activity_name VARCHAR(100) NOT NULL,
    user_id INT REFERENCES users (id),
    month INT NOT NULL,
    total_minutes INT,
    notes VARCHAR
);