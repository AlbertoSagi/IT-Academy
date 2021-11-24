/* 19. Obten las comisiones de los empleados y sus Obtens de departamento, de forma que no serepitan filas.*/

SELECT DISTINCT ifnull(COMM,"") COMMISSION, DEPTNO
FROM empleados
ORDER BY COMM, DEPTNO;