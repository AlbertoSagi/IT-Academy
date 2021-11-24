/* 33. Obten los empleados que no son supervisados por ningun otro.*/

SELECT ename
FROM empleados
WHERE MGR IS NULL;