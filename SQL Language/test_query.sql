CREATE SCHEMA `new_schema` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE `new_schema`.`new_table` (
  `id` INT NOT NULL COMMENT 'This is a primary index',
  `name` VARCHAR(45) NOT NULL DEFAULT 'N/A'
  PRIMARY KEY (`id`)
);