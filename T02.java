// 12S24015 - Lucas Pardede
// 12S24022 - Ingrate Joy Sihombing
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeisbn, judul, penulis, penerbit, formatbuku;
        String kategori;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating;

        kodeisbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        hargapembelian = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategori = "Average";
                    } else {
                        kategori = "Low";
                    }
                }
            }
        }
        System.out.println(kodeisbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
