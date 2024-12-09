CREATE TABLE candidates (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    namecandidate VARCHAR(100) NOT NULL,
    birthdate DATE NOT NULL,
    email VARCHAR(50) NOT NULL,
    gender VARCHAR(10),
    salary_expected DECIMAL(10, 2),
    country VARCHAR(50),
    country_residence VARCHAR(50),
    phonenumber VARCHAR(25),
    current_position VARCHAR(55),
    recruitment_status VARCHAR(55),
    experience_years INT,
    skills VARCHAR(200)

);

INSERT INTO candidates (namecandidate, birthdate, email,  gender, salary_expected, country, country_residence, phonenumber, current_position, recruitment_status,experience_years, skills)
VALUES
('Juan Perez', '1989/01/02', 'juanperez@mail.com', 'Masculino', 2700.00, 'Paraguay', 'Paraguay', '59598112346', 'Backend Developer', 'Entrevista Tecnica', 5, 'Java, Spring Boot'),
('Jacinto Rodriguez', '1999/03/03', 'jacinto@mail.com', 'Masculino', 3000.00, 'Paraguay', 'Argentina', '595971123456', 'Backend Developer', 'Contactado', 8, 'Python, Django'),
('Amanda Ramirez', '2001/05/07', 'amanda@mail.com', 'Femenino', 2500.00, 'Argentina', 'Argentina', '5553112233', 'Frontend Developer', 'Entrevista Cliente', 3, 'React, Angular'),
('Diana Gonzales', '1979/06/06', 'diana@mail.com', 'Femenino', 4000.00, 'Peru', 'Peru', '5511447765', 'DevOps', 'Entrevista Cliente', 10, 'AWS, DevOps');