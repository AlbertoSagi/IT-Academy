/* 54. Halla el nombre el ultimo empleado por orden alfabetico.*/

SELECT ENAME
FROM empleados
ORDER BY ENAME DESC
LIMIT 1; 