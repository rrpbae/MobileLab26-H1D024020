import 'dart:math';

// Contoh Class sesuai Modul 1
class Mahasiswa {
  String nama;
  int usia;

  Mahasiswa(this.nama, this.usia);

  void perkenalan() {
    print("Halo, saya $nama dan saya berusia $usia tahun.");
  }
}

// Contoh Fungsi Penjumlahan
int tambah(int a, int b) {
  return a + b;
}

// Fungsi Asinkronus (Async-Await)
Future<void> prosesData() async {
  await Future.delayed(Duration(seconds: 1));
  print("Data async berhasil diproses.");
}

void main() async {
  print("=== LATIHAN MODUL 1 DART ===");

  // 1. Tipe Data
  int angka = 10;
  double desimal = 3.14;
  String teks = "Halo, dunia!";
  bool benar = true;
  print("Tipe data: $angka, $desimal, $teks, $benar");

  // 2. Operasi & Percabangan
  if (angka > 5) {
    print("Angka $angka lebih besar dari 5");
  }

  // 3. Fungsi & Class
  print("Hasil tambah: ${tambah(4, 6)}");
  Mahasiswa mhs = Mahasiswa("Alice", 22);
  mhs.perkenalan();

  // 4. Library Bawaan (dart:math)
  int acak = Random().nextInt(10);
  print("Angka acak: $acak");

  // 5. Async - Await
  print("Menjalankan async...");
  await prosesData();
  print("Selesai.");
}