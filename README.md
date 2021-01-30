# Rename&Format

### Caso de uso
---

Supongamos una carpeta D:\Física en la cual tenemos una batería de archivos con nombre:

* MICROSOFT WORD - CAMPO MAGNÉTICO.pdf
* MICROSOFT WORD - CAMPO ELECTRICO.pdf
* Etc...

También existen archivos como:

* FÍSICA RELATIVISTA.pdf
* FÍSICA RELATIVISTA (1).pdf

Donde el (1) indica que el archivo contiene ejercicios del temario en cuestión

---
 ### Función del script
---
El script dejará los archivos renombrados de la siguiente forma:

* Campo magnético.pdf
* Campo eléctrico.pdf
* Física relativista **actividades**.pdf
* Física relativista.pdf

---
El script también maneja las excepciones de tal forma que los scripts que no cumplen ninguna característica no se ven afectados.

---

# English version

### Case of use
---

Just suppose a dir D:\Physics where we have some files named like: 

* MICROSOFT WORD - MAGNETIC FIELD.pdf
* MICROSOFT WORD - ELECTRIC FIELD.pdf
* Etc...

There are also files like:

* RELATIVISTIC PHYSICS.pdf
* RELATIVISTIC PHYSICS (1).pdf

And (1) means that the file is a pdf of activities.

---
 ### Script function
---
The script will rename the fields like:

* Magnetic field.pdf
* Electric field.pdf
* Relativistic physics **activities**.pdf
* Relativistic physics.pdf

---
The script will catch the exceptions too, so if a file doesn´t fulfill those requirements, it wont be affected.

---
### Example log
```java
*--------*
|Renaming|
*--------*
A LUZ E AS ONDAS ELECTROMAGNÉTICAS (1).pdf Renamed succesfully!
A luz e as ondas electromagnéticas.pdf Renamed succesfully!
Algúns tipos de forzas.pdf Renamed succesfully!
*----------*
|Formatting|
*----------*
Formatting: A luz e as ondas electromagnéticas (1).pdf
Formatting: A luz e as ondas electromagnéticas.pdf
Formatting: Algúns tipos de forzas.pdf
*--------------------*
|Setting as exercises|
*--------------------*
A luz e as ondas electromagnéticas actividades.pdf
A luz e as ondas electromagnéticas.pdf
Algúns tipos de forzas.pdf
----------------------
Script completed successfully
```
---
