/* 50. Para los empleados que tengan como jefe a un empleado con codigo mayor que 
el suyo, obten los que reciben de salario mas de 1000 y menos de 2000, o que estan en el departamento 30.*/

SELECT ENAME
FROM empleados
WHERE MGR>EMPNO AND (SAL BETWEEN 1000 AND 2000 OR DEPTNO=30);