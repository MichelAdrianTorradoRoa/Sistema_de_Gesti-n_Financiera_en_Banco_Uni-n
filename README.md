# Examen Sistema de Gestion Financiera en Banco Union

Este repositorio contiene el esquema, configuraciones y procedimientos SQL para la implementación de una base de datos de gestión financiera.

## Tabla de Contenidos 📋
| Índice | Título  |
|--------|---------|
| 1      | [Requerimientos](#requerimientos) |
| 2      | [Instalación](#instalacion)       |
| 3      | [Uso del Proyecto](#uso-del-proyecto) |
| 4      | [Autor](#autor)               |

---

## 1. Requerimientos 📋

Para implementar y ejecutar este proyecto necesitas:

- **Sistema de Gestión de Base de Datos**: MySQL 8.0 o superior.
- **Entorno de Desarrollo**: Apache NetBeans, VSCode u otro editor compatible con SQL.
- **Software de Control de Versiones**: Git.
- **Repositorio Privado en GitHub** (para seguimiento y despliegue).
- **Sistemas Operativos Compatibles**: Windows, Linux o MacOS.

---

## 2. Instalación ⚙️

### 2.1 Clonar el Repositorio

Ejecuta el siguiente comando en tu terminal para clonar este proyecto:
```bash
https://github.com/MichelAdrianTorradoRoa/Sistema_de_Gesti-n_Financiera_en_Banco_Uni-n.git
```

### 2.2 Configuración de Base de Datos

1. Importa el archivo `banco_unoion.sql` que contiene la estructura y datos iniciales:
```bash
mysql -u usuario -p nombre_base_datos < database.sql
```

2. Verifica la creación de tablas y datos:
```sql
USE nombre_base_datos;
SHOW TABLES;
```
---

## 3. Uso del Proyecto 🚀

Este proyecto permite:

- Gestión de clientes, cuentas, cheques y reportes.
- Ejecución de consultas SQL predefinidas.

---


## 4. Autores ✍️
Hecho por [@MichelAdrianTorradoRoa](https://github.com/MichelAdrianTorradoRoa)
