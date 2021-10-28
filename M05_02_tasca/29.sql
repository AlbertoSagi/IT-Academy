/* 29. Muestra el nombre de los empleados que, teniendo un salario superior 
a 1000, tengan como jefe al empleado cuyo codigo es 7698.*/

SELECT ENAME
FROM empleados
WHERE sal>1000 and MGR=7698;