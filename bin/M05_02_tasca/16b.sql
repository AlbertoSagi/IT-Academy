/* 16. (b) Obten las comisiones de los empleados de forma que no se repitan.*/

SELECT DISTINCT ifnull(COMM,0) COMM
FROM empleados;
