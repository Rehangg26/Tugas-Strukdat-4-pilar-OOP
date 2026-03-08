# Review 4 Pilar OOP - Java RPG Simulation

Repositori ini berisi implementasi konsep dasar **Object-Oriented Programming (OOP)** menggunakan bahasa Java melalui studi kasus karakter game (Warrior & Mage).

---

## 🚀 Implementasi 4 Pilar OOP

Berikut adalah penjelasan tiap pilar berdasarkan kode yang ada di `Main.java`:

### 1. Abstraction (Abstraksi)
Abstraksi digunakan untuk menyembunyikan detail implementasi dan hanya menampilkan fungsi penting.
* **Dalam Kode:** Terlihat pada `abstract class Hero`. Kita tahu setiap Hero pasti memiliki `skill()`, tapi kita tidak menentukan *bagaimana* skill itu bekerja di kelas induk.
* **Fungsi:** Memastikan bahwa kelas `Hero` tidak bisa dibuat objeknya secara langsung (`new Hero()` akan error) dan memaksa setiap subclass untuk mengimplementasikan skill-nya sendiri.



### 2. Encapsulation (Pengkapsulan)
Membungkus data (variabel) dan metode dalam satu unit, serta membatasi akses langsung dari luar.
* **Dalam Kode:** Penggunaan akses modifier `protected` dan `private`.
* **Fitur Utama:**
    * **Getter (`getNama`)**: Mengambil data secara aman.
    * **Setter (`setHealth`)**: Mengubah data dengan validasi (Contoh: Mencegah HP bernilai negatif).

### 3. Inheritance (Pewarisan)
Mekanisme di mana satu kelas (subclass) mewarisi sifat dan perilaku dari kelas lain (superclass).
* **Dalam Kode:** `class Warrior extends Hero` dan `class Mage extends Hero`.
* **Fungsi:** `Warrior` dan `Mage` tidak perlu menulis ulang variabel `nama` atau method `cekStatus()` karena sudah mendapat warisan dari kelas `Hero`. Keyword `super(n, h)` digunakan untuk mengirim data ke konstruktor induk.



### 4. Polymorphism (Polimorfisme)
Kemampuan suatu objek untuk memiliki banyak bentuk. Dalam hal ini, satu nama metode memiliki perilaku yang berbeda.
* **Dalam Kode:** Penggunaan `@Override` pada metode `skill()`.
* **Fungsi:** Saat kita memanggil `w1.skill()` dan `m1.skill()`, program menjalankan kode yang berbeda. `Warrior` mengeluarkan aksi Armor, sedangkan `Mage` mengeluarkan aksi Mana, meskipun nama metodenya sama-sama `skill()`.

---

## 🛠️ Cara Menjalankan
1. Pastikan Java sudah terinstal.
2. Compile file:
   ```bash
   javac Main.java
