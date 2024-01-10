/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rahma Dyah
 */
public class Bola {
    private double jarijari;
    
    public Bola(){
        this.jarijari = 0.0;
    }
    
    public void setJariJari(double jarijari){
        if (jarijari > 0){
            this.jarijari = jarijari;         
        }else{
            System.out.println("Jari-jari harus lebih dari 0.");
        }
        
    }
    
    public double showDiameter(){
        return 2 * jarijari;
        
    }
    
    public double showLuasPermukaan(){
      return 4 * Math.PI * Math.pow(jarijari,2);
    }
    public double showVolume(){
        return(4/3) * Math.PI * Math.pow(jarijari,3);
    }
    public static void main(String[] args) {
        //Langkah 1: Membuat variable jarijari
        double jarijarivariable = 5.0;
        
        //Langkah 2: Menciptakan objek Bola 
        Bola bolaObjek = new Bola();
        
        //Langkah 3: Memanggil method showDiameter(), showLuasPermukaan().dan showVolume()
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Diameter: " + bolaObjek.showVolume());
        
        //Langkah 4: Memanipulasi objek dengan memanggil method setJariJari()
        bolaObjek.setJariJari(jarijarivariable);
        
        //Langkah 5: Menampilkan hasil setelah manipulasi
        System.out.println("\n Setelah manipulasi");
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());
       
    }
    }

