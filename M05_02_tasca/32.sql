/* 32. Hallar los empleados del departamento 10 cuyo nombre no contiene la cadena LA.*/

SELECT ENAME, deptno
FROM empleados
WHERE DEPTNO=10 AND ENAME not like '%LA%';