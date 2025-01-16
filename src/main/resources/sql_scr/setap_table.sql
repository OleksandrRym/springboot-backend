INSERT INTO users (username, avatar_url, subscriptions_amount, first_name, last_name, is_active, stack, city)
VALUES
('alexsmith', 'https://randomuser.me/api/portraits/men/1.jpg', 15, 'Alex', 'Smith', TRUE, ARRAY['Java', 'Spring Boot', 'Docker'], 'Kyiv'),

('annajones', 'https://randomuser.me/api/portraits/women/2.jpg', 20, 'Anna', 'Jones', TRUE, ARRAY['Python', 'Flask', 'PostgreSQL'], 'Lviv'),

('robertbrown', 'https://randomuser.me/api/portraits/men/3.jpg', 10, 'Robert', 'Brown', FALSE, ARRAY['JavaScript', 'React', 'Node.js'], 'Kharkiv'),

('karenwilson', 'https://randomuser.me/api/portraits/women/4.jpg', 8, 'Karen', 'Wilson', TRUE, ARRAY['C++', 'Qt', 'OpenGL'], 'Odesa'),

('johnjohnson', 'https://randomuser.me/api/portraits/men/5.jpg', 30, 'John', 'Johnson', TRUE, ARRAY['Kotlin', 'Android', 'Jetpack'], 'Dnipro'),

('emilyclark', 'https://randomuser.me/api/portraits/women/6.jpg', 12, 'Emily', 'Clark', FALSE, ARRAY['Swift', 'iOS', 'Xcode'], 'Zaporizhzhia'),

('michaellee', 'https://randomuser.me/api/portraits/men/7.jpg', 18, 'Michael', 'Lee', TRUE, ARRAY['Ruby', 'Rails', 'MySQL'], 'Chernihiv'),

('sophiadavis', 'https://randomuser.me/api/portraits/women/8.jpg', 22, 'Sophia', 'Davis', TRUE, ARRAY['PHP', 'Laravel', 'MySQL'], 'Poltava'),

('chriswhite', 'https://randomuser.me/api/portraits/men/9.jpg', 5, 'Chris', 'White', FALSE, ARRAY['Go', 'Docker', 'Kubernetes'], 'Ternopil'),

('lisagreen', 'https://randomuser.me/api/portraits/women/10.jpg', 14, 'Lisa', 'Green', TRUE, ARRAY['HTML', 'CSS', 'Vue.js'], 'Ivano-Frankivsk');
