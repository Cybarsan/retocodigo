package seek.com.retocodigo.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(schema = "candidates")
public class Candidates {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "namecandidate", nullable = false, length = 100)
        private String namecandidate;

        @Column(name = "birthdate")
        private LocalDate birthDate;

        @Column(name = "email", nullable = false, unique = true, length = 50)
        private String email;

        @Column(name = "gender", nullable = false, length = 10)
        private String gender;

        @Column(name = "salary_expected", precision = 10, scale = 2)
        private BigDecimal salaryExpected;

        @Column(name = "country", length = 50)
        private String country;

        @Column(name = "country_residence", length = 50)
        private String countryResidence;

        @Column(name = "phonenumber", length = 20)
        private String phoneNumber;

        @Column(name = "current_position", length = 55)
        private String currentPosition;

        @Column(name = "recruitment_status", length = 50)
        private String recruitmentStatus;

        @Column(name = "experience_years")
        private Integer experienceYears;
    }

