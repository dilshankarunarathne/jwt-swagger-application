-- Create the User table
CREATE TABLE IF NOT EXISTS User (
                                    id INT AUTO_INCREMENT PRIMARY KEY,
                                    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    enabled BOOLEAN NOT NULL
    );

-- Insert some initial data
INSERT INTO User (username, password, enabled) VALUES
                                                   ('user1', 'password1', true),
                                                   ('user2', 'password2', true);
