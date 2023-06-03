package ArrayListTrial;

import java.util.ArrayList;

public class ArrayListKu {
    public static void main(String[] args) {
        ArrayList<Siswa> myStudent= new ArrayList<>();
        Siswa budi = new Siswa();
        budi.setNama("Budi");
        budi.setAbsen("2");
        budi.setEmail("budi@gmail.com");
        budi.setNis("007");
        budi.setNoWa("008123456");

        myStudent.add(budi);
        Siswa ani = new Siswa();
        ani.setNama("ani");
        ani.setAbsen("1");
        ani.setEmail("ani@gmail.com");
        ani.setNoWa("00823456787");
        ani.setNis("009");
        myStudent.add(ani);
        //update
        ani.setNama("Asti");
        ani.setNoWa("00081234567891011");
        ani.setNis("000012");
        budi.setNama("BudiSetiawan");

        //access data
      for (int i = 0; i < myStudent.size(); i++) {
            Siswa siswaku  = myStudent.get(i);
            System.out.println("Student name : " + siswaku.getNama());
            System.out.println("Student absen : " + siswaku.getAbsen());
            System.out.println("Student nis : " + siswaku.getNis());
            System.out.println("Student No Wa : " + siswaku.getNoWa());
            System.out.println("Student email : " + siswaku.getEmail());
            System.out.println("======================================");

        }
    }
}
