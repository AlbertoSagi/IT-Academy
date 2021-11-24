/* 53. Obten informacion en la que se reflejen los nombres, empleos y salarios tanto de 
los empleados que superan en salario a Allen como del propio Allen.*/

SELECT ENAME, JOB, SAL
FROM empleados
WHERE SAL>=(SELECT SAL
FROM empleados
WHERE ENAME= 'Allen');