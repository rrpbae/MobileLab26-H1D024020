import 'package:flutter/material.dart';
import 'package:belajar_flutter/ui/produk_page.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Toko Kita',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.blue,
        useMaterial3: false, // Memaksa menggunakan style Material 2 persis seperti modul
      ),
      home: const ProdukPage(),
    );
  }
}