# Sobre el proyecto:
Trabajo práctico orientación a objetos 2.

Consiste en el sistema de stock de un negocio de zapatillas, en el cual un cliente puede
realizar compras, mientras que el administrador puede gestionar y monitorear los productos
y los movimientos que ocurren en base a estos.

### Tecnologías utilizadas:
- Java 17
- Spring framework
- MySQL
- HTML, CSS, JS, Bootstrap
- Git / GitHub

### Definición de los casos de uso / funcionalidades:

Administrador:

- Alta, baja y modificación de productos
- Vista de informes de estado de productos en relación a su stock
- Alta de pedidos de stock para productos
- Vista y aceptación de los pedidos
- Vista de consultas (traer pedidos y compras filtrando por fechas o producto)

Cliente:
- Compra de productos (baja en el stock)
  
Usuarios en general:
- Login – Logout.

### Video explicativo:
https://drive.google.com/file/d/1oyPd3GEx8iQ6zL1VysQl6kedbEsHKb-f/view

# Cómo levantar el proyecto

Clonar el repositorio alojado en GitHub https://github.com/LeanAranda/sistema-de-stock-TP-OO2

Crear una base de datos local llamada tpgrupo4

Configurar las siguientes variables de entorno para el application.yml
- DB_URL
> Ejemplo: jdbc:mysql://localhost:3306/tpGrupo4?useSSL=false&serverTimezone=UTC
- PASSWORD
- USERNAME

Iniciar el proyecto, esperar a que compile y se carguen las tablas en la base de
datos.
> El proyecto se puede ver en el localhost 8080

Una vez cargada, hacer los inserts del siguiente script en la base de datos:
https://drive.google.com/file/d/1scCiRpvyCNYsMql32pDzjxvvmuMwMvux/view

Ya puede probar todas las funcionalidades del proyecto.

### Nombres de los usuarios para el login:

Administrador:

- Username: admin
- Password: admin

Usuario / cliente

- Username: user
- Password: user
