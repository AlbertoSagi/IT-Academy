/* 57. Considerando empleados con salario menor de 5000, halla la media de los salarios 
de los departamentos cuyo salario minimo supera a 900. Muestra tambien el codigo y 
el nombre de los departamentos.*/

SELECT
    e.DEPTNO,
    d.DNAME,
    AVG(e.SAL)
FROM
    empleados e
JOIN
    departamentos d
ON
    e.DEPTNO = d.DEPTNO
WHERE
    e.SAL < 5000
GROUP BY
    e.DEPTNO
HAVING
    MIN(e.SAL) > 900;