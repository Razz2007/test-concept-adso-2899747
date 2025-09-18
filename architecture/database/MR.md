# Restaurant Management System – Refined Data Model

## 🧭 Conventions
- Tablas y columnas en **snake_case**, en **singular**.  
- Llaves primarias son **UUID** generados con `gen_random_uuid()` (`CREATE EXTENSION pgcrypto;`).  
- **Campos de auditoría (7):**  
  - `status`  
  - `created_at` / `created_by`  
  - `updated_at` / `updated_by`  
  - `deleted_at` / `deleted_by`  
- Llaves foráneas con **ON UPDATE CASCADE** y reglas de **ON DELETE** según el dominio.  
- **Restricciones únicas** en códigos y nombres (scopeds donde aplique).  

---

## Module: Cliente & Reservas
- **cliente** {id, first_name, last_name, phone, email, address, birth_date}  
- **mesa** {id, code, capacity, location, status}  
- **reserva** {id, code, cliente_id, mesa_id, reservation_date, reservation_time, number_of_people, special_request}  

---

## Module: Pedidos & Cocina
- **pedido** {id, code, cliente_id, mesa_id, order_date, status, total}  
- **detalle_pedido** {id, pedido_id, plato_id, quantity, price}  
- **plato** {id, code, name, description, price, preparation_time, status}  
- **ingrediente** {id, code, name, unit, stock, min_stock, max_stock}  
- **plato_ingrediente** {id, plato_id, ingrediente_id, quantity_required}  

---

## Module: Administración
- **empleado** {id, first_name, last_name, document_number, role, phone, email, hire_date, salary}  
- **proveedor** {id, name, contact_name, phone, email, address}  
- **inventario** {id, ingrediente_id, current_stock, last_updated}  

---

📌 Notas:  
- En **Cliente & Reservas**, se gestiona la relación cliente-mesa-reserva.  
- En **Pedidos & Cocina**, cada pedido se desglosa en detalles con platos e ingredientes, lo que permite controlar stock.  
- En **Administración**, se gestiona al personal, proveedores y control de inventario.
