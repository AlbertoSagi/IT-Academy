/* 31. Indica para cada empleado el porcentaje que supone su comision sobre su 
salario, ordenando el resultado por el nombre del mismo.*/

SELECT ifnull(COMM/SAL*100,"") PORCENTAJE
FROM empleados
ORDER BY ENAME;