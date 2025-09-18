# Restaurant Management System – Refined Data Model

## 🧭 Conventions
- Tables and columns in **snake_case**, in **singular**.  
- Primary keys are **UUID** generated with `gen_random_uuid()` (`CREATE EXTENSION pgcrypto;`).  
- **Audit fields (7):**  
  - `status`  
  - `created_at` / `created_by`  
  - `updated_at` / `updated_by`  
  - `deleted_at` / `deleted_by`  
- Foreign keys with **ON UPDATE CASCADE** and **ON DELETE** rules according to the domain.  
- **Unique constraints** on codes and names (scoped where applicable).  

---

## Module: Customers & Reservations
- **customer** {id, first_name, last_name, phone, email, address, birth_date}  
- **table** {id, code, capacity, location, status}  
- **reservation** {id, code, customer_id, table_id, reservation_date, reservation_time, number_of_people, special_request}  

---

## Module: Orders & Kitchen
- **order** {id, code, customer_id, table_id, order_date, status, total}  
- **order_detail** {id, order_id, dish_id, quantity, price}  
- **dish** {id, code, name, description, price, preparation_time, status}  
- **ingredient** {id, code, name, unit, stock, min_stock, max_stock}  
- **dish_ingredient** {id, dish_id, ingredient_id, quantity_required}  

---

## Module: Administration
- **employee** {id, first_name, last_name, document_number, role, phone, email, hire_date, salary}  
- **supplier** {id, name, contact_name, phone, email, address}  
- **inventory** {id, ingredient_id, current_stock, last_updated}  

---

📌 Notes:  
- In **Customers & Reservations**, the relationship between customer-table-reservation is managed.  
- In **Orders & Kitchen**, each order is broken down into details with dishes and ingredients, allowing stock control.  
- In **Administration**, staff, suppliers, and inventory management are handled.  
