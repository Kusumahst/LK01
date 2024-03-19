import java.util.Scanner;

class bangunDatar {
    public double panjang;
    public double lebar;

    public bangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
}

class lingkaran {
    public double jarijari;
    public double luasL;

    public lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public void luasLingkaran() {
        double luasL = Math.PI * Math.pow(jarijari, 2);
        System.out.printf("Luas Lingkaran : %.2f", luasL);
    }
}

class segiEmpat extends bangunDatar {

    public segiEmpat(double panjang, double lebar) {
        super(panjang, lebar);
    }

    public void kelilingSegiEmpat() {
        double kelilingSE = 2 * (panjang + lebar);
        System.out.printf("Keliling Segi Empat : %.2f", kelilingSE);
    }

    public void luasSegiEmpat() {
        double luasSE = panjang * lebar;
        System.out.printf("Luas Segi Empat : %.2f", luasSE);
    }

    public void diagonalSegiEmpat() {
        double diagonalSE = Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
        System.out.printf("Diagonal Segi Empat : %.2f", diagonalSE);
    }
}

public class LK01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jari-Jari Lingkaran: ");
        double jarijari = input.nextDouble();

        lingkaran lingkaran1 = new lingkaran(jarijari);
        lingkaran1.luasLingkaran();
        System.out.println();

        System.out.println("Masukkan Panjang Segi Empat: ");
        double panjang = input.nextDouble();
        System.out.println("Masukkan Lebar Segi Empat: ");
        double lebar = input.nextDouble();

        segiEmpat segiEmpat1 = new segiEmpat(panjang, lebar);
        segiEmpat1.kelilingSegiEmpat();
        System.out.println();
        segiEmpat1.luasSegiEmpat();
        System.out.println();
        segiEmpat1.diagonalSegiEmpat();
        System.out.println();
    }
}
