# Proyecto 2: Clave Dicotómica
Grupo: Luis Guerra y Zadkiel Avedaño

Repositorio: [https://github.com/Luis55-cmd/Proyecto1_MetroBuscaminas](https://github.com/Luis55-cmd/Proyecto2_ClaveDicotomica)

## Clave Dicotomica
Este proyecto consiste en la implementación de una herramienta en Java que permite a los usuarios identificar plantas mediante una clave dicotómica. La aplicación utiliza una interfaz gráfica desarrollada con Java Swing y permite cargar archivos JSON que contienen claves dicotómicas para diferentes especies de plantas. El programa también ofrece la posibilidad de buscar especies por nombre utilizando una tabla de hash o recorriendo un árbol binario.

## Instalacion
- Copiar el repositorio GitHub a tu computadora.
- Abrir el proyecto en `NetBeans` o cualquier otro editor de tu preferencia.
- Darle al boton de `Run` para ejecutar el proyecto.
> [!WARNING]
> Importar las librerias necesarias `.jar` de la carpeta `librerias` adjuntada en el proyecto para su correcto funcionamiento.

## Funcionalidades Implementadas
1. ✅ **Cargar una nueva clave dicotómica**: El programa debe permitir cargar un archivo JSON con una nueva clave dicotómica en cualquier momento.
2. ✅ **Mostrar como árbol**: El programa debe mostrar la clave dicotómica como un árbol binario utilizando GraphStream.
3. ✅ **Determinar especie**: El programa debe guiar al usuario a través de una serie de preguntas para identificar una especie.
4. ✅ **Buscar especie**: El programa debe permitir buscar una especie por nombre utilizando una tabla de hash o recorriendo el árbol.

## Requerimientos Técnicos
- ✅ El programa debe implementar una clase `Árbol` para almacenar la clave dicotómica.
- ✅ Debe implementar una clase `Tabla de Dispersión` (Hash Table) para clasificar los nodos del árbol por el nombre de la especie.
- ✅ La interfaz gráfica debe ser desarrollada con Java Swing.
- ✅ El programa debe cargar archivos JSON para la lectura de datos.
- ❌ El proyecto debe estar documentado con Javadoc.
