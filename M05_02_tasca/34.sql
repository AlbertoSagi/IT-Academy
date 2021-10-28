/* 34. Obten los nombres de los departamentos que no sean Ventas (SALES) ni 
investigacion (RESEARCH). Ordena el resultado por la localidad del departamento.*/

SELECT DNAME
FROM departamentos
WHERE DNAME NOT IN ('RESEARCH', 'SALES')
ORDER BY LOC;