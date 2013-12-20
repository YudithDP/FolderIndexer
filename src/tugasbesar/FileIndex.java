package tugasbesar;

import java.io.*;
import java.util.Scanner;

public class FileIndex {

    public static void main(String[] args){
        System.out.println("masukan kata yang akan di cari: ");
        Scanner input = new Scanner(System.in);
        String cari = input.next();


        String path = "E:/20_newsgroups";
        File folder = new File(path);

        String isi[] = folder.list();

        for (int i = 0; i < isi.length; i++) {

            File folder2 = new File(path + "/" + isi[i]);

            String[] subFolder = folder2.list();

            for (int j = 0; j < subFolder.length; j++) {
                File file = new File(path + "/" + isi[i] + "/" + subFolder[j]);
                String tmp;
                try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    while ((tmp = br.readLine()) != null) {
                            String[] kata = tmp.split("\\s+");
                            for (int k = 0; k < kata.length; k++) {
                         
                           //masukkan ke dalam double linked list
                              String isiFix = kata[k];
                              String pathFix = path + "/" + isi[i] + "/" + subFolder[j]+"/";
                              DoubleLinkedList ddl = new DoubleLinkedList();
                              ddl.IsiNext(isiFix, pathFix);
                               
                              ddl.cariPath(cari);

                    }
                }} catch (IOException e) {
                   
                }

            }


        }


       
     
       
    }
}
