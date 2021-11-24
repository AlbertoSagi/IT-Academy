/* 17. Obten el nombre de empleado y su comision SIN FILAS repetidas.*/

SELECT ename, ifnull(COMM,"") COMM
FROM empleados
ORDER BY ename ASC;