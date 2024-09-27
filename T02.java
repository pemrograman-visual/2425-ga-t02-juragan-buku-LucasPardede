// 12S24015 - Lucas Pardede
// 12S24022 - Ingrate Joy Sihombing
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, jUDUL, pENULIS, pENERBIT, fORMATBUKU, kUALITAS;
        double tAHUNTERBIT, hARGAPEMBELIAN, mINIMUMMARGIN, sTOK, rATING;

        kUALITAS = "";
        iSBN = input.nextLine();
        jUDUL = input.nextLine();
        pENULIS = input.nextLine();
        tAHUNTERBIT = Double.parseDouble(input.nextLine());
        pENERBIT = input.nextLine();
        fORMATBUKU = input.nextLine();
        hARGAPEMBELIAN = Double.parseDouble(input.nextLine());
        mINIMUMMARGIN = Double.parseDouble(input.nextLine());
        sTOK = Double.parseDouble(input.nextLine());
        rATING = Double.parseDouble(input.nextLine());
        if (rATING >= 4.7 && rATING < 5.0) {
            kUALITAS = "Best Pick";
        } else {
            if (rATING >= 4.5 && rATING < 4.7) {
                kUALITAS = "Must Read";
            } else {
                if (rATING >= 4.0 && rATING < 4.5) {
                    kUALITAS = "Recommended";
                } else {
                    if (rATING >= 3.0 && rATING < 4.0) {
                        kUALITAS = "Average";
                    } else {
                        if (rATING > 0 && rATING < 3.0) {
                            kUALITAS = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMATBUKU + "|" + toFixed(hARGAPEMBELIAN,2) + "|" + toFixed(mINIMUMMARGIN,2) + "|" + sTOK + "|" + toFixed(rATING,1) + "|" + kUALITAS);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
