import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNamaMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaMahasiswa = new ArrayList<>();

        while (true) {
            System.out.print("Masukkan nama mahasiswa (atau 'selesai' untuk berhenti): ");
            String namaInput = scanner.nextLine().trim(); // Hapus spasi whitespace di awal dan akhir

            if (namaInput.isEmpty()) {
                throw new IllegalArgumentException("Nama tidak boleh kosong");
            } else if (namaInput.equalsIgnoreCase("selesai")) {
                break;
            } else {
                namaMahasiswa.add(namaInput);
            }
        }

        // Menangkap exception InputMismatchException
        catch (InputMismatchException e) {
            System.err.println("Input tidak valid. Harap masukkan nama mahasiswa.");
            scanner.next(); // Konsumsi input yang salah
            continue;
        }

        System.out.println("\nDaftar Nama Mahasiswa:");
        for (String nama : namaMahasiswa) {
            System.out.println("- " + nama);
        }
    }
}
