/* 47. Lista los nombres y fecha de contratacion de aquellos empleados que no son vendedores (SALESMAN).*/

SELECT ENAME, date_format(HIREDATE, '%d/%m/%y') HIREDATE
FROM empleados
WHERE JOB NOT LIKE 'SALESMAN';