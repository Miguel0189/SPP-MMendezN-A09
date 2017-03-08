/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mmendez.a09;
import java.util.Scanner;
/**
 *
 * @author migue
 */
public class SppMMendezA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [][] a, b,r;
        int tamaño=  solicitaTamaño();
        
        a= crearM( "A", tamaño);
        b= crearM("B", tamaño);
        r= sumarM(a,b);
        System.out.println("La suma de las matrices es" + r);
    }

    static int[][] crearM(String dato ,int tamaño){
        Scanner kb= new Scanner(System.in);
        System.out.println("Ingresa los datos de las matrices " + dato );
                int [][] mat= new int [tamaño][tamaño];        
        for (int i=0;i<mat.length;i++){
                  for (int j=0;j<mat.length;j++){  
        mat[i][j]= solicitaEntero();}             
    }
    return mat;
    }
    static int solicitaTamaño(){
     Scanner kb= new Scanner (System.in);
        int tamano;
         boolean test;
              do {
            System.out.println("Introduce el tamaño de la matriz");
            try {
                tamano= kb.nextInt();
                test=true;}
            catch (Exception ex) {
                test=false;
                System.out.println("El dato insertado no es entero " + ex);
                tamano=kb.nextInt(); }   
        tamano= kb.nextInt();      
     } while (test == false);
        return tamano; }
    static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        int ent;
        boolean test;
        do {
            System.out.println("datos ");
            try {
                ent= kb.nextInt();
                test=true;
                 }
            catch (Exception ex) {
                test=false;
                System.out.println("El dato insertado no es entero" +ex);
                ent=kb.nextInt();     
            }   
        ent= kb.nextInt();      
     } while (test == false);
        return ent ; 
    }
   static int [][] sumarM(int[][] a,int[][] b){
       int[][]r= new int[a.length][a.length];
       for (int i=0;i<r.length;i++){
           for (int j=0;j<r.length;j++){
       r[i][j]= a[i][j]+b[i][j];}   }
       return r;
   }}

