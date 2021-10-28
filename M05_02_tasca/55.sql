/* 55. Halla el salario mas alto, el mas bajo, y la diferencia entre ellos.*/

SELECT max(SAL) AS SALARIO_MAX, min(SAL) AS SALARIO_MIN, max(SAL)-min(SAL) AS DIFERENCIA
FROM empleados;