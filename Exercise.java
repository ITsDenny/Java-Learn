import java.util.Scanner;


class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        String name = scanner.nextLine();
        System.out.print("Jurusan : ");
        String jurusan = scanner.nextLine();
        System.out.print("NPM : ");
        String npm = scanner.nextLine();


        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setBiodata(name,jurusan,npm);

        scanner.close();

        /*
         * Cetak hasil inputan 
         */
         System.out.println("\n==========BIODATA========== \n");
         System.out.println("NPM : "+npm);
         System.out.println("Nama : "+name);
         System.out.println("Jurusan : "+jurusan);
    }
}

class Person{
    protected String name ;
    protected String jurusan;
    protected String NPM;
}

class Mahasiswa extends Person{
    /*
     * Buat Method Getter untuk akses Variabel Biodata di Class Person
     */

     public String getName() {
        return name;
     }

     public String getJurusan() {
        return jurusan;
     }
     public String getNpm() {
        return NPM;
     }

     /*
      * Buat Method Setter untuk isi value dari attribute Mahasiswa yang di akses Getter 
      */

      public void setBiodata(String Name,String Jurusan,String NPM) {
        this.name = Name;
        this.jurusan = Jurusan;
        this.NPM = NPM;
      }

}

