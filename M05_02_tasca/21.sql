/* 21. Lo mismo que la anterior, pero mostrando tambien su salario original, y 
haz que la columna que almacena el nuevo salario se denomine NUEVO SALARIO.*/

SELECT ename, sal, sal+1000
FROM empleados
WHERE deptno = 30;