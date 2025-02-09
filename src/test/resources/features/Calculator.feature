Feature: Calculator Samsung

  Scenario Outline: Hitung Penjumlahan Sederhana
    Given saya menekan tombol clear untuk penjumlahan
    And saya menekan tombol angka <nilai_pertama>
    And saya menekan tombol plus
    And saya menekan tombol angka <nilai_kedua>
    And saya menekan tombol sama dengan untuk penjumlahan
    Then saya mendapatkan hasil penjumlahan <hasil>

    Examples:
      | nilai_pertama | nilai_kedua | hasil |
      | 10            | 20           | 30      |
      | 200           | 30           | 230     |
      | 50            | 75           | 125     |

  Scenario Outline: Hitung Pengurangan Sederhana
    Given saya menekan tombol clear untuk pengurangan
    And saya menekan tombol <nilai_pertama>
    And saya menekan tombol minus
    And saya menekan tombol <nilai_kedua>
    And saya menekan tombol sama dengan untuk pengurangan
    Then saya mendapatkan hasil pengurangan <hasil>

    Examples:
      | nilai_pertama | nilai_kedua | hasil |
      | 20            | 10            | 10    |
      | 200           | 30            | 170   |
      | 75            | 50            | 25     |