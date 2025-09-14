# Registro de Artículos - Proyecto Java Swing

## 📝 Objetivo General

Permitir al usuario registrar artículos de distintos tipos: **Enlatado**, **Empacado** y **Refrigerado**, ingresando información relevante como:

- Nombre del producto  
- Precio  
- Fecha de vencimiento  
- Tipo de artículo  
- Refrigeración  
- Peso o contenido según corresponda  

El sistema valida los datos ingresados, asigna un **ID automático** a cada artículo y los muestra en un área de texto (`jtxVista`) para visualización inmediata.

---

## 🚀 Funcionalidades Principales

1. **Registro de Artículos**  
   Permite ingresar artículos y clasificarlos según su tipo.

2. **Validaciones de Datos**  
   - Nombre: letras, números, espacios y guiones bajos.  
   - Precio: solo números y un punto decimal, con máximo 2 decimales.  
   - Fecha: formato `dd/MM/yyyy` y debe estar completa.  
   - Rango de refrigeración: valores entre 0 y 10.  
   - Peso o contenido: números válidos según el tipo de artículo.  

3. **Interfaz Amigable (UX)**  
   - Bloqueo de campos innecesarios según tipo de artículo.  
   - Reinicio automático de campos al guardar (`limpiar()`), incluyendo volver el `JComboBox` a la opción por defecto.  
   - Mensajes claros para el usuario sobre errores o éxito en el registro.  

---

## 🛠 Prácticas y Conceptos Aplicados

### 1. **Programación Orientada a Objetos (POO)**
- Cada tipo de artículo (`Enlatados`, `Empacados`, `Refrigerados`) tiene su propia clase.  
- Uso de atributos privados y métodos `getter`/`setter` para encapsulación.  

### 2. **Manejo de Componentes Swing**
- `JTextField`, `JComboBox`, `JButton`, `JTextArea`.  
- Uso de `setEditable` para habilitar o deshabilitar campos según la selección.  
- Eventos: `ActionListener`, `KeyListener`, `ItemListener`.  

### 3. **Validaciones en Tiempo Real**
- `KeyTyped` para controlar la entrada de datos mientras se escribe.  
- Mensajes de error inmediatos con `JOptionPane`.  

### 4. **Lógica de Negocio**
- Habilita campos específicos según el tipo de artículo.  
- Guarda los registros y los muestra en `jtxVista`.  
- Incrementa automáticamente el ID de cada artículo.  

---

## 🎯 Flujo de Trabajo

1. El usuario ejecuta el proyecto y abre el formulario.  
2. Selecciona el tipo de artículo en el `JComboBox`.  
3. Ingresa los datos correspondientes en los campos habilitados.  
4. Presiona **Guardar Artículo**.  
5. El sistema valida los datos:  
   - Si hay errores, muestra mensajes de alerta.  
   - Si todo es correcto, agrega el artículo al listado y limpia los campos.  
6. El área de texto (`jtxVista`) se actualiza con el registro ingresado.  

---

## 💡 Buenas Prácticas Implementadas
- Encapsulación de datos y POO.  
- Validaciones preventivas para mejorar la experiencia del usuario.  
- Mensajes claros y feedback inmediato.  
- Reinicio automático de campos y selección por defecto del `JComboBox`.  

---

## ⚙️ Requisitos
- Java JDK 8 o superior.  
- IDE compatible con Swing (NetBeans, IntelliJ, Eclipse, etc.).  
- Ejecución directa desde el método `main` del formulario `VistaIngresoArticulos`.  


