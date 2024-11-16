# Latihan 3 - Aplikasi Pengelola Kontak ([screenshot](#screenshot))

Aplikasi ini memungkinkan pengguna untuk mengelola kontak secara efisien, termasuk menyimpan, mengedit, menghapus, dan mencari kontak. Kontak dapat dikelompokkan berdasarkan kategori seperti keluarga, teman, atau kerja, dan disimpan menggunakan database SQLite.

## Fitur Utama

- **CRUD Kontak**: Tambah, lihat, edit, dan hapus kontak.
- **Pengelompokan Kontak**: Kelompokkan kontak berdasarkan kategori yang dipilih.
- **Pencarian Kontak**: Cari kontak berdasarkan nama atau nomor telepon.
- **Validasi Input**: Memastikan nomor telepon hanya berisi angka dan memiliki panjang yang valid.
- **Ekspor dan Impor**:
  - Ekspor daftar kontak ke file CSV.
  - Impor kontak dari file CSV ke database.

## Komponen GUI

- **JFrame**: Jendela utama aplikasi.
- **JPanel**: Untuk pengelompokan elemen GUI.
- **JLabel**: Label untuk setiap input atau bagian informasi.
- **JTextField**: Input teks untuk nama dan nomor telepon.
- **JButton**: Tombol aksi seperti Tambah, Edit, Hapus, Cari, Ekspor, dan Impor.
- **JList**: Menampilkan daftar kategori.
- **JComboBox**: Memilih kategori kontak.
- **JTable**: Menampilkan daftar kontak.
- **JScrollPane**: Menyediakan scroll untuk JTable atau elemen lain.

## Logika Program

1. **Database SQLite**:
   - Menyimpan data kontak termasuk nama, nomor telepon, dan kategori.
   - Operasi CRUD dilakukan menggunakan perintah SQL.
2. **Validasi Input**:
   - Nomor telepon harus berupa angka.
   - Panjang nomor telepon divalidasi untuk menghindari input yang salah.
3. **Ekspor/Impor CSV**:
   - Daftar kontak dapat diekspor ke file CSV.
   - Kontak dari file CSV dapat diimpor ke database.

## Event Handling

- **ActionListener**: 
  - Menangani tombol Tambah, Edit, Hapus, dan Cari.
- **ItemListener**:
  - Menangani perubahan kategori pada JComboBox.

## Cara Menggunakan

1. **Menambahkan Kontak**:
   - Isi nama, nomor telepon, dan pilih kategori.
   - Klik tombol "Tambah".
2. **Mengedit Kontak**:
   - Pilih kontak dari daftar.
   - Edit informasi pada input yang tersedia.
   - Klik tombol "Edit".
3. **Menghapus Kontak**:
   - Pilih kontak dari daftar.
   - Klik tombol "Hapus".
4. **Mencari Kontak**:
   - Masukkan nama atau nomor telepon pada kolom pencarian.
   - Klik tombol "Cari".
5. **Ekspor/Impor CSV**:
   - Klik tombol "Ekspor" untuk menyimpan daftar kontak ke file CSV.
   - Klik tombol "Impor" untuk menambahkan kontak dari file CSV ke database.

## Struktur File

- **`JFrameAplikasiPengelolaKontak.java`**: Kode sumber utama.
- **`kontak.db`**: File database SQLite (dibuat secara otomatis jika belum ada).
- **`data.csv`**: File CSV yang digunakan untuk ekspor atau impor.

## Instalasi dan Menjalankan Aplikasi

1. Pastikan Java Development Kit (JDK) telah terinstal.
2. Unduh atau kloning repositori ini.
3. Buka file `JFrameAplikasiPengelolaKontak.java` di IDE favorit Anda.
4. Jalankan aplikasi.

## Detail tugas

1. Deskripsi Program:

   - Aplikasi menyimpan informasi kontak seperti nama, nomor telepon, dan kategori kontak ke dalam database SQLite.
   - Pengguna dapat menambahkan, mengedit, menghapus kontak tersimpan.
   - Kontak dapat dikelompokkan berdasarkan kategori yang dipilih dari JComboBox, seperti keluarga, teman, atau kerja.

2. Komponen GUI: JFrame, JPanel, JLabel, JTextField, JButton, JList, JComboBox, JTable, JScrollPane

3. Logika Program: database SQLite, fitur CRUD (Create, Read, Update, Delete)

4. Events:

   - ActionListener untuk tombol Tambah, Edit, Hapus, dan Cari Kontak.
   - ItemListener untuk JComboBox kategori kontak

5. Variasi:

   - Tambahkan fitur pencarian kontak berdasarkan nama atau nomor telepon, lalu tampilkan hasilnya di JTable
   - Buat validasi input untuk memastikan nomor telepon yang dimasukkan hanya berisi angka dan memiliki panjang yang sesuai
   - Sediakan fitur untuk mengekspor daftar kontak ke file CSV dan mengimpor kontak dari file CSV ke database.

## Screenshot

Nama : Ahmad Yasser

NPM  : 2210010525

Kelas: 5A REGULER BJB TI

1. Tampilan awal
![image](https://github.com/user-attachments/assets/19e4f697-32a0-443a-bdf0-f5e84b4df76f)

2. Filter kategori teman
![image](https://github.com/user-attachments/assets/744ec6a5-68e3-41fe-92cd-3daf00b2be5e)

3. Cari kontak ahmad
![image](https://github.com/user-attachments/assets/92da2cbc-bf28-4893-aeb5-2b0a43c02738)

4. Tambah kontak  
![image](https://github.com/user-attachments/assets/50c61397-9a63-4894-9fd4-993cac7ac9aa)
![image](https://github.com/user-attachments/assets/407b58aa-c04e-44fc-8359-2e2e10252bda)

5. Edit kontak  
![image](https://github.com/user-attachments/assets/e0d8f92b-82ba-41d2-bef9-2197824ceff1)
![image](https://github.com/user-attachments/assets/057f56b3-6005-432e-bcb4-62816d5b6855)
![image](https://github.com/user-attachments/assets/b00a1bad-1dca-4adc-bc82-551b784d1d61)

6. Hapus kontak  
![image](https://github.com/user-attachments/assets/187aae3d-2eea-442f-91ca-b6573fa40eae)
![image](https://github.com/user-attachments/assets/b4d2da5d-7633-4df8-8d19-a3d75d35a3cd)
![image](https://github.com/user-attachments/assets/6e8cb797-9793-4f1f-bb1c-1302395983f3)

7. Ekspor CSV  
![image](https://github.com/user-attachments/assets/e0d10325-a2cd-476d-8cec-a72ba11398a1)
![image](https://github.com/user-attachments/assets/bfdd96c4-d285-4603-82b7-685469d1dcf6)
![image](https://github.com/user-attachments/assets/e615ee29-d102-4d94-8de9-b19eb9c7d780)

8. Impor CSV  
![image](https://github.com/user-attachments/assets/7110bbf7-7444-476f-83d0-d2958dfe7b8b)
![image](https://github.com/user-attachments/assets/310643f1-7c6e-4a79-b444-b075cd809008)
