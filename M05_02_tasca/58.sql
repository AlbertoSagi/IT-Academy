/* 58. Â¿Que empleados trabajan en ciudades de mas de cinco letras? Ordena el resultado 
inversamente por ciudades y normalmente por los nombres de los empleados.*/

/*SELECT LOC 
FROM departamentos
WHERE loc LIKE '____%';*/

SELECT e.ENAME
FROM empleados e
JOIN departamentos d
ON d.deptno = e.deptno
ORDER BY LOC DESC, e.ENAME;



