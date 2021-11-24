/* 20. Obten los nuevos salarios de los empleados del departamento 30, que resultar³an 
de sumar a su salario una gratificacion de 1000. Muestra tambien los nombres de los empleados.*/

SELECT ename, sal+1000
FROM empleados
WHERE deptno = 30;
