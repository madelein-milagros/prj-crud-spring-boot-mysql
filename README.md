# 🎓 Sistema de Gestión de Cursos - Spring Security

Una aplicación web completa desarrollada con **Spring Boot 3.5.7** que implementa un sistema de gestión de cursos con autenticación y autorización mediante **Spring Security 6**.

## ✨ Características

- **🔐 Autenticación Segura**: Spring Security con BCrypt
- **👥 Control de Roles**: ADMIN y USER con permisos diferenciados
- **📚 CRUD Completo**: Crear, leer, actualizar y eliminar cursos
- **🎨 Diseño Moderno**: Interfaz con colores pasteles y Bootstrap 5
- **🗄️ Base de Datos**: MySQL con JPA/Hibernate
- **🌐 Thymeleaf**: Templates con seguridad integrada

## 🛠️ Tecnologías Utilizadas

- **Backend**: Spring Boot 3.5.7, Spring Security 6, Spring Data JPA
- **Frontend**: Thymeleaf, Bootstrap 5, JavaScript
- **Base de Datos**: MySQL 8.0
- **Autenticación**: Spring Security, BCryptPasswordEncoder
- **Herramientas**: Maven, IntelliJ IDEA, Git

## 🚀 Instalación y Configuración

### Prerrequisitos
- Java 17 o superior
- MySQL 8.0
- Maven 3.6+

### Pasos de instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/TU_USUARIO/prj-crud-spring-boot-mysql.git
   cd prj-crud-spring-boot-mysql

Configurar la base de datos

sql
CREATE DATABASE bd_spring_security;
Configurar las credenciales en src/main/resources/application.properties

properties
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
Ejecutar la aplicación

bash
mvn spring-boot:run
Acceder a la aplicación

text
http://localhost:8080
🔐 Credenciales de Prueba
Administrador
Usuario: admin

Contraseña: 12345

Permisos: CRUD completo de cursos

Usuario Normal
Usuario: user

Contraseña: 12345

Permisos: Solo lectura de cursos

📁 Estructura del Proyecto
text
src/main/java/com/tecsup/prj_crud_spring_boot_mysql/
├── config/          # Configuraciones de Spring Security
├── entities/        # Entidades JPA (Usuario, Rol, Curso)
├── persistence/     # Repositorios Spring Data
├── services/        # Lógica de negocio
├── controllers/     # Controladores MVC
└── PrjCrudSpringBootMysqlApplication.java
🎯 Funcionalidades
Para ADMIN
✅ Ver lista de cursos

✅ Crear nuevos cursos

✅ Editar cursos existentes

✅ Eliminar cursos

✅ Ver detalles de cursos

Para USER
✅ Ver lista de cursos

✅ Ver detalles de cursos

❌ No puede crear, editar o eliminar

📸 Capturas de Pantalla
Interfaz de login moderna con diseño de colores pasteles

Lista de cursos con tarjetas interactivas

Formularios responsivos con validación

🤝 Contribución
Fork el proyecto

Crea una rama para tu feature (git checkout -b feature/AmazingFeature)

Commit tus cambios (git commit -m 'Add some AmazingFeature')

Push a la rama (git push origin feature/AmazingFeature)

Abre un Pull Request

📄 Licencia
Este proyecto está bajo la Licencia MIT - ver el archivo LICENSE para detalles.

👨‍💻 Autor
madelein-milagros - https://github.com/madelein-milagrosT

⭐️ ¡Dale una estrella al proyecto si te fue útil!
