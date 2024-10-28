drop database if exists springtest;
create schema springtest;
use springtest;

-- user 테이블 생성
CREATE TABLE users (
    `id` VARCHAR(20) PRIMARY KEY,
    `password` VARCHAR(100) NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `role` VARCHAR(10) NOT NULL -- 'USER' 또는 'ADMIN'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- resource 테이블 생성 (예약 가능한 자원 정보)
CREATE TABLE resources (
    `resource_id` INT AUTO_INCREMENT PRIMARY KEY,
    `resource_name` VARCHAR(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- reservation 테이블 생성 (예약 정보)
CREATE TABLE reservations (
    `reservation_id` INT AUTO_INCREMENT PRIMARY KEY,
    `user_id` VARCHAR(20),
    `resource_id` INT,
    `start_time` TIMESTAMP NOT NULL,
    `end_time` TIMESTAMP NOT NULL,
    FOREIGN KEY (`user_id`) REFERENCES users(`id`) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (`resource_id`) REFERENCES resources(`resource_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 테스트 데이터 삽입

-- user 테이블에 테스트 데이터 삽입
INSERT INTO users (`id`, `password`, `name`, `email`, `role`) VALUES
('ssafy', '1234', 'Alice', 'alice@example.com', 'USER'),
('user2', 'password2', 'Bob', 'bob@example.com', 'USER'),
('admin2', '1234', 'Charlie', 'charlie@example.com', 'ADMIN');

-- resource 테이블에 테스트 데이터 삽입
INSERT INTO resources (`resource_name`) VALUES
('Conference Room A'),
('Conference Room B'),
('Projector 1'),
('Projector 2');

-- reservation 테이블에 테스트 데이터 삽입
INSERT INTO reservations (`user_id`, `resource_id`, `start_time`, `end_time`) VALUES
('ssafy', 1, '2024-10-22 10:00:00', '2024-10-22 12:00:00'),
('ssafy', 3, '2024-10-23 14:00:00', '2024-10-23 15:30:00'),
('ssafy', 4, '2024-10-24 09:00:00', '2024-10-24 11:00:00'),
('user2', 1, '2024-10-24 13:00:00', '2024-10-24 14:00:00'),
('user2', 2, '2024-10-25 10:00:00', '2024-10-25 11:30:00'),
('user2', 4, '2024-10-25 15:00:00', '2024-10-25 17:00:00'),
('admin2', 1, '2024-10-20 09:00:00', '2024-10-20 10:00:00'),
('admin2', 2, '2024-10-21 11:00:00', '2024-10-21 13:00:00'),
('admin2', 3, '2024-10-22 14:00:00', '2024-10-22 15:30:00'),
('admin2', 4, '2024-10-23 16:00:00', '2024-10-23 17:30:00'),
('ssafy', 2, '2024-10-26 08:00:00', '2024-10-26 10:00:00'),
('ssafy', 3, '2024-10-26 12:00:00', '2024-10-26 14:00:00'),
('user2', 1, '2024-10-27 10:00:00', '2024-10-27 11:00:00'),
('user2', 3, '2024-10-28 09:00:00', '2024-10-28 10:30:00'),
('user2', 4, '2024-10-28 11:00:00', '2024-10-28 12:30:00'),
('admin2', 2, '2024-10-29 14:00:00', '2024-10-29 15:00:00'),
('admin2', 3, '2024-10-30 09:00:00', '2024-10-30 11:00:00'),
('admin2', 1, '2024-10-31 13:00:00', '2024-10-31 15:00:00');

commit;

select * from reservations;

