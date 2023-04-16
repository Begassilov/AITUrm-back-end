CREATE TABLE IF NOT EXISTS users
(
    id               BIGSERIAL PRIMARY KEY NOT NULL,
    first_name       VARCHAR               NOT NULL,
    last_name        VARCHAR               NOT NULL,
    patronymic_name  VARCHAR,
    phone_number     VARCHAR               NOT NULL,
    gender           INT                   NOT NULL,
    speciality       INT                   NOT NULL,
    speciality_group VARCHAR               NOT NULL
)